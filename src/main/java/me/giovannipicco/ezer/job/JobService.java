package me.giovannipicco.ezer.job;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Service
public class JobService {

	private final JobRepository jobRepository;
	
	public List<Job> getAllJobs(){
		return jobRepository.findAll();
	}
	
}
