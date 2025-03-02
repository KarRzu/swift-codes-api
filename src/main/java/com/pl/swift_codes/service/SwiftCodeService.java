package com.pl.swift_codes.service;

import com.pl.swift_codes.model.SwiftCode;
import com.pl.swift_codes.repository.SwiftCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SwiftCodeService {
    @Autowired
    private SwiftCodeRepository swiftCodeRepository;

    public Optional<SwiftCode> getSwiftCode(String swiftCode) {
        return swiftCodeRepository.findById(swiftCode);
    }

    public List<SwiftCode> getSwiftCodesByCountry(String countryISO2Code) {
        return swiftCodeRepository.findByCountryISO2Code(countryISO2Code);
    }

    public SwiftCode addSwiftCode(SwiftCode swiftCode) {
        return swiftCodeRepository.save(swiftCode);
    }

    public void deleteSwiftCode(String swiftCode) {
        swiftCodeRepository.deleteById(swiftCode);
    }
}
