package com.devops.hotelreservation.assignment.services;

import com.devops.hotelreservation.assignment.entity.Reservation;
import com.devops.hotelreservation.assignment.temp.CurrentReservation;

import java.util.Collection;

//Service Pattern for Reservation
public interface ReservationService {
	
	public Reservation getReservationForLoggedUserById(int resId);

	public Collection<Reservation> getReservationsForLoggedUser();
	
	public void saveOrUpdateReservation(CurrentReservation currentReservation);
	
	public void deleteReservation(int resId);

	public CurrentReservation reservationToCurrentReservationById(int resId);

}
