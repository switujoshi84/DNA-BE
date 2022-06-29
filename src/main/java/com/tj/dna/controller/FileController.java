package com.tj.dna.controller;	

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.tj.dna.response.ModuleResponse;
import com.tj.dna.serviceimpl.FileServiceImpl;


@RestController
@RequestMapping("/file")
@CrossOrigin("*")
public class FileController {

	@Autowired
	FileServiceImpl fileService;
	
	@GetMapping("/")
	public
	@ResponseBody ModuleResponse findAllFiles() {
		return fileService.findAllFiles();
	}
	
}
