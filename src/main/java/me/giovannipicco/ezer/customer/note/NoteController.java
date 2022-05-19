package me.giovannipicco.ezer.customer.note;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@Data
@RestController
@RequestMapping("api/ezer/v1/customer/note")
public class NoteController {
	
	private final NoteService noteService;
	
	@GetMapping("all")
	public List<Note> getAllNote(){
		return noteService.getAllNotes();
	}
	
	
}
