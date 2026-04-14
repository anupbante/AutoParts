package com.autoparts.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("parts")
public class PartsController {

	private List<String> allPartsList = List.of("1a-234", "2b-2343", "1c-8989");

    @GetMapping("all")
    private List<String> getAllParts() {
        return allPartsList;
    }
    
    /**
     * This API will return a part number when searched with full part number.
     * 
     * @param partNumberString
     * @return 
     */
    @GetMapping("getPart")
    private String getPart(@RequestParam(name = "partNumber") String partNumberString) {
    	if(allPartsList.contains(partNumberString)) {
    		return allPartsList.get(allPartsList.indexOf(partNumberString));
    	} else {
    		return "Part not found!";
    	}
    }
    
    @GetMapping("searchPart")
    private List<String> searchPart(@RequestParam(name = "searchPartNumber") String searchPart) {
    	List<String> filteredPartList = new ArrayList<>();
    	
    	for (String part : allPartsList) {
			if(part.contains(searchPart)) {
				filteredPartList.add(part);
			}
		}
    	return filteredPartList;
    }
    
    
}