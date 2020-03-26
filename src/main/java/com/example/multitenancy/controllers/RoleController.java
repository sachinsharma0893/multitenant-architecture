package com.example.multitenancy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.multitenancy.configurations.TenantContext;
import com.example.multitenancy.domain.Role;
import com.example.multitenancy.dto.UserDto;
import com.example.multitenancy.service.RoleService;

@RestController
@RequestMapping(value = { "api/v1/role" })
public class RoleController {

	@Autowired
	private RoleService roleService;

	@GetMapping
	public ResponseEntity<List<Role>> getValidUser(UserDto userDto) {
		System.out.println(
				"*************  Role  controller executed for  ****************" + TenantContext.getCurrentTenant());
		return new ResponseEntity<>(roleService.findAll(), HttpStatus.OK);
	}

}
