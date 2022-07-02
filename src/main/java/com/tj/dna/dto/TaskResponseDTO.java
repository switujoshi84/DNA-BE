package com.tj.dna.dto;

import java.math.BigDecimal;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TaskResponseDTO {

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
	private String order;
	private String originalDiagnosis;
	private String ptName;
	private String specimen;
	private String status;
	private String testCode;
	private String toRerun;
	private String repeat;
	private String chipNumber;
	private Long fileId;
	String fileName;
	String breadChipPosition;
	String surgicalAccNum;
	String cellularity;
	Boolean duplicate;
	String tissueReviewPathologist;
	BigDecimal h20 = new BigDecimal("0.0");
	BigDecimal qubit  = new BigDecimal("0.0");
	BigDecimal dna  = new BigDecimal("0.0");
	BigDecimal totalRNA  = new BigDecimal("0.0");
	Boolean processed;
}
