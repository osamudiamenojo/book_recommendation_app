package com.counsellor.book_recommendation_app.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reviews extends BaseEntity {
    private UUID user_id; // (foreign key to User table)
    private UUID book_id; //(foreign key to Book table)
    private Integer rating; // (1-5)
    private String comment;
}
