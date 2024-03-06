package com.jobs.job_analyzer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobs.job_analyzer.Entity.job;
import com.jobs.job_analyzer.Repository.JobRepository;
import com.jobs.job_analyzer.Services.jobService;

@RestController
@RequestMapping("/job/")
public class jobController {
    private final jobService jobService;
    private final JobRepository jobRepository;
    
    @Autowired
    
    @GetMapping
    public List<job> getJobs(){
        return jobService.getJobs();
    }
    public jobController(com.jobs.job_analyzer.Services.jobService jobService, JobRepository jobRepository) {
        this.jobService = jobService;
        this.jobRepository = jobRepository;
    }
    @SuppressWarnings("null")
    @PostMapping("/analyseJob")
    public float AnalyseJob(@RequestBody job requestData){
        jobRepository.save(requestData);
        return (float)50;
    }
}
