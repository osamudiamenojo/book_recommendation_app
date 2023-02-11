package com.counsellor.book_recommendation_app.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppUSer extends BaseEntity{

    private String firstName;
    private String lastName;
    private String email;
    private String password;


}
