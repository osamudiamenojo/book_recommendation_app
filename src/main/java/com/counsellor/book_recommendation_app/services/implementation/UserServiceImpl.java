package com.counsellor.book_recommendation_app.services.implementation;

import com.counsellor.book_recommendation_app.entities.AppUSer;
import com.counsellor.book_recommendation_app.enums.Role;
import com.counsellor.book_recommendation_app.pojos.SignUpDto;
import com.counsellor.book_recommendation_app.repositories.AppUserRepository;
import com.counsellor.book_recommendation_app.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final AppUserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    @Override
    public String register(SignUpDto signUpDto) {
        userRepository.save(new AppUSer(signUpDto.getFirstName(),
                signUpDto.getLastName(),
                signUpDto.getEmail(),
                passwordEncoder.encode(signUpDto.getPassword()),
                Role.ROLE_USER));
        return "Registration Successful";
    }
}
