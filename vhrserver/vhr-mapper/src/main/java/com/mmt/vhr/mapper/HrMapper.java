package com.mmt.vhr.mapper;

import com.mmt.vhr.model.Hr;
import com.mmt.vhr.model.HrExample;
import java.util.List;

import com.mmt.vhr.model.Role;
import org.apache.ibatis.annotations.Param;

public interface HrMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    long countByExample(HrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    int deleteByExample(HrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    int insert(Hr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    int insertSelective(Hr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    List<Hr> selectByExample(HrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    Hr selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    int updateByExampleSelective(@Param("record") Hr record, @Param("example") HrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    int updateByExample(@Param("record") Hr record, @Param("example") HrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    int updateByPrimaryKeySelective(Hr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    int updateByPrimaryKey(Hr record);

    Hr loadUserByUsername(String name);

    List<Role> getUserRolesById(Integer hrId);

    List<Hr> getAllHrWithRoles(@Param("hrid") Integer hrId,@Param("keyword") String keyword);
}