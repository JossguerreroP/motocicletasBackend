package com.motorbikezone.app.web.control;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.motorbikezone.app.services.BikeService;
import com.motorbikezone.app.web.modelo.BikeDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RequestMapping("/bikes")
@RestController
public class BikeControl {
	private final   BikeService bikeService;
	
	   public BikeControl(BikeService bikeService) {
	        this.bikeService = bikeService;
	    }
	   
	   @GetMapping
	   public ResponseEntity<List<BikeDTO>> getAllBikes() {
	        return new ResponseEntity<>(bikeService.getBikes(), HttpStatus.OK);
	    }
}
