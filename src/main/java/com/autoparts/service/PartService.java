package com.autoparts.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.autoparts.model.Part;



@Service
public class PartService {

	private static final List<Part> ALL_PARTS_LIST = new ArrayList<>();

	static {

		Part part1 = new Part();

		part1.setPartNumber("1a-234");
		part1.setName("1a-234: Oil separator");
		part1.setDescription("This is for excavators");
		part1.setInStock(true);

		ALL_PARTS_LIST.add(part1);
	}
	public List<Part> getALLparts(){
		return ALL_PARTS_LIST;
	}
	public List<Part> savePart(List<Part> requestBodyList) {
		for (Part part : requestBodyList) {
			ALL_PARTS_LIST.add(part);
		}

		System.out.println("service savePart() called...");
		return ALL_PARTS_LIST;
	}

	public List<Part> updatePart(List<Part> requestBodyList) {
		for (Part Part : requestBodyList) {
			ALL_PARTS_LIST.add(Part);
		}
		return ALL_PARTS_LIST;
	}

	public List<Part> deletePart(List<Part> requestBodyList) {
		List<Part> deletedParts = new ArrayList<>();

		for (Part partToBeDeleted : requestBodyList) {
			for (Part existingPart : ALL_PARTS_LIST) {
				if (existingPart.getPartNumber().equalsIgnoreCase(partToBeDeleted.getPartNumber())) {
					/*
					 * this part is being added for deletion, or if we tried to remove the part
					 * directly from ALL_PARTS_LIST then we will get
					 * ConcurrentModificationException.
					 */
					deletedParts.add(existingPart);
				}
			}
		}
		ALL_PARTS_LIST.removeAll(deletedParts);
		return ALL_PARTS_LIST;
	}
}