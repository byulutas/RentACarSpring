package com.tobeto.spring.b.repositories;

import com.tobeto.spring.b.entities.Color;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorRepository extends JpaRepository<Color,Integer> {
}

