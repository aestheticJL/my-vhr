package com.mmt.springbootstudy.controller.system.basic;


import com.mmt.vhr.model.JOblevel;
import com.mmt.vhr.model.RespBean;
import com.mmt.vhr.service.jobLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/basic/joblevel")
public class JobLevelController {
    @Autowired
    jobLevelService jobLevelService;
    @GetMapping("/")
    public List<JOblevel> getAllJobLevel(){
        return jobLevelService.getAllJobLevel();
    }
    @PostMapping("/")
    public RespBean addJobLevel(@RequestBody JOblevel jOblevel){
        if(jobLevelService.addJobLevel(jOblevel)==1){
            return RespBean.ok("添加成功");
        }else {
            return RespBean.error("添加失败");
        }
    }
    @PutMapping("/")
    public RespBean updateJobLevel(@RequestBody JOblevel jOblevel){
        if(jobLevelService.updateJobLevel(jOblevel)==1){
            return RespBean.ok("修改成功");
        }else {
            return RespBean.error("修改失败");
        }
    }
    @DeleteMapping("/{id}")
    public RespBean deleteJobLevelById(@PathVariable Integer id){
        if(jobLevelService.deleteJobLevel(id)==1){
            return RespBean.ok("删除成功");
        }else {
            return RespBean.error("删除失败");
        }
    }

    @DeleteMapping("/")
    public RespBean deleteJobLevels(Integer[] ids){
        if(jobLevelService.deleteJobLevels(ids)==ids.length){
            return RespBean.ok("删除成功");
        }else {
            return RespBean.error("删除失败");
        }
    }
}
