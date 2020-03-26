package com.example.multitenancy.service;

import java.util.List;

import com.example.multitenancy.domain.Role;

public interface RoleService {

	public List<Role> findAll();
}
