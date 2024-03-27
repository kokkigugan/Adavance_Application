package com.example.backend.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.Service.EventDetailsService;
import com.example.backend.model.services;

@RestController
@RequestMapping("/api/event-details")
public class servicesController {

    @Autowired
    private EventDetailsService eventDetailsService;

    @GetMapping
    @PreAuthorize("hasAuthority('USER') or hasAuthority('ADMIN')")
    public List<services> getAllEvents() {
        return eventDetailsService.getAllEvents();
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('USER') or hasAuthority('ADMIN')")
    public services getEventById(@PathVariable Long id) {
        return eventDetailsService.getEventById(id);
    }

    @PostMapping
    public services createEvent(@RequestBody services eventDetails) {
        return eventDetailsService.createEvent(eventDetails);
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('USER') or hasAuthority('ADMIN')")
    public services updateEvent(@PathVariable Long id, @RequestBody services eventDetails) {
        return eventDetailsService.updateEvent(id, eventDetails);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('USER') or hasAuthority('ADMIN')")
    public void deleteEvent(@PathVariable Long id) {
        eventDetailsService.deleteEvent(id);
    }
}
