package me.giovannipicco.ezer.shift;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import me.giovannipicco.ezer.customer.Customer;
import me.giovannipicco.ezer.employee.Employee;
import me.giovannipicco.ezer.job.Job;

@Data
@Entity(name = "Shift")
@Table(name = "shift")
public class Shift {
	
	@Id
	private Long id;
	
	@Column(
			name = "start_time",
			nullable = false
	)
	private LocalDateTime startTime;
	
	@Column(
			name = "end_time",
			nullable = false
	)
	private LocalDateTime endTime;
	
	@OneToOne
	private Employee employee;
	
	@OneToOne
	private Customer customer;
	
	@OneToOne
	private Job job;

}
