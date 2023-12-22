package com.CodeDifferentlyApartments.maintanencerequestserver.domain.maintanenceRequest.repos;

import com.CodeDifferentlyApartments.maintanencerequestserver.domain.maintanenceRequest.models.MaintenanceRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface MaintenanceRequestRepo extends JpaRepository<MaintenanceRequest, Long> {
        Optional<MaintenanceRequest> findByEmail(String email);
    }

