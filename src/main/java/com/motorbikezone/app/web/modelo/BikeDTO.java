package com.motorbikezone.app.web.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
@AllArgsConstructor
@Builder
public class BikeDTO {
	private int id;
    private String name;
    private int maxSpeed;
    private int price;
    private String imageUrl;
    private String brand;
    private String model;
}
