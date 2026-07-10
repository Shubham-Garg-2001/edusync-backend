package com.project.edusync.repository;

import java.util.Optional;

import com.project.edusync.model.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepo extends JpaRepository<School, Long> {
    Optional<School> findBySubDomain(String subDomain);
}
