package com.counsellor.book_recommendation_app.repositories;

import com.counsellor.book_recommendation_app.entities.AppUSer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface UserRepository extends JpaRepository<AppUSer, UUID> {

}
