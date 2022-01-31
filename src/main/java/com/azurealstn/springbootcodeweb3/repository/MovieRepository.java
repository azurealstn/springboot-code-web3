package com.azurealstn.springbootcodeweb3.repository;

import com.azurealstn.springbootcodeweb3.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
