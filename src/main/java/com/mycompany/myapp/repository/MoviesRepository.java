package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Movies;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Movies entity.
 */
@SuppressWarnings("unused")
@Repository
public interface MoviesRepository extends JpaRepository<Movies, Long> {}
