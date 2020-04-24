package com.mmt.vhr.service;

import com.mmt.vhr.mapper.HrMapper;
import com.mmt.vhr.mapper.HrRoleMapper;
import com.mmt.vhr.model.Hr;
import com.mmt.vhr.model.HrRoleExample;
import com.mmt.vhr.service.utils.HrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HrService implements UserDetailsService {
    @Autowired
    HrMapper hrMapper;
    @Autowired
    HrRoleMapper hrRoleMapper;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Hr hr = hrMapper.loadUserByUsername(s);
        if (hr == null){
            throw new UsernameNotFoundException("用户不存在");
        }
        hr.setRoles(hrMapper.getUserRolesById(hr.getId()));
        return hr;
    }

    public List<Hr> getAllHrWithRoles(String keyword) {
        return hrMapper.getAllHrWithRoles(HrUtils.getCurrentHr().getId(),keyword);
    }

    public Integer updateHr(Hr hr) {
        return hrMapper.updateByPrimaryKeySelective(hr);
    }
    @Transactional
    public Boolean updateHrRoles(Integer hrid, Integer[] rids) {
        HrRoleExample hrRoleExample = new HrRoleExample();
        hrRoleExample.createCriteria().andHridEqualTo(hrid);
        hrRoleMapper.deleteByExample(hrRoleExample);
        return hrRoleMapper.addHrRoles(hrid,rids) == rids.length;
    }
    @Transactional
    public Integer deleteRole(Integer id) {
        HrRoleExample hrRoleExample = new HrRoleExample();
        hrRoleExample.createCriteria().andHridEqualTo(id);
        hrRoleMapper.deleteByExample(hrRoleExample);
        return hrMapper.deleteByPrimaryKey(id);
    }
}
