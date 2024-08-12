package com.students.students.repository;

import com.students.students.model.Role;
import com.students.students.model.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<users,String> {

    Optional<users> findByEmail(String username);

    users findByRole(Role role);
}