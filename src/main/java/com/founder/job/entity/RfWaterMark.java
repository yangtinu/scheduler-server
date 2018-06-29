package com.founder.job.entity;

public class RfWaterMark {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JCJ_CONF_SCHEDULER.BH
     *
     * @mbg.generated
     */
    private String bh;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JCJ_CONF_SCHEDULER.IP
     *
     * @mbg.generated
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JCJ_CONF_SCHEDULER.PORT
     *
     * @mbg.generated
     */
    private Short port;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JCJ_CONF_SCHEDULER.FWMC
     *
     * @mbg.generated
     */
    private String fwmc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JCJ_CONF_SCHEDULER.API
     *
     * @mbg.generated
     */
    private String api;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JCJ_CONF_SCHEDULER.PARAMS
     *
     * @mbg.generated
     */
    private String params;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JCJ_CONF_SCHEDULER.BH
     *
     * @return the value of JCJ_CONF_SCHEDULER.BH
     *
     * @mbg.generated
     */
    public String getBh() {
        return bh;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JCJ_CONF_SCHEDULER.BH
     *
     * @param bh the value for JCJ_CONF_SCHEDULER.BH
     *
     * @mbg.generated
     */
    public void setBh(String bh) {
        this.bh = bh == null ? null : bh.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JCJ_CONF_SCHEDULER.IP
     *
     * @return the value of JCJ_CONF_SCHEDULER.IP
     *
     * @mbg.generated
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JCJ_CONF_SCHEDULER.IP
     *
     * @param ip the value for JCJ_CONF_SCHEDULER.IP
     *
     * @mbg.generated
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JCJ_CONF_SCHEDULER.PORT
     *
     * @return the value of JCJ_CONF_SCHEDULER.PORT
     *
     * @mbg.generated
     */
    public Short getPort() {
        return port;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JCJ_CONF_SCHEDULER.PORT
     *
     * @param port the value for JCJ_CONF_SCHEDULER.PORT
     *
     * @mbg.generated
     */
    public void setPort(Short port) {
        this.port = port;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JCJ_CONF_SCHEDULER.FWMC
     *
     * @return the value of JCJ_CONF_SCHEDULER.FWMC
     *
     * @mbg.generated
     */
    public String getFwmc() {
        return fwmc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JCJ_CONF_SCHEDULER.FWMC
     *
     * @param fwmc the value for JCJ_CONF_SCHEDULER.FWMC
     *
     * @mbg.generated
     */
    public void setFwmc(String fwmc) {
        this.fwmc = fwmc == null ? null : fwmc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JCJ_CONF_SCHEDULER.API
     *
     * @return the value of JCJ_CONF_SCHEDULER.API
     *
     * @mbg.generated
     */
    public String getApi() {
        return api;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JCJ_CONF_SCHEDULER.API
     *
     * @param api the value for JCJ_CONF_SCHEDULER.API
     *
     * @mbg.generated
     */
    public void setApi(String api) {
        this.api = api == null ? null : api.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JCJ_CONF_SCHEDULER.PARAMS
     *
     * @return the value of JCJ_CONF_SCHEDULER.PARAMS
     *
     * @mbg.generated
     */
    public String getParams() {
        return params;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JCJ_CONF_SCHEDULER.PARAMS
     *
     * @param params the value for JCJ_CONF_SCHEDULER.PARAMS
     *
     * @mbg.generated
     */
    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }

    @Override
    public String toString() {
        return "RfWaterMark{" +
                "bh='" + bh + '\'' +
                ", ip='" + ip + '\'' +
                ", port=" + port +
                ", fwmc='" + fwmc + '\'' +
                ", api='" + api + '\'' +
                ", params='" + params + '\'' +
                '}';
    }
}