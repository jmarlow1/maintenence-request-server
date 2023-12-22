package com.CodeDifferentlyApartments.maintanencerequestserver.domain.maintanenceRequest.services;

import com.CodeDifferentlyApartments.maintanencerequestserver.domain.core.exceptions.ResourceCreationException;
import com.CodeDifferentlyApartments.maintanencerequestserver.domain.core.exceptions.ResourceNotFoundException;
import com.CodeDifferentlyApartments.maintanencerequestserver.domain.maintanenceRequest.models.MaintenanceRequest;

import java.util.List;

public interface MaintenanceRequestService {

        MaintenanceRequest create(MaintenanceRequest maintenanceRequest) throws ResourceCreationException;
        MaintenanceRequest getById(Long id) throws ResourceNotFoundException;
        MaintenanceRequest getByEmail(String email) throws ResourceNotFoundException;
        List<MaintenanceRequest> getAll();
        MaintenanceRequest update(Long id, MaintenanceRequest maintenenceRequestDetail) throws ResourceNotFoundException;
        void delete(Long id);
    }

