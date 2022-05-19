package me.giovannipicco.ezer.customer;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Email;

import lombok.Data;
import me.giovannipicco.ezer.customer.note.Note;

@Data
@Entity(name = "Customer")
@Table(name = "customer")
public class Customer{
	
	@Id
	private Long id;
	
	@Column(
            name = "full_name",
            nullable = false
	)
	private String fullName;
   
    @Column(
    		name = "email",
    		nullable = false
    )
    @Email
    private String email;
    
    @Column(
    		name = "phone",
    		nullable = false    		
    )
    private String phone;
	
    @OneToMany(
    		mappedBy = "customer",
    		orphanRemoval = true,
    		cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
    		fetch = FetchType.LAZY
    )
	private List<Note> notes;
	
}
