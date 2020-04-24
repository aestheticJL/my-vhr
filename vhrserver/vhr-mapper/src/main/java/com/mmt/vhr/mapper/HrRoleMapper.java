package com.mmt.vhr.mapper;

import com.mmt.vhr.model.HrRole;
import com.mmt.vhr.model.HrRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HrRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_role
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    long countByExample(HrRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_role
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    int deleteByExample(HrRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_role
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_role
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    int insert(HrRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_role
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    int insertSelective(HrRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_role
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    List<HrRole> selectByExample(HrRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_role
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    HrRole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_role
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    int updateByExampleSelective(@Param("record") HrRole record, @Param("example") HrRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_role
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    int updateByExample(@Param("record") HrRole record, @Param("example") HrRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_role
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    int updateByPrimaryKeySelective(HrRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_role
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    int updateByPrimaryKey(HrRole record);

    int addHrRoles(@Param("hrid")Integer hrid,@Param("rids") Integer[] rids);
}