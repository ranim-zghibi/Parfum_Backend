package com.example.parfums.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.parfums.entities.Image;

public interface ImageRepository  extends JpaRepository<Image, Long>{

}
