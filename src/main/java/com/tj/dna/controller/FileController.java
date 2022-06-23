package com.tj.dna.controller;

import javax.servlet.annotation.MultipartConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.tj.dna.response.ModuleResponse;
import com.tj.dna.serviceimpl.FileServiceImpl;
import com.tj.dna.services.FileService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/file")
public class FileController {

	@Autowired
	FileServiceImpl fileService;
	
	@PostMapping("task")
	public 
	@ResponseBody ModuleResponse uploadTaskFile(@RequestBody MultipartFile multipartFile) {
		return this.fileService.uploadTaskFile(multipartFile);
	}
}
