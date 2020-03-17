package com.rackspace.web.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rackspace.service.AssignmentService;

@RestController
@RequestMapping("/api")
public class AssignmentResource {
	@Autowired
	AssignmentService assignmentService;
	
	@GetMapping
	public ResponseEntity<String> testPracticeService() {
		return ResponseEntity.ok().body("Assignment Resource is running!");
	}
	
	@GetMapping(value="/{string}", produces="application/json")
	public ResponseEntity<String> getReverseString (
			@PathVariable("string") String string) {
		String reversedString = assignmentService.reverseString(string);
		return ResponseEntity.ok().body(reversedString);
	}
	
	@GetMapping(value="/getUniqueIntArray", produces="application/json")
	public ResponseEntity<Integer[]> getUniqueIntArray (
			@RequestParam Integer[] inArray) {
		Integer[] uniqueArray = assignmentService.getUniqueIntArray(inArray);
		return ResponseEntity.ok().body(uniqueArray);
	}

	
}
