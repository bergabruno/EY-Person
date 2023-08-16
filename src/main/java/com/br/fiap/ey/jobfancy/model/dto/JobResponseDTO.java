package com.br.fiap.ey.jobfancy.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@AllArgsConstructor
@Data
@NoArgsConstructor
public class JobResponseDTO{

    private String jobId;

    private String enterprise;

    private String jobTitle;

    private String jobDescription;

    private String area;

    private LocationDTO location;

    private String requirements;

    private String modelType;

    private List<String> stages;
}
