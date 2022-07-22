package com.tj.dna.repsitory;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tj.dna.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

	public List<Task> findByFileFileId(Long fileId);

	@Transactional()
	public void deleteByFileFileId(Long fileId);

	@Modifying
	@Transactional()	
	@Query(value = "update task set processed = 1 where id = :id ", nativeQuery = true )
	public void updateProcessedById(@Param("id") Long id);
}
