package com.piecejobs.api.repo.user;

import com.piecejobs.api.model.user.Business;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BusinessRepository extends JpaRepository<Business, Long> {
    List<Business> findByUserId(Long userId);
}

