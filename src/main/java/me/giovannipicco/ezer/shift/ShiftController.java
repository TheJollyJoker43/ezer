package me.giovannipicco.ezer.shift;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@Data
@RestController
@RequestMapping("api/ezer/v1/shift")
public class ShiftController {
	
	private final ShiftService shiftService;
	
	@GetMapping("all")
	public List<Shift> getAllShifts(){
		return shiftService.getAllShifts();
	}

}
