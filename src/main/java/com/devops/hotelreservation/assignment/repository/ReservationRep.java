package com.devops.hotelreservation.assignment.repository;

import com.devops.hotelreservation.assignment.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ReservationRep extends JpaRepository<Reservation, Integer> {
	
	Reservation findById(int resId);
	
	Collection<Reservation> findAllByUserId(int userId);

}
