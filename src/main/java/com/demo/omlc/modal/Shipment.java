package com.demo.omlc.modal;


public class Shipment {

    private String wcs_db_name;
    private String shipdate;
    private String eom_sent_count;
    private String wcs_ship_recv_count;
    private String wcs_ship_proc_count;
    private String wcs_ship_fail_count;
    private String wcs_cmplt_count;
    private String wcs_cmplt_fail_count;
    private String wcs_rtun_count;
    private String wcs_rtun_fail_count;

    public String getWcs_db_name() {
        return wcs_db_name;
    }

    public void setWcs_db_name(String wcs_db_name) {
        this.wcs_db_name = wcs_db_name;
    }

    public String getShipdate() {
        return shipdate;
    }

    public void setShipdate(String shipdate) {
        this.shipdate = shipdate;
    }

    public String getEom_sent_count() {
        return eom_sent_count;
    }

    public void setEom_sent_count(String eom_sent_count) {
        this.eom_sent_count = eom_sent_count;
    }

    public String getWcs_ship_recv_count() {
        return wcs_ship_recv_count;
    }

    public void setWcs_ship_recv_count(String wcs_ship_recv_count) {
        this.wcs_ship_recv_count = wcs_ship_recv_count;
    }

    public String getWcs_ship_proc_count() {
        return wcs_ship_proc_count;
    }

    public void setWcs_ship_proc_count(String wcs_ship_proc_count) {
        this.wcs_ship_proc_count = wcs_ship_proc_count;
    }

    public String getWcs_ship_fail_count() {
        return wcs_ship_fail_count;
    }

    public void setWcs_ship_fail_count(String wcs_ship_fail_count) {
        this.wcs_ship_fail_count = wcs_ship_fail_count;
    }

    public String getWcs_cmplt_count() {
        return wcs_cmplt_count;
    }

    public void setWcs_cmplt_count(String wcs_cmplt_count) {
        this.wcs_cmplt_count = wcs_cmplt_count;
    }

    public String getWcs_cmplt_fail_count() {
        return wcs_cmplt_fail_count;
    }

    public void setWcs_cmplt_fail_count(String wcs_cmplt_fail_count) {
        this.wcs_cmplt_fail_count = wcs_cmplt_fail_count;
    }

    public String getWcs_rtun_count() {
        return wcs_rtun_count;
    }

    public void setWcs_rtun_count(String wcs_rtun_count) {
        this.wcs_rtun_count = wcs_rtun_count;
    }

    public String getWcs_rtun_fail_count() {
        return wcs_rtun_fail_count;
    }

    public void setWcs_rtun_fail_count(String wcs_rtun_fail_count) {
        this.wcs_rtun_fail_count = wcs_rtun_fail_count;
    }

    @Override
    public String toString() {
        return "Shipment{" +
                "wcs_db_name='" + wcs_db_name + '\'' +
                ", shipdate='" + shipdate + '\'' +
                ", eom_sent_count='" + eom_sent_count + '\'' +
                ", wcs_ship_recv_count='" + wcs_ship_recv_count + '\'' +
                ", wcs_ship_proc_count='" + wcs_ship_proc_count + '\'' +
                ", wcs_ship_fail_count='" + wcs_ship_fail_count + '\'' +
                ", wcs_cmplt_count='" + wcs_cmplt_count + '\'' +
                ", wcs_cmplt_fail_count='" + wcs_cmplt_fail_count + '\'' +
                ", wcs_rtun_count='" + wcs_rtun_count + '\'' +
                ", wcs_rtun_fail_count='" + wcs_rtun_fail_count + '\'' +
                '}';
    }
}
