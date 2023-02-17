package com.counsellor.book_recommendation_app.repositories;

import com.counsellor.book_recommendation_app.entities.AppUSer;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository
public interface AppUserRepository extends JpaRepository<AppUSer, UUID> {

    Optional<AppUSer> findByEmail(String email);
}
