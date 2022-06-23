package com.tj.dna.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.tj.dna.response.ModuleResponse;

@Component
public interface FileService {
	public ModuleResponse uploadTaskFile(MultipartFile multipartFile);
}
