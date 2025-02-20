package com.yt.backend.service;


import com.yt.backend.model.Donation;
import com.yt.backend.repository.DonationRepository;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.List;

@Service
public class DonationService {
    private final DonationRepository donationRepository;

    public DonationService(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    public List<Donation> getAllDonations() {
        return donationRepository.findAll();
    }

    public Donation saveDonation(Donation donation) {
        return donationRepository.save(donation);
    }

    public BigDecimal getTotalDonations() {
        return donationRepository.getTotalDonations();
    }
}