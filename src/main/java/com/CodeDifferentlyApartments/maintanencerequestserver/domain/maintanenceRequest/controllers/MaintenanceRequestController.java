package com.CodeDifferentlyApartments.maintanencerequestserver.domain.maintanenceRequest.controllers;

import com.CodeDifferentlyApartments.maintanencerequestserver.domain.maintanenceRequest.models.MaintenanceRequest;
import com.CodeDifferentlyApartments.maintanencerequestserver.domain.maintanenceRequest.services.MaintenanceRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



    @RestController
    @CrossOrigin
    @RequestMapping("/api/v1/maintencerequest")
    public class MaintenanceRequestController {


        private MaintenanceRequestService mainteneceRequestService;

        @Autowired
        public MaintenanceRequestController(MaintenanceRequestService maintanenceRequestService) {
            this.mainteneceRequestService = maintanenceRequestService;
        }

        @GetMapping
        public ResponseEntity<List<MaintenanceRequest>> getAll(){
            List<MaintenanceRequest> mainteneceRequests = mainteneceRequestService.getAll();
            return new ResponseEntity<>(mainteneceRequests, HttpStatus.OK);
        }

        @PostMapping
        public ResponseEntity<MaintenanceRequest> create(@RequestBody MaintenanceRequest mainteneceRequest){
            mainteneceRequest = mainteneceRequestService.create(mainteneceRequest);
            return new ResponseEntity<>(mainteneceRequest, HttpStatus.CREATED);
        }

        @GetMapping("{id}")
        public ResponseEntity<MaintenanceRequest> getById(@PathVariable("id") Long id){
           MaintenanceRequest mainteneceRequest = mainteneceRequestService.getById(id);
            return new ResponseEntity<>(mainteneceRequest, HttpStatus.OK);
        }

        @GetMapping("lookup")
        public ResponseEntity<MaintenanceRequest> getByEmail(@RequestParam String email){
            MaintenanceRequest mainteneceRequest = mainteneceRequestService.getByEmail(email);
            return new ResponseEntity<>(mainteneceRequest, HttpStatus.OK);
        }

        @PutMapping("{id}")
        public ResponseEntity<MaintenanceRequest> update(@PathVariable("id") Long id, @RequestBody MaintenanceRequest employeeDetail){
            employeeDetail = mainteneceRequestService.update(id, employeeDetail);
            return new ResponseEntity<>(employeeDetail, HttpStatus.ACCEPTED);
        }

        @DeleteMapping("{id}")
        public ResponseEntity delete(@PathVariable("id") Long id){
            mainteneceRequestService.delete(id);
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
    }


