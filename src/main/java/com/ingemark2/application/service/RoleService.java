package com.ingemark2.application.service;


import com.ingemark2.application.entity.Role;

public interface RoleService {
    void createRole(String role, Long id);

    Role findByRole(String role);
}
