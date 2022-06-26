package com.tj.dna.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.tj.dna.dto.FileImportRequestDto;

@Component
public class CopyUtil {

	@Autowired
	Gson gson;
	
	public FileImportRequestDto copyFileImportDTO(FileImportRequestDto copyFrom) {
		 return gson.fromJson(gson.toJson(copyFrom), FileImportRequestDto.class);
	}
}
