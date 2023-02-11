package com.counsellor.book_recommendation_app.entities;

import jakarta.persistence.Entity;

import lombok.*;

import java.util.Date;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book extends BaseEntity{
    private String title;
    private String author;
    private String description;
    private Date publicationDate;
    private String coverImageUrl;
    //private Map<String, String> reviews;
    //TODO Add relationships to other tables



}
