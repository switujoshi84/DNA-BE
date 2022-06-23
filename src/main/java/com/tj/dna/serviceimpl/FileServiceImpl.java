package com.tj.dna.serviceimpl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.tj.dna.model.Task;
import com.tj.dna.repsitory.FileRepsitory;
import com.tj.dna.response.ModuleResponse;
import com.tj.dna.services.FileService;
import com.tj.dna.utils.FileUtils;



@Service
public class FileServiceImpl implements FileService {

	@Autowired
	FileRepsitory fileRepsitory;
	
	@Override
	public ModuleResponse uploadTaskFile(MultipartFile multipartFile) {
		try {
			List<Task> tasks =  FileUtils.csvToTutorials(multipartFile.getInputStream());
			if(tasks.size()>0) {
				this.fileRepsitory.saveAll(tasks);
			}
			else {
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
