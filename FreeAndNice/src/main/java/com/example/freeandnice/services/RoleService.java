package com.example.freeandnice.services;

import com.example.freeandnice.models.Role;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface RoleService {
    Role createRole(Role role);
    Optional<Role> getRoleById(Long id);
    List<Role> getAllRoles();
    Role updateRole(Role role);
    void deleteRole(Long id);
}
