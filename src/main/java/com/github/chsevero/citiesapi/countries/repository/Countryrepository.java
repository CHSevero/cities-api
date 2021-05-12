package com.github.chsevero.citiesapi.countries.repository;

import com.github.chsevero.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Countryrepository extends JpaRepository<Country, Long> {

}
