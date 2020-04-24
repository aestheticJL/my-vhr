package com.mmt.springbootstudy.controller.system;

import com.mmt.vhr.model.Hr;
import com.mmt.vhr.model.RespBean;
import com.mmt.vhr.model.Role;
import com.mmt.vhr.service.HrService;
import com.mmt.vhr.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/hr")
public class HrController {
    @Autowired
    HrService hrService;
    @Autowired
    RoleService roleService;
    @GetMapping("/")
    public List<Hr> getAllHrWithRoles(String keyword) {
        return hrService.getAllHrWithRoles(keyword);
    }

    @GetMapping("/roles")
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

    @PutMapping("/")
    public RespBean updateHr(@RequestBody Hr hr) {
        if (hrService.updateHr(hr) == 1) {
            return RespBean.ok("修改成功");
        } else {
            return RespBean.error("修改失败");
        }
    }

    @PutMapping("/role")
    public RespBean updateHrRoles(Integer hrid,Integer[] rids) {
        if (hrService.updateHrRoles(hrid,rids) == true) {
            return RespBean.ok("修改成功");
        } else {
            return RespBean.error("修改失败");
        }
    }
    @DeleteMapping("/{id}")
    public RespBean deleteHr(@PathVariable Integer id){
        if (hrService.deleteRole(id)==1){
            return RespBean.ok("删除成功");
        }else {
            return RespBean.error("删除失败");
        }
    }
}
