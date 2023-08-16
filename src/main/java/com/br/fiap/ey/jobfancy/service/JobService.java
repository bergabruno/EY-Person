package com.br.fiap.ey.jobfancy.service;

import com.br.fiap.ey.jobfancy.model.dto.JobRequestDTO;
import com.br.fiap.ey.jobfancy.model.dto.JobResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface JobService {

    JobResponseDTO save(JobRequestDTO jobRequestDTO);

    List<JobResponseDTO> getAll();

    JobResponseDTO findById(String id);

    JobResponseDTO findByQuery(String ... args);
}
