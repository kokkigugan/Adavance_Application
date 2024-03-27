package com.example.backend.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.model.services;
import com.example.backend.repository.ServicesRepository;

@Service
public class EventDetailsService {

    @Autowired
    private ServicesRepository eventDetailsRepository;

    public List<services> getAllEvents() {
        return eventDetailsRepository.findAll();
    }

    public services getEventById(Long id) {
        Optional<services> eventOptional = eventDetailsRepository.findById(id);
        return eventOptional.orElse(null);
    }

    public services createEvent(services eventDetails) {
        return eventDetailsRepository.save(eventDetails);
    }

    public services updateEvent(Long id, services eventDetails) {
        if (eventDetailsRepository.existsById(id)) {
            eventDetails.setId(id);
            return eventDetailsRepository.save(eventDetails);
        }
        return null;
    }

    public void deleteEvent(Long id) {
        eventDetailsRepository.deleteById(id);
    }
}
