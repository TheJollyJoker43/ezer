package me.giovannipicco.ezer.shift;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Service
public class ShiftService {

	private final ShiftRepository shiftRepository;
	
	public List<Shift> getAllShifts(){
		return shiftRepository.findAll();
	}
	
}
