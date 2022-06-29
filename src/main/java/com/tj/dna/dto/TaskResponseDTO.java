package com.tj.dna.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TaskResponseDTO {


	Long id;
	Boolean isControl;
	String testCode;
	String orderNum;
	String ptName;
	String gender;
	String age;
	String originalDiagnosis;
	String location;
	String molecularFinalResults;
	String interpretation;
	String action;
	Boolean completed;
	String nextAction;
	String specimen;
	String toRerun;
	String status;
	String MRN;
	Boolean isParentRow;
	Long fileId;
	String fileName;
}
