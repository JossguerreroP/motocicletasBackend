package com.motorbikezone.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.motorbikezone.app.web.modelo.BikeDTO;
import java.util.ArrayList;
import java.util.List;

@Service
public class BikeServiceImlp implements BikeService {

	@Override
	public List<BikeDTO> getBikes() {
		 List<BikeDTO> bikes = new ArrayList<>();
		 bikes = this.loadBikes(bikes);
		return bikes;
	}

	
	private List<BikeDTO> loadBikes(List<BikeDTO> bikes){
		bikes.add(new BikeDTO(1, "Ninja ZX-10R", 299, 18000, "https://motorbikezone.s3.us-east-1.amazonaws.com/kawa2.jpg", "Kawasaki", "ZX-10R 2024"));
		bikes.add(new BikeDTO(2, "CBR1000RR-R Fireblade", 299, 20000, "https://motorbikezone.s3.us-east-1.amazonaws.com/FIREBLADE.jpg", "Honda", "Fireblade 2024"));
		bikes.add(new BikeDTO(3, "YZF-R1", 298, 17500, "https://motorbikezone.s3.us-east-1.amazonaws.com/OIP.jfif", "Yamaha", "R1 2023"));
		bikes.add(new BikeDTO(4, "Panigale V4", 305, 28000, "https://motorbikezone.s3.us-east-1.amazonaws.com/paningable.webp", "Ducati", "V4 2024"));
		return bikes;
	}
	
	

}
