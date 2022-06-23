package com.tj.dna.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.tj.dna.model.Task;

public class FileUtils {

	public static List<Task> csvToTutorials(InputStream is) {
		try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
				CSVParser csvParser = new CSVParser(fileReader,
						CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {
			List<Task> tasks = new ArrayList<Task>();
			Iterable<CSVRecord> csvRecords = csvParser.getRecords();
			
			for (CSVRecord csvRecord : csvRecords) {
				System.out.println(csvRecord);
				Task task = new Task();
				task.setIsControl(true);
				task.setTestCode(csvRecord.get("Test Code"));
				task.setOrderNum(csvRecord.get("Order #"));
				task.setPtName(csvRecord.get("Pt Name"));
				task.setGender(csvRecord.get("Gender"));
				task.setAge(csvRecord.get("Age"));
				task.setOriginalDiagnosis(csvRecord.get("Original Diagnosis"));
				task.setLocation(csvRecord.get("Location"));
				task.setMolecularFinalResults(csvRecord.get("Molecular Final Results"));
				task.setInterpretation(csvRecord.get("Interpretation"));
				task.setAction(csvRecord.get("Action"));
				task.setCompleted(true);
				task.setNextAction(csvRecord.get("Next Action"));
				task.setSpecimen(csvRecord.get("Specimen"));
				task.setToRerun(csvRecord.get("To Rerun"));
				task.setStatus(csvRecord.get("Status"));
				task.setMRN(csvRecord.get("MRN"));
				task.setIsParentRow(true);
				
				tasks.add(task);
			}
			return tasks;
		} catch (IOException e) {
			throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
		}
	}
}
