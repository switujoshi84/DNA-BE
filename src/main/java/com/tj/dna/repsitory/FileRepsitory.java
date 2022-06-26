package com.tj.dna.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tj.dna.model.File;
import com.tj.dna.model.Task;

@Repository
public interface FileRepsitory extends JpaRepository<File, Long>{

}
