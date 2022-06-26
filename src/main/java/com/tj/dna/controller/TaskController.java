package com.tj.dna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.tj.dna.dto.FileImportRequestDto;
import com.tj.dna.response.ModuleResponse;
import com.tj.dna.serviceimpl.TaskListServiceImpl;

@Controller
@RequestMapping("task")
@CrossOrigin("*")
public class TaskController {

	@Autowired
	TaskListServiceImpl  listService;
	
	
	@PostMapping("sample-matrix")
	public
	@ResponseBody ModuleResponse uploadTaskListFileDetail(@RequestBody List<FileImportRequestDto> fileImportRequestDtos) {
		return this.listService.uploadTaskListFileDetail(fileImportRequestDtos);
	} 
	
	@PostMapping("task")
	public 
	@ResponseBody ModuleResponse uploadTaskFile(@RequestBody MultipartFile multipartFile) {
		return this.listService.uploadTaskFile(multipartFile);
	}
}
