package jsjzx.wlyw.sb004.entities;

public class AssetOwner {
    private Integer id;

    private String companyname;

    private String companynameshort;

    private String departmentame;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getCompanynameshort() {
        return companynameshort;
    }

    public void setCompanynameshort(String companynameshort) {
        this.companynameshort = companynameshort == null ? null : companynameshort.trim();
    }

    public String getDepartmentame() {
        return departmentame;
    }

    public void setDepartmentame(String departmentame) {
        this.departmentame = departmentame == null ? null : departmentame.trim();
    }
}