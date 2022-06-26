package com.tj.dna.services;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.tj.dna.dto.FileImportRequestDto;
import com.tj.dna.dto.SaveFileRequestDTO;
import com.tj.dna.model.File;
import com.tj.dna.response.ModuleResponse;

@Component
public interface FileService {

	public File saveFile(SaveFileRequestDTO saveFileRequestDTO );

}
