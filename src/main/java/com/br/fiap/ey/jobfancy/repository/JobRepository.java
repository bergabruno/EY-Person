package com.br.fiap.ey.jobfancy.repository;

import com.br.fiap.ey.jobfancy.model.dto.JobRequestDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface JobRepository extends MongoRepository<JobRequestDTO, String> {

    boolean existsById(String id);

    Optional<JobRequestDTO> findById(String id);

    List<Optional<JobRequestDTO>> findAllByArea(String area);

}
