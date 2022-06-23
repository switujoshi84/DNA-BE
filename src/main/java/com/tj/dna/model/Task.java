package com.tj.dna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "task")
@Getter
@Setter
@NoArgsConstructor
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Long id;
	@Column(name = "isControl")
	Boolean isControl;
	@Column(name = "test_code")
	String testCode;
	@Column(name = "order_num")
	String orderNum;
	@Column(name = "pt_name")
	String ptName;
	@Column(name = "gender")
	String gender;
	@Column(name = "age")
	String age;
	@Column(name = "original_diagnosis")
	String originalDiagnosis;
	@Column(name = "location")
	String location;
	@Column(name = "molecular_final_results")
	String molecularFinalResults;
	@Column(name = "interpretation")
	String interpretation;
	@Column(name = "action")
	String action;
	@Column(name = "completed")
	Boolean completed;
	@Column(name = "next_action")
	String nextAction;
	@Column(name = "specimen")
	String specimen;
	@Column(name = "to_rerun")
	String toRerun;
	@Column(name = "status")
	String status;
	@Column(name = "MRN")
	String MRN;
	@Column(name = "is_parent_row")
	Boolean isParentRow;
	
}
