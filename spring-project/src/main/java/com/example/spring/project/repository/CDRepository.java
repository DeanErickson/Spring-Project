package com.example.spring.project.repository;

import com.example.spring.project.model.CD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface CDRepository extends JpaRepository<CD, UUID> {
}
