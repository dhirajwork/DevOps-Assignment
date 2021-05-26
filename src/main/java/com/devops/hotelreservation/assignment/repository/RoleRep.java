package com.devops.hotelreservation.assignment.repository;

import com.devops.hotelreservation.assignment.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRep extends JpaRepository<Role, Integer> {

	Role findByName(String roleName);
}
