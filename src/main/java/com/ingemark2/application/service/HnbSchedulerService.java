package com.ingemark2.application.service;

import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;

public interface HnbSchedulerService {
    
    LocalDate getLastDate();

    void fillDatabase();

    void updateDatabase(LocalDate lastDate);
}
