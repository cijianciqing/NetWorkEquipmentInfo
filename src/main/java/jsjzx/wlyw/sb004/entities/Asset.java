package jsjzx.wlyw.sb004.entities;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Null;
import java.util.Date;

public class Asset {
    private Integer hostid;

    private String company;

    private String department;

    private String devicename;

    @NotEmpty
    private String hostname;

    private String type;

    private String brand;

    private String model;

    private String sn;

    private String ip;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date buytime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date shelftime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date guaranty;

    private String status;

    private String grade;

    private String location;

    private String note;

    public Integer getHostid() {
        return hostid;
    }

    public void setHostid(Integer hostid) {
        this.hostid = hostid;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getDevicename() {
        return devicename;
    }

    public void setDevicename(String devicename) {
        this.devicename = devicename == null ? null : devicename.trim();
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname == null ? null : hostname.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getBuytime() {
        return buytime;
    }

    public void setBuytime(Date buytime) {
        this.buytime = buytime;
    }

    public Date getShelftime() {
        return shelftime;
    }

    public void setShelftime(Date shelftime) {
        this.shelftime = shelftime;
    }

    public Date getGuaranty() {
        return guaranty;
    }

    public void setGuaranty(Date guaranty) {
        this.guaranty = guaranty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    @Override
    public String toString() {
        return "Asset{" +
                "hostid=" + hostid +
                ", company='" + company + '\'' +
                ", department='" + department + '\'' +
                ", devicename='" + devicename + '\'' +
                ", hostname='" + hostname + '\'' +
                ", type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", sn='" + sn + '\'' +
                ", ip='" + ip + '\'' +
                ", buytime=" + buytime +
                ", shelftime=" + shelftime +
                ", guaranty=" + guaranty +
                ", status='" + status + '\'' +
                ", grade='" + grade + '\'' +
                ", location='" + location + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}