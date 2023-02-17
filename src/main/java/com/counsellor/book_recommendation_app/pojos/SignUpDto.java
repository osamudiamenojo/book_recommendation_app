package com.counsellor.book_recommendation_app.pojos;

import lombok.Data;

@Data
public class SignUpDto {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

}
