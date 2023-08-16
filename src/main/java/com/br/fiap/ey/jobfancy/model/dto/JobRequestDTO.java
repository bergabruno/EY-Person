package com.br.fiap.ey.jobfancy.model.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "tb_job")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class JobRequestDTO {

    @Id
    private String id;

    @NotBlank
    private String enterprise;

    @NotBlank
    private String jobTitle;

    @NotBlank
    private String jobDescription;

    @NotBlank
    private String area;

    @Valid
    private LocationDTO location;

    @NotBlank
    private String requirements;

    @NotBlank
    private String modelType;

    @NotNull
    private List<String> stages;
}
