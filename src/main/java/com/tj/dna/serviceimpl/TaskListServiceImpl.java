package com.tj.dna.serviceimpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;
import com.tj.dna.constant.AppConstant;
import com.tj.dna.dto.FileImportRequestDto;
import com.tj.dna.dto.SaveFileRequestDTO;
import com.tj.dna.dto.TaskResponseDTO;
import com.tj.dna.model.File;
import com.tj.dna.model.Task;
import com.tj.dna.repsitory.TaskRepository;
import com.tj.dna.response.ModuleResponse;
import com.tj.dna.utils.CopyUtil;
import com.tj.dna.utils.FileUtils;

@Service
public class TaskListServiceImpl {

	@Autowired
	Gson gson;

	@Autowired
	CopyUtil copyUtil;

	@Autowired
	ModelMapper modelMapper;

	@Autowired
	TaskRepository taskRepository;

	@Autowired
	FileServiceImpl fileService;

	public ModuleResponse uploadTaskListFileDetail(List<FileImportRequestDto> fileImportRequestDtos) {

		List<FileImportRequestDto> newList = new ArrayList<FileImportRequestDto>(0);
		if (fileImportRequestDtos.size() > 0) {
			for (FileImportRequestDto dto : fileImportRequestDtos) {
				File file = fileService.saveFile(new SaveFileRequestDTO(dto.getChipNumber()));
				if (file == null) {
					throw new HttpClientErrorException(HttpStatus.INTERNAL_SERVER_ERROR, "Error While Saving File");
				}
				if (dto.getRepeat().equals(AppConstant.OPTION_1)) {
					String MRN = dto.getMRN();
					dto.setMRN(MRN + "_A");
					dto.setFileId(file.getFileId());
					newList.add(this.copyUtil.copyFileImportDTO(dto));
					dto.setMRN(MRN + "_B");
					newList.add(this.copyUtil.copyFileImportDTO(dto));
				} else {
					dto.setFileId(file.getFileId());
					newList.add(this.copyUtil.copyFileImportDTO(dto));
				}
			}

		}

		Task[] taskDomain = null;
		taskDomain = modelMapper.map(newList, Task[].class);
		List<Task> taskDomains = Arrays.asList(taskDomain);
		taskDomains.forEach(d -> {
			d.setId(null);
		});
		this.taskRepository.saveAll(taskDomains);
		return new ModuleResponse(HttpStatus.OK.value(), "Sucessfully Saved");
	}

	public ModuleResponse uploadTaskFile(MultipartFile multipartFile) {
		try {
			List<Task> tasks = FileUtils.csvToTutorials(multipartFile.getInputStream());
			if (tasks.size() > 0) {
				this.taskRepository.saveAll(tasks);
			} else {

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public ModuleResponse findTaskByFileId(Long fileId) {
		List<Task> taskList = this.taskRepository.findByFileFileId(fileId);
		ModelMapper mapper = new ModelMapper();
		TaskResponseDTO[] list = mapper.map(taskList, TaskResponseDTO[].class);
		return new ModuleResponse("200","Fetched Sucessfully",list);

//		modelMapper.addMappings(new PropertyMap<List<Task>, TaskResponseDTO[]>() {
//			@Override
//			protected void configure() {
//				sour
//			}
//		});
	}

}
