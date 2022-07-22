package com.tj.dna.serviceimpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;
import com.tj.dna.constant.AppConstant;
import com.tj.dna.dto.FileImportRequestDto;
import com.tj.dna.dto.SaveFileRequestDTO;
import com.tj.dna.model.File;
import com.tj.dna.model.Task;
import com.tj.dna.repsitory.FileRepsitory;
import com.tj.dna.response.ModuleResponse;
import com.tj.dna.services.FileService;
import com.tj.dna.utils.CopyUtil;
import com.tj.dna.utils.FileUtils;

@Service
public class FileServiceImpl implements FileService {

	@Autowired
	FileRepsitory fileRepsitory;

	@Autowired
	Gson gson;

	@Autowired
	CopyUtil copyUtil;

	@Autowired
	ModelMapper modelMapper;

	@Override
	public File saveFile(SaveFileRequestDTO saveFileRequestDTO) {
		
		File file = new File();
		file.setFileName(saveFileRequestDTO.getFileName());
		return this.fileRepsitory.save(file);
	}

	@Override
	public ModuleResponse findAllFiles() {
		List<File> files = this.fileRepsitory.findAll();
		Collections.reverse(files);
		return new ModuleResponse("200","Successfully Fetched",files);
	}
	




}
