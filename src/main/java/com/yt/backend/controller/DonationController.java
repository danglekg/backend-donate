package com.yt.backend.controller;



import com.yt.backend.model.Donation;
import com.yt.backend.service.DonationService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/donations")
@CrossOrigin(origins = "*")
public class DonationController {
    private final DonationService donationService;

    public DonationController(DonationService donationService) {
        this.donationService = donationService;
    }

    @GetMapping
    public List<Donation> getAllDonations() {
        return donationService.getAllDonations();
    }

    @PostMapping
    public Donation donate(@RequestBody Donation donation) {
        return donationService.saveDonation(donation);
    }

    @GetMapping("/total")
    public BigDecimal getTotalDonations() {
        return donationService.getTotalDonations();
    }
}