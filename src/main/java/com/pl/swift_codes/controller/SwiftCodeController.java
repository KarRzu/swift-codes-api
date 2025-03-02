package com.pl.swift_codes.controller;

import com.pl.swift_codes.model.SwiftCode;
import com.pl.swift_codes.service.SwiftCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class SwiftCodeController {

    @Autowired
    private SwiftCodeService swiftCodeService;

    @GetMapping("/")
    public String home() {
        return "Welcome to the Swift Code API!";
    }

    @GetMapping("/{swiftCode}")
    public Optional<SwiftCode> getSwiftCode(@PathVariable String swiftCode) {
        return swiftCodeService.getSwiftCode(swiftCode);
    }

    @GetMapping("/country/{countryISO2code}")
    public List<SwiftCode> getSwiftCodesByCountry(@PathVariable String countryISO2code) {
        return swiftCodeService.getSwiftCodesByCountry(countryISO2code);
    }

    @PostMapping
    public String addSwiftCode(@RequestBody SwiftCode swiftCode) {
        swiftCodeService.addSwiftCode(swiftCode);
        return "SWIFT code added successfully";
    }

    @DeleteMapping("/{swiftCode}")
    public String deleteSwiftCode(@PathVariable String swiftCode) {
        swiftCodeService.deleteSwiftCode(swiftCode);
        return "SWIFT code deleted successfully";
    }
}