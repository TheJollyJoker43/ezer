package me.giovannipicco.ezer.job;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity(name = "Job")
@Table(name = "job")
public class Job {

	@Id
	private Long id;
	
	@Column(
			name = "name",
			nullable = false,
			unique = true
	)
	private String name;
	
	@Column(
			name = "description",
			nullable = false
	)
	private String description;
	
}
