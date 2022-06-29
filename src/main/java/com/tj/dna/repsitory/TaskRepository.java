package com.tj.dna.repsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tj.dna.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

	public List<Task> findByFileFileId(Long fileId);

}
