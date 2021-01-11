package com.anton.sring.spring_boot.service;


import com.anton.sring.spring_boot.models.Role;

import java.util.List;

public interface RoleService {
    public Role getRoleByName(String name);
    public List<Role> listRoles();
}
