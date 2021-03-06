package com.mmt.vhr.model;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {

    private String nName;
    private String pName;
    private String dName;
    private String jName;
    private String posName;

    public String getnName() {
        return nName;
    }

    public void setnName(String nName) {
        this.nName = nName;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getjName() {
        return jName;
    }

    public void setjName(String jName) {
        this.jName = jName;
    }

    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.id
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.name
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.gender
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private String gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.birthday
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private Date birthday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.idCard
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private String idCard;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.wedlock
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private String wedlock;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.nationId
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private Integer nationId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.nativePlace
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private String nativePlace;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.politicId
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private Integer politicId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.email
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.phone
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.address
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.departmentId
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private Integer departmentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.jobLevelId
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private Integer joblevelId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.posId
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private Integer posId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.engageForm
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private String engageForm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.tiptopDegree
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private String tiptopDegree;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.specialty
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private String specialty;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.school
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private String school;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.beginDate
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private Date beginDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.workState
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private String workState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.workID
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private String workID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.contractTerm
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private Double contractTerm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.conversionTime
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private Date conversionTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.notWorkDate
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private Date notworkDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.beginContract
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private Date beginContract;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.endContract
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private Date endContract;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.workAge
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private Integer workAge;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.id
     *
     * @return the value of employee.id
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.id
     *
     * @param id the value for employee.id
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.name
     *
     * @return the value of employee.name
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.name
     *
     * @param name the value for employee.name
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.gender
     *
     * @return the value of employee.gender
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.gender
     *
     * @param gender the value for employee.gender
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.birthday
     *
     * @return the value of employee.birthday
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.birthday
     *
     * @param birthday the value for employee.birthday
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.idCard
     *
     * @return the value of employee.idCard
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.idCard
     *
     * @param idCard the value for employee.idCard
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.wedlock
     *
     * @return the value of employee.wedlock
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public String getWedlock() {
        return wedlock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.wedlock
     *
     * @param wedlock the value for employee.wedlock
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setWedlock(String wedlock) {
        this.wedlock = wedlock == null ? null : wedlock.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.nationId
     *
     * @return the value of employee.nationId
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public Integer getNationId() {
        return nationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.nationId
     *
     * @param nationId the value for employee.nationId
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setNationId(Integer nationId) {
        this.nationId = nationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.nativePlace
     *
     * @return the value of employee.nativePlace
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public String getNativePlace() {
        return nativePlace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.nativePlace
     *
     * @param nativePlace the value for employee.nativePlace
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace == null ? null : nativePlace.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.politicId
     *
     * @return the value of employee.politicId
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public Integer getPoliticId() {
        return politicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.politicId
     *
     * @param politicId the value for employee.politicId
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setPoliticId(Integer politicId) {
        this.politicId = politicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.email
     *
     * @return the value of employee.email
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.email
     *
     * @param email the value for employee.email
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.phone
     *
     * @return the value of employee.phone
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.phone
     *
     * @param phone the value for employee.phone
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.address
     *
     * @return the value of employee.address
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.address
     *
     * @param address the value for employee.address
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.departmentId
     *
     * @return the value of employee.departmentId
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.departmentId
     *
     * @param departmentId the value for employee.departmentId
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.jobLevelId
     *
     * @return the value of employee.jobLevelId
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public Integer getJoblevelId() {
        return joblevelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.jobLevelId
     *
     * @param joblevelId the value for employee.jobLevelId
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setJoblevelId(Integer joblevelId) {
        this.joblevelId = joblevelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.posId
     *
     * @return the value of employee.posId
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public Integer getPosId() {
        return posId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.posId
     *
     * @param posId the value for employee.posId
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setPosId(Integer posId) {
        this.posId = posId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.engageForm
     *
     * @return the value of employee.engageForm
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public String getEngageForm() {
        return engageForm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.engageForm
     *
     * @param engageForm the value for employee.engageForm
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setEngageForm(String engageForm) {
        this.engageForm = engageForm == null ? null : engageForm.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.tiptopDegree
     *
     * @return the value of employee.tiptopDegree
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public String getTiptopDegree() {
        return tiptopDegree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.tiptopDegree
     *
     * @param tiptopDegree the value for employee.tiptopDegree
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setTiptopDegree(String tiptopDegree) {
        this.tiptopDegree = tiptopDegree == null ? null : tiptopDegree.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.specialty
     *
     * @return the value of employee.specialty
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.specialty
     *
     * @param specialty the value for employee.specialty
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty == null ? null : specialty.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.school
     *
     * @return the value of employee.school
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public String getSchool() {
        return school;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.school
     *
     * @param school the value for employee.school
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.beginDate
     *
     * @return the value of employee.beginDate
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.beginDate
     *
     * @param beginDate the value for employee.beginDate
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.workState
     *
     * @return the value of employee.workState
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public String getWorkState() {
        return workState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.workState
     *
     * @param workState the value for employee.workState
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setWorkState(String workState) {
        this.workState = workState == null ? null : workState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.workID
     *
     * @return the value of employee.workID
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public String getWorkID() {
        return workID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.workID
     *
     * @param workID the value for employee.workID
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setWorkID(String workID) {
        this.workID = workID == null ? null : workID.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.contractTerm
     *
     * @return the value of employee.contractTerm
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public Double getContractTerm() {
        return contractTerm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.contractTerm
     *
     * @param contractTerm the value for employee.contractTerm
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setContractTerm(Double contractTerm) {
        this.contractTerm = contractTerm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.conversionTime
     *
     * @return the value of employee.conversionTime
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public Date getConversionTime() {
        return conversionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.conversionTime
     *
     * @param conversionTime the value for employee.conversionTime
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setConversionTime(Date conversionTime) {
        this.conversionTime = conversionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.notWorkDate
     *
     * @return the value of employee.notWorkDate
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public Date getNotworkDate() {
        return notworkDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.notWorkDate
     *
     * @param notworkDate the value for employee.notWorkDate
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setNotworkDate(Date notworkDate) {
        this.notworkDate = notworkDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.beginContract
     *
     * @return the value of employee.beginContract
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public Date getBeginContract() {
        return beginContract;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.beginContract
     *
     * @param beginContract the value for employee.beginContract
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setBeginContract(Date beginContract) {
        this.beginContract = beginContract;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.endContract
     *
     * @return the value of employee.endContract
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public Date getEndContract() {
        return endContract;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.endContract
     *
     * @param endContract the value for employee.endContract
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setEndContract(Date endContract) {
        this.endContract = endContract;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.workAge
     *
     * @return the value of employee.workAge
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public Integer getWorkAge() {
        return workAge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.workAge
     *
     * @param workAge the value for employee.workAge
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setWorkAge(Integer workAge) {
        this.workAge = workAge;
    }
}