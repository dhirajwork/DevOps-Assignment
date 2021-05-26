package com.devops.hotelreservation.assignment.dao;

import com.devops.hotelreservation.assignment.entity.Reservation;

import java.util.Collection;

// DAO Pattern for Reservation
public interface ReservationDao {
	
	public Reservation getReservationForLoggedUserById(int resId);

	public Collection<Reservation> getReservationsByUserId(int userId);
	
	public void saveOrUpdateReservation(Reservation reservation);
	
	public void deleteReservation(Reservation reservation);

}
