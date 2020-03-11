package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Lead;
import com.example.demo.service.LeadService;

/**
 * Lead Controller to handle Lead CRUD operations
 */
@RestController
public class LeadController
{
    @Autowired
    private LeadService leadService;

    @PostMapping("/leads")
    public Lead create(@RequestBody Lead lead)
    {
        Lead p = leadService.create(lead);
        return p;
    }

    @GetMapping("/leads/{id}")
    public Lead getLead(@PathVariable String id)
    {
        return leadService.get(id);
    }

    @GetMapping("/leads")
    public List<Lead> getLeads()
    {
        return leadService.getAll();
    }

    @GetMapping("/leads/search")
    public List<Lead> getFilteredLeads(@RequestParam String startDate, @RequestParam String endDate)
    {
        return leadService.getFilteredLeads(startDate, endDate);
    }

    @PutMapping("/leads/{id}")
    public Lead update(@RequestBody Lead lead, @PathVariable String id)
    {
        Lead leadUpdated = leadService.update(lead);
        return leadUpdated;
    }

    @DeleteMapping("/leads/{id}")
    public void deleteLead(@PathVariable String id)
    {
        leadService.delete(id);
    }

    @DeleteMapping("/leads")
    public void deleteLeads()
    {
        leadService.deleteAll();
    }
}
