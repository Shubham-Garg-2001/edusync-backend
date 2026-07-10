package com.project.edusync.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.edusync.model.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Long> {

    Optional<Address> findBySchoolId(Long schoolId);

}
