package com.mmt.springbootstudy.controller.system.basic;

import com.mmt.vhr.model.Menu;
import com.mmt.vhr.model.RespBean;
import com.mmt.vhr.model.Role;
import com.mmt.vhr.service.MenuService;
import com.mmt.vhr.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/basic/permiss")
public class PermissController {
    @Autowired
    RoleService roleService;
    @Autowired
    MenuService menuService;

    @GetMapping("/")
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

    @GetMapping("/menus")
    public List<Menu> getAllMenus() {
        return menuService.getAllMenus();
    }

    @GetMapping("/mids/{rid}")
    public List<Integer> getMidByRid(@PathVariable Integer rid){
        return menuService.getMidByRid(rid);
    }

    @PutMapping("/")
    public RespBean updateMenuRole(Integer rid,Integer[] mids){
        if (menuService.updateMenuRole(rid, mids)){
            return RespBean.ok("更新成功");
        }else {
            return RespBean.error("更新失败");
        }
    }
    @PostMapping("/")
    public RespBean addRole(@RequestBody Role role){
        if (roleService.addRole(role)==1){
            return RespBean.ok("添加成功");
        }else {
            return RespBean.error("添加失败");
        }
    }
    @DeleteMapping("/{id}")
    public RespBean deleteRole(@PathVariable Integer id) {
        if (roleService.deleteRole(id)==1){
            return RespBean.ok("删除成功");
        }else {
            return RespBean.error("删除失败");
        }
    }
}
