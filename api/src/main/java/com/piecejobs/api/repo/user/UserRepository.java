package com.piecejobs.api.repo.user;

import com.piecejobs.api.model.user.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByEmail(String email);
    boolean existsByEmail(String email);
}
