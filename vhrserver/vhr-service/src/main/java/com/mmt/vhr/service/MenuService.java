package com.mmt.vhr.service;

import com.mmt.vhr.mapper.MenuMapper;
import com.mmt.vhr.mapper.MenuRoleMapper;
import com.mmt.vhr.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    MenuMapper menuMapper;
    @Autowired
    MenuRoleMapper menuRoleMapper;

    public List<Menu> getMenusByHrId() {
        return menuMapper.getMenusByHrId(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }

    //    @Cacheable
    public List<Menu> getAllMenusWithRole() {
        return menuMapper.getAllMenusWithRole();
    }

    public List<Menu> getAllMenus() {
        return menuMapper.getAllMenus();
    }

    public List<Integer> getMidByRid(Integer rid) {
        return menuMapper.getMidByRid(rid);
    }

    @Transactional
    public Boolean updateMenuRole(Integer rid, Integer[] mids) {
        MenuRoleExample menuRoleExample = new MenuRoleExample();
        menuRoleExample.createCriteria().andRidEqualTo(rid);
        menuRoleMapper.deleteByExample(menuRoleExample);
        if (mids == null || mids.length == 0) {
            return true;
        }
        int result = 0;
        for (Integer mid : mids) {
            MenuRole menuRole = new MenuRole();
            menuRole.setRid(rid);
            menuRole.setMid(mid);
            result += menuRoleMapper.insertSelective(menuRole);
        }
        return result == mids.length;
    }
}
