package com.counsellor.book_recommendation_app.configurations.security;

import com.counsellor.book_recommendation_app.entities.AppUSer;
import com.counsellor.book_recommendation_app.exceptions.UserNotFoundException;
import com.counsellor.book_recommendation_app.repositories.AppUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class AppUserDetails implements UserDetailsService {
    private final AppUserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        AppUSer appUser = userRepository.findByEmail(email).orElseThrow(()->
                new UserNotFoundException("user with email: "+ email + "does not exist"));
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(appUser.getRole().toString()));

        return new User(appUser.getEmail(), appUser.getEmail(),authorities);
    }
}
