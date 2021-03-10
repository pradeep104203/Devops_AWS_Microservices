package com.pradeep.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradeep.springcloud.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
