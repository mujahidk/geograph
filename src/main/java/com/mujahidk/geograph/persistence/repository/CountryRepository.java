package com.mujahidk.geograph.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mujahidk.geograph.persistence.entity.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

}
