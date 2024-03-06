package com.jobs.job_analyzer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobs.job_analyzer.Entity.job;

@Repository
public interface JobRepository  extends JpaRepository<job, Long> {

}
