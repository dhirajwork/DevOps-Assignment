package com.devops.hotelreservation.assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HotelReservationController {

    @GetMapping("/")
    public String homePage() {
        return "home-page";
    }
}
