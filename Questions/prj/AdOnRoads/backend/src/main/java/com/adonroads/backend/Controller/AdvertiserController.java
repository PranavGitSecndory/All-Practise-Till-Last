package com.adonroads.backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/advertiser")
public class AdvertiserController {

    @GetMapping("/dashboard")
    public String dashboard() {
        return "Advertiser Dashboard API working all goes right";
    }
}
