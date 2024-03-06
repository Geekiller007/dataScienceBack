package com.jobs.job_analyzer.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jobs.job_analyzer.Entity.job;

@Service
public class jobService {

    public List<job> getJobs(){
        return List.of(new job("RCS","description", "Tunis", "Vneuron", 500));
    }
    public float analyseJob(job job){
        return (float)5.2;
    }

}
