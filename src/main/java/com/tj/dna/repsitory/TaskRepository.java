package com.tj.dna.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tj.dna.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
