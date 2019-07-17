package com.tw.apistackbase.api;

import com.tw.apistackbase.core.Company;
import com.tw.apistackbase.repository.CompanyRepository;
import com.tw.apistackbase.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyResource {
    @Autowired
    CompanyRepository companyRepository;
    @Autowired
    ProfileRepository profileRepository;
    @GetMapping(produces = {"application/json"})
    public Iterable<Company> list() {

        return companyRepository.findAll();
    }
    
    @PostMapping(produces = {"application/json"})
    public Company add(@RequestBody Company company) {
       companyRepository.save(company);
        //companyList.add(company);
        return company;
    }
}
