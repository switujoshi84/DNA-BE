package com.tj.dna.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
	@Getter
@Setter
public class FileImportRequestDto {

	@JsonProperty("MRN")
	private String MRN;
	private String action;
	private String age;
	private String completed;
	private String gender;
	private String interpretation;
	private String isControl;
	private String isParentRow;
	private String location;
	private String molecularFinalResults;
	private String nextAction;
	private String orderNum;
	private String originalDiagnosis;
	private String ptName;
	private String specimen;
	private String status;
	private String testCode;
	private String tissueReviewPathologist;
	private String toRerun;
	private Double cellularity;
	private String repeat;
	private Boolean duplicate;
	private String chipNumber;
	private Long fileId;

}
