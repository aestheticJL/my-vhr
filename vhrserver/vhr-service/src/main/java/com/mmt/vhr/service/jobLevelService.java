package com.mmt.vhr.service;

import com.mmt.vhr.mapper.JOblevelMapper;
import com.mmt.vhr.model.JOblevel;
import com.mmt.vhr.model.JOblevelExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class jobLevelService {
    @Autowired
    JOblevelMapper jOblevelMapper;

    public List<JOblevel> getAllJobLevel() {
        return jOblevelMapper.selectByExample(new JOblevelExample());
    }

    public Integer addJobLevel(JOblevel jOblevel) {
        jOblevel.setCreateDate(new Date());
        jOblevel.setEnabled(true);
        return jOblevelMapper.insertSelective(jOblevel);
    }

    public Integer updateJobLevel(JOblevel jOblevel) {
        return jOblevelMapper.updateByPrimaryKeySelective(jOblevel);
    }

    public Integer deleteJobLevel(Integer id) {
        return jOblevelMapper.deleteByPrimaryKey(id);
    }

    public Integer deleteJobLevels(Integer[] ids) {
        return jOblevelMapper.deleteByIdArray(ids);
    }
}
