package com.pl.swift_codes.repository;

import com.pl.swift_codes.model.SwiftCode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SwiftCodeRepository extends JpaRepository<SwiftCode, String> {
    List<SwiftCode> findByCountryISO2Code(String countryISO2Code);
}

