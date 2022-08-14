package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.CarService;
import com.example.demo.dto.CarDTO;

@RestController
@RequestMapping("api")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("car")
    public String getCarData() {
        return carService.getCarData();
    }

    @PostMapping("car")
    public CarDTO postCar(@RequestBody CarDTO carDTORequestBody) {
        CarDTO carDTO = new CarDTO();

        carDTO.setCarId(carDTORequestBody.getCarId());
        carDTO.setCarName(carDTORequestBody.getCarName());
        carDTO.setEngine(carDTORequestBody.getEngine());
        carDTO.setTyreType(carDTORequestBody.getTyreType());
        carDTO.setVehicleType(carDTORequestBody.getVehicleType());

        return carDTO;
    }
    
}
