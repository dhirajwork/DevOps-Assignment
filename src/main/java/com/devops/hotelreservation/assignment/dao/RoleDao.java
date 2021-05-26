package com.devops.hotelreservation.assignment.dao;

import com.devops.hotelreservation.assignment.entity.Role;

//DAO Pattern for Role
public interface RoleDao {

	public Role findRoleByName(String roleName);
	
}
