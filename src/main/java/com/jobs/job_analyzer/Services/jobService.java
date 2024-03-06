package com.jobs.job_analyzer.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jobs.job_analyzer.Entity.job;

@Service
public class jobService {

    public List<job> getJobs(){
        return ;
    }
    public job analyseJob(job job){
        float score;
        score = 30;
        job.setScore(score);
        return job;
    }

}
