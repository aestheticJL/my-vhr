package com.mmt.springbootstudy.controller.system.basic;

import com.mmt.vhr.model.Department;
import com.mmt.vhr.model.RespBean;
import com.mmt.vhr.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/basic/department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @GetMapping("/")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @PostMapping("/")
    public RespBean addDepartment(@RequestBody Department department) {
        departmentService.addDepartment(department);
        if (department.getResult() == 1) {
            return RespBean.ok("添加成功", department);
        } else {
            return RespBean.error("添加失败", department);
        }
    }

    @DeleteMapping("/{id}")
    public RespBean deleteDepartment(@PathVariable Integer id) {
        Department department = new Department();
        department.setId(id);
        departmentService.deleteDepartment(department);
        if (department.getResult() == -2) {
            return RespBean.error("该部门下有子部门，无法删除");
        } else if (department.getResult() == -1) {
            return RespBean.error("该部门有员工，无法删除");
        } else if (department.getResult() == 1) {
            return RespBean.ok("删除成功");
        }
        return RespBean.error("删除失败");
    }
}
