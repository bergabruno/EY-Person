package com.br.fiap.ey.jobfancy.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class JobResponseDTO{
    private String jobId;
    private String enterprise;
    private String jobTitle;
    private String jobDescription;
    private String area;
    private LocationDTO location;
    private String requirements;
    private String modelType;
}
