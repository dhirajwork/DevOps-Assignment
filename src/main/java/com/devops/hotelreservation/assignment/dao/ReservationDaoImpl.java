package com.devops.hotelreservation.assignment.dao;

import com.devops.hotelreservation.assignment.entity.*;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.Collection;

@Repository
public class ReservationDaoImpl implements ReservationDao {
	
	// dao pattern to deal with retrieve and send data to and from database for reservation

	// field injection entity manager
	@Autowired
	private EntityManager entityManager;

	// retrieve all reservations for logged user from database
	@Override
	public Collection<Reservation> getReservationsByUserId(int userId) {
		
		// create query with HQL to get reservations list
		Query<Reservation> query = currentSession().createQuery("from Reservation where reservation_user_id=:userId",
				Reservation.class);
		query.setParameter("userId", userId);

		return query.getResultList();
	}

	// retrieve specific reservation by it's id
	@Override
	public Reservation getReservationForLoggedUserById(int resId) {
		
		// create query with HQL to get reservation 
		Query<Reservation> query = currentSession().createQuery("from Reservation where reservation_id=:resId",
				Reservation.class);
		query.setParameter("resId", resId);

		return query.getSingleResult();
	}

	// save or update reservation in database
	@Override
	public void saveOrUpdateReservation(Reservation reservation) {
		currentSession().saveOrUpdate(reservation);
	}

	// delete reservation that stored in database
	@Override
	public void deleteReservation(Reservation reservation) {
		currentSession().delete(reservation);
	}

	// get current hibernate session
	private Session currentSession() {
		return entityManager.unwrap(Session.class);
	}

}
