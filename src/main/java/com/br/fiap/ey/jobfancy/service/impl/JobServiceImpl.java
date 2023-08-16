package com.br.fiap.ey.jobfancy.service.impl;

import com.br.fiap.ey.jobfancy.model.dto.JobRequestDTO;
import com.br.fiap.ey.jobfancy.model.dto.JobResponseDTO;
import com.br.fiap.ey.jobfancy.repository.JobRepository;
import com.br.fiap.ey.jobfancy.service.JobService;
import com.br.fiap.ey.jobfancy.util.ConvertValuesUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobServiceImpl implements JobService {

    private final JobRepository jobRepository;

    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public JobResponseDTO save(JobRequestDTO jobRequestDTO) {
        jobRequestDTO = jobRepository.save(jobRequestDTO);

        return ConvertValuesUtil.convertToResponse(jobRequestDTO);
    }

    @Override
    public List<JobResponseDTO> getAll() {
        List<JobRequestDTO> requestDTOList = jobRepository.findAll();

        if (requestDTOList.isEmpty()) {
            throw new RuntimeException("Nao existe vagas");
        }

        return ConvertValuesUtil.convertToResponse(requestDTOList);
    }

    @Override
    public JobResponseDTO findById(String id) {
        if (!jobRepository.existsById(id)) {
            throw new RuntimeException("Nao existe vaga com esse id");
        }

        Optional<JobRequestDTO> jobRequestDTO = jobRepository.findById(id);

        if (jobRequestDTO.isPresent()) {
            return ConvertValuesUtil.convertToResponse(jobRequestDTO.get());
        }

        throw new RuntimeException("Erro ao localizar vaga");
    }

    @Override
    public JobResponseDTO findByQuery(String... args) {
        return null;
    }
}
