package com.system.entity;

public class Fee {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fee.fId
     *
     * @mbggenerated Fri Apr 10 19:27:31 GMT+08:00 2020
     */
    private Integer fid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fee.fAmount
     *
     * @mbggenerated Fri Apr 10 19:27:31 GMT+08:00 2020
     */
    private String famount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fee.fPayerUsername
     *
     * @mbggenerated Fri Apr 10 19:27:31 GMT+08:00 2020
     */
    private String fpayerusername;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fee.fStatus
     *
     * @mbggenerated Fri Apr 10 19:27:31 GMT+08:00 2020
     */
    private Integer fstatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fee.fId
     *
     * @return the value of fee.fId
     *
     * @mbggenerated Fri Apr 10 19:27:31 GMT+08:00 2020
     */
    public Integer getFid() {
        return fid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fee.fId
     *
     * @param fid the value for fee.fId
     *
     * @mbggenerated Fri Apr 10 19:27:31 GMT+08:00 2020
     */
    public void setFid(Integer fid) {
        this.fid = fid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fee.fAmount
     *
     * @return the value of fee.fAmount
     *
     * @mbggenerated Fri Apr 10 19:27:31 GMT+08:00 2020
     */
    public String getFamount() {
        return famount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fee.fAmount
     *
     * @param famount the value for fee.fAmount
     *
     * @mbggenerated Fri Apr 10 19:27:31 GMT+08:00 2020
     */
    public void setFamount(String famount) {
        this.famount = famount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fee.fPayerUsername
     *
     * @return the value of fee.fPayerUsername
     *
     * @mbggenerated Fri Apr 10 19:27:31 GMT+08:00 2020
     */
    public String getFpayerusername() {
        return fpayerusername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fee.fPayerUsername
     *
     * @param fpayerusername the value for fee.fPayerUsername
     *
     * @mbggenerated Fri Apr 10 19:27:31 GMT+08:00 2020
     */
    public void setFpayerusername(String fpayerusername) {
        this.fpayerusername = fpayerusername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fee.fStatus
     *
     * @return the value of fee.fStatus
     *
     * @mbggenerated Fri Apr 10 19:27:31 GMT+08:00 2020
     */
    public Integer getFstatus() {
        return fstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fee.fStatus
     *
     * @param fstatus the value for fee.fStatus
     *
     * @mbggenerated Fri Apr 10 19:27:31 GMT+08:00 2020
     */
    public void setFstatus(Integer fstatus) {
        this.fstatus = fstatus;
    }
}