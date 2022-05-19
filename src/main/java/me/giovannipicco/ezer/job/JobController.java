package me.giovannipicco.ezer.job;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@Data
@RestController
@RequestMapping("api/ezer/v1/job")
public class JobController {
	
	private final JobService jobService;
	
	@GetMapping("all")
	public List<Job> getAllJobs(){
		return jobService.getAllJobs();
	}

}
