package com.premialtech.restwork.service;

import com.premialtech.restwork.model.PremialTech;

import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor(PremialTech premialTech);
    public String UpdateCloudVendor(PremialTech premialTech);
    public PremialTech getPremialTech(String cloudVendorId);
    public List<PremialTech> getAllCloudVendors();
}
