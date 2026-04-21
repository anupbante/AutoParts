package com.autoparts.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("parts/v2")
public class PartsController2 {

	private static final List<String> ALL_PARTS_LIST = new ArrayList<>();

	static {
		ALL_PARTS_LIST.add("1a-234");
		ALL_PARTS_LIST.add("2b-2343");
		ALL_PARTS_LIST.add("1c-8989");
	}
	
    @GetMapping
    private List<String> getAllParts() {
        return ALL_PARTS_LIST;
    }
    
    /**
     * This API will return a part number when searched with full part number.
     * 
     * @param partNumberString
     * @return 
     */
    @GetMapping("{partNumber}")
    private String getPart(@PathVariable("partNumber") String partNumberString) {
    	if(ALL_PARTS_LIST.contains(partNumberString)) {
    		return ALL_PARTS_LIST.get(ALL_PARTS_LIST.indexOf(partNumberString));
    	} else {
    		return "Part not found!";
    	}
    }
    
    @PostMapping
    private ResponseEntity<?> savePart(@RequestBody List<Map<String, String>> requestBodyList) throws Exception {
    
    	for (Map<String,String> partMap : requestBodyList) {
    		ALL_PARTS_LIST.add(partMap.get("partNumber"));
		}
    	
    	return ResponseEntity.ok(ALL_PARTS_LIST);
    }
    
    @PutMapping
    private ResponseEntity<?> updatePart(@RequestBody List<Map<String, String>> requestBodyList) throws Exception {
    
    	// update logic 
    	return ResponseEntity.ok("records updated !" );
    }
    
    @DeleteMapping
    private ResponseEntity<?> deletePart(@RequestBody List<String> partsToBeDeletedList) throws Exception {
        
    	ALL_PARTS_LIST.removeAll(partsToBeDeletedList);
    	
    	return ResponseEntity.ok(ALL_PARTS_LIST);
    }
    
    
}