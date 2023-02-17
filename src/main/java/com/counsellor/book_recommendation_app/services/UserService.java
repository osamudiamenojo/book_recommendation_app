package com.counsellor.book_recommendation_app.services;

import com.counsellor.book_recommendation_app.pojos.SignUpDto;
import com.counsellor.book_recommendation_app.pojos.UserDto;

public interface UserService {
    String register(SignUpDto signUpDto);
}
