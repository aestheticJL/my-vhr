package com.mmt.vhr.service;

import com.mmt.vhr.mapper.RoleMapper;
import com.mmt.vhr.model.Role;
import com.mmt.vhr.model.RoleExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    RoleMapper roleMapper;

    public List<Role> getAllRoles() {
        return roleMapper.selectByExample(new RoleExample());
    }

    public Integer addRole(Role role) {
        if (!role.getName().startsWith("ROLE_")){
            role.setName("ROLE_"+role.getName());
        }
        return roleMapper.insertSelective(role);
    }

    public Integer deleteRole(Integer id) {
        return roleMapper.deleteByPrimaryKey(id);
    }
}
