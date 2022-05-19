package me.giovannipicco.ezer.customer.note;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;
import me.giovannipicco.ezer.customer.Customer;

@Data
@Entity(name = "Note")
@Table(name = "note")
public class Note {
	
	@Id
	private Long id;
	
	@ManyToOne
	@MapsId("customer_id")
	@JoinColumn(
			name = "customer_id",
			foreignKey = @ForeignKey(
				name = "note_customer_id_fk"
			)
	)
	@JsonBackReference
	private Customer customer;
	
	@Column(
            name = "description",
            nullable = false
	)
	private String description;
	
	@Column(
            name = "create_date",
            nullable = false
	)
	private LocalDateTime createDate;

}
