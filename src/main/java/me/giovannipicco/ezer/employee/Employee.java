package me.giovannipicco.ezer.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity(name = "Employee")
@Table(name = "employee")
public class Employee {

	@Id
	private Long id;
	
	@Column(
			name = "first_name",
			nullable = false
	)
	private String fistName;
	
	@Column(
			name = "last_name",
			nullable = false
	)
	private String lastName;
	
	@Column(
			name = "email",
			nullable = false
	)
	private String email;
	
	@Column(
			name = "phone",
			nullable = false
	)
	private String phone;
	
	@Column(
			name = "role",
			nullable = false
	)
	@Enumerated(EnumType.STRING)
	private Role role;
	
	@Column(
			name = "password",
			nullable = false
	)
	@JsonIgnore
	private String password;
	
}
