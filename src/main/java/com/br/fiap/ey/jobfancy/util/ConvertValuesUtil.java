package com.br.fiap.ey.jobfancy.util;

import com.br.fiap.ey.jobfancy.model.dto.JobRequestDTO;
import com.br.fiap.ey.jobfancy.model.dto.JobResponseDTO;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class ConvertValuesUtil {

    public static JobResponseDTO convertToResponse(JobRequestDTO jobRequestDTO) {
        ModelMapper modelMapper = new ModelMapper();

        return modelMapper.map(jobRequestDTO, JobResponseDTO.class);
    }

    public static List<JobResponseDTO> convertToResponse(List<JobRequestDTO> source) {
        ModelMapper modelMapper = new ModelMapper();
        List<JobResponseDTO> targetList = new ArrayList<>();
        for (JobRequestDTO item : source) {
            targetList.add(modelMapper.map(item, JobResponseDTO.class));
        }
        return targetList;
    }


}
