package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.model.services;



public interface ServicesRepository extends JpaRepository<services, Long> {
}
