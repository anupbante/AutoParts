package com.autoparts.controller;

import com.autoparts.model.Medicine;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("medicines")
public class MedicineController {
    private static final List<String> ALL_MEDICINE_LIST = new ArrayList<>();

    static {
      //  ALL_MEDICINE_LIST.add("Paracetamol-500mg");
    //    ALL_MEDICINE_LIST.add("ORS-30g");
      //  ALL_MEDICINE_LIST.add("Coughq-200mg");
        Medicine medicine1 = new Medicine();

        medicine1.setMedicineNumber("221");
        medicine1.setName("ors powder");
        medicine1.setManufacturer("cipla");
        medicine1.setInStock(true);

        ALL_MEDICINE_LIST.add(String.valueOf(medicine1));
    }

    @GetMapping("{medicineNumber}")
    private String getMedicine(@PathVariable("medicineNumber") String medicineNumberString) {
        if (ALL_MEDICINE_LIST.contains(medicineNumberString)) {

            return null;
        } else {

            return "medicine not found!";
        }
    }

    @PostMapping
    private ResponseEntity<?> saveMedicine(@RequestBody List<Medicine> requestBodyList) throws Exception {

        for (Medicine medicine : requestBodyList) {
            ALL_MEDICINE_LIST.add(String.valueOf(medicine));
        }

        return ResponseEntity.ok(ALL_MEDICINE_LIST);
    }

    @PutMapping
    private ResponseEntity<?> updateMedicine(@RequestBody List<Map<String, String>> requestBodyList) throws Exception {

        return ResponseEntity.ok("records updated !" );
    }

    @DeleteMapping
    private ResponseEntity<?> deleteMedicine(@RequestBody List<String> medicineToBeDeletedList) throws Exception {

        ALL_MEDICINE_LIST.removeAll(medicineToBeDeletedList);

        return ResponseEntity.ok(ALL_MEDICINE_LIST);
    }
}



