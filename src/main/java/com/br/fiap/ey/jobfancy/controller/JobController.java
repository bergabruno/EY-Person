package com.br.fiap.ey.jobfancy.controller;

import com.br.fiap.ey.jobfancy.model.dto.JobResponseDTO;
import com.br.fiap.ey.jobfancy.model.dto.LocationDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JobController {

    @GetMapping
    public ResponseEntity<List<JobResponseDTO>> getAllJobs(){
        List<JobResponseDTO> list = new ArrayList<>();
        list.add(new JobResponseDTO("232132", "Google", "Desenvolvedor de Software", "aaa", "aaaa", new LocationDTO("Sao Paulo", "Brazil", "Sao Paulo", "Rua Lins"), "Muita coisa", "Hibrido"));

        JobResponseDTO jobResponseDTO = list.get(0);

        return ResponseEntity.ok(list);
    }
}
