package com.tj.dna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tj.dna.response.ModuleResponse;
import com.tj.dna.serviceimpl.ScriptServiceImpl;

@Controller
@RequestMapping("/script")
public class ScriptController {

	@Autowired
	ScriptServiceImpl scriptService;
	
	@GetMapping("python/{id}")
	public ModuleResponse postPythonScript(@PathVariable("id") Long fileId ) throws Exception {
		return this.scriptService.postPythonScript(fileId);
	}
}
