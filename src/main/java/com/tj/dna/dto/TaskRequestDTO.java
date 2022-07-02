package com.tj.dna.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TaskRequestDTO {

	Long id;
	Boolean isControl;
	String testCode;
	@JsonProperty("order")
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
	@JsonProperty("MRN")
	String MRN;
	Boolean isParentRow;
	Long fileId;
	String fileName;
	String breadChipPosition;
	String surgicalAccNum;
	String cellularity;
	Boolean duplicate;
	String tissueReviewPathologist;
	BigDecimal h20;
	BigDecimal qubit;
	BigDecimal dna;
	@JsonProperty("totalRNA")
	BigDecimal totalRNA;
	Boolean processed;
}
