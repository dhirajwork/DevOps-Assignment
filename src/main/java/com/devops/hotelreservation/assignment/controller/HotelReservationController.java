package com.devops.hotelreservation.assignment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelReservationController {

    @GetMapping("/")
    public String homePage() {
        return "Home page.";
    }
}
