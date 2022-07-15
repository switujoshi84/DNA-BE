package com.tj.dna.serviceimpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.tj.dna.dto.RunPythonScriptDTO;
import com.tj.dna.dto.TaskResponseDTO;
import com.tj.dna.response.ModuleResponse;

@Service
public class ScriptServiceImpl {

	@Autowired
	TaskListServiceImpl taskListService;

	public ModuleResponse postPythonScript(Long fileId) throws Exception {

		Process process = null;
		try {
			List<TaskResponseDTO> taskList = this.taskListService.findTasksByFileId(fileId);
			for (TaskResponseDTO task : taskList) {
				String script = "python U:\\MDL-NGS\\DNAMethlylation\\Brain\\scripts\\unzipUsingPython.py "
						+ task.getChipNumber() + " " + task.getBreadChipPosition() + " " + task.getMRN();
				process = Runtime.getRuntime().exec(script);
				this.taskListService.updateTaskList(task.getId());
			}
			return new ModuleResponse("200", "Updated Sucessfully",taskList);
		} catch (Exception e) {
			throw e;
		}
	}
}
