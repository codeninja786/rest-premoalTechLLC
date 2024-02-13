package com.premialtech.restwork.controller;

import com.premialtech.restwork.model.PremialTech;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/PremialTech")

public class CloudAPIService {
    PremialTech premialTech;

    @GetMapping("{vendorId}")
    public PremialTech getCloudVendorDetails(String vendorId)
    {
        return premialTech;
        //return new PremialTech("C1", "Vendor1", "Address One", "xxxxx");
    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody PremialTech premialTech)
    {
        this.premialTech = premialTech;
        return "this vendor created a reponse";
    }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody PremialTech premialTech)
    {
        this.premialTech = premialTech;
        return "this vendor created a reponse";
    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId)
    {
    this.premialTech = null;
    return "Cloud vendor Deleted Succesfully";
    }

}

