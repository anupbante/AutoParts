package com.autoparts.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autoparts.model.Part;
import com.autoparts.service.PartService;

@RestController
@RequestMapping("parts/v2")
public class PartsController2 {

	private static final List<Part> ALL_PARTS_LIST = new ArrayList<>();
	
	@Autowired
	private PartService partService;

	static {
//		ALL_PARTS_LIST.add("1a-234");
//		ALL_PARTS_LIST.add("2b-2343");
//		ALL_PARTS_LIST.add("1c-8989");
		
		Part part1 = new Part();
		
		part1.setPartNumber("1a-234");
		part1.setName("1a-234: Oil separator");
		part1.setDescription("This is for excavators");
		part1.setInStock(true);
		
		ALL_PARTS_LIST.add(part1);
	}
	
    @GetMapping
    private List<Part> getAllParts() {
        return partService.getALLparts();
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
    		//return ALL_PARTS_LIST.get(ALL_PARTS_LIST.indexOf(partNumberString));
    		return null;
    	} else {
    		return "Part not found!";
    	}
    }
    
   /* @PostMapping
    private ResponseEntity<?> savePart(@RequestBody List<Map<String, String>> requestBodyList) throws Exception {
    
    	for (Map<String,String> partMap : requestBodyList) {
    		ALL_PARTS_LIST.add(partMap.get("partNumber"));
		}
    	
    	return ResponseEntity.ok(ALL_PARTS_LIST);
    }
    */
    
    @PostMapping
    private ResponseEntity<?> savePart(@RequestBody List<Part> requestBodyList) throws Exception {
    	
    	List<Part> savedPartList = partService.savePart(requestBodyList);
    	
    	return ResponseEntity.ok(savedPartList);
    }
    
    @PutMapping
    private ResponseEntity<?> updatePart(@RequestBody List<Part> requestBodyList) throws Exception {

		List<Part> updatedPartList = partService.updatePart(requestBodyList);
    	return ResponseEntity.ok(updatedPartList );
    }

    @DeleteMapping
    private ResponseEntity<?> deletePart(@RequestBody List<Part> partsToBeDeletedList) throws Exception {


    	List<Part> deletedParts = partService.deletePart(partsToBeDeletedList);
    	
    	return ResponseEntity.ok(deletedParts);
    }
    
    
}