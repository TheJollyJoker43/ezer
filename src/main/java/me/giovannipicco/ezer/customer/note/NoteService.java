package me.giovannipicco.ezer.customer.note;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Service
public class NoteService {

	private final NoteRepository noteRepository;
	
	public List<Note> getAllNotes(){
		return noteRepository.findAll();
	}
	
}
