package com.mmt.vhr.model;

import java.util.Date;

public class MsgContent {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msgcontent.id
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msgcontent.title
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msgcontent.message
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private String message;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msgcontent.createDate
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private Date createdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msgcontent.id
     *
     * @return the value of msgcontent.id
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msgcontent.id
     *
     * @param id the value for msgcontent.id
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msgcontent.title
     *
     * @return the value of msgcontent.title
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msgcontent.title
     *
     * @param title the value for msgcontent.title
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msgcontent.message
     *
     * @return the value of msgcontent.message
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msgcontent.message
     *
     * @param message the value for msgcontent.message
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msgcontent.createDate
     *
     * @return the value of msgcontent.createDate
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msgcontent.createDate
     *
     * @param createdate the value for msgcontent.createDate
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}