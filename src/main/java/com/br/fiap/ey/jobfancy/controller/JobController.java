package com.br.fiap.ey.jobfancy.controller;

import com.br.fiap.ey.jobfancy.model.dto.JobResponseDTO;
import com.br.fiap.ey.jobfancy.model.dto.LocationDTO;
import com.br.fiap.ey.jobfancy.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobController {

    private final JobService jobService;

    public JobController(JobService jobService){
        this.jobService = jobService;
    }

    @GetMapping
    public ResponseEntity<List<JobResponseDTO>> getAll(){
        return new ResponseEntity<>(jobService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobResponseDTO> findById(@PathVariable String id){
        return ResponseEntity.ok(jobService.findById(id));
    }
}
