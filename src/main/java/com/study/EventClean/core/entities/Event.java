package com.study.EventClean.core.entities;

import com.study.EventClean.core.enums.EventType;

import java.time.LocalDateTime;

public record Event(
        String name,
        String description,
        LocalDateTime start,
        LocalDateTime end,
        String identifier,
        String local,
        Integer capacity,
        EventType type
) {}
