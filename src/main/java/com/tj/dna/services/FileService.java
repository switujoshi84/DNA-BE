package com.tj.dna.services;


import org.springframework.stereotype.Component;
import com.tj.dna.dto.SaveFileRequestDTO;
import com.tj.dna.model.File;
import com.tj.dna.response.ModuleResponse;

@Component
public interface FileService {

	public File saveFile(SaveFileRequestDTO saveFileRequestDTO );
	public ModuleResponse findAllFiles();
}
