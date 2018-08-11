package jsjzx.wlyw.sb004.entities;

public class AssetType {
    private Integer id;

    private String type;

    private String brandcn;

    private String branden;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getBrandcn() {
        return brandcn;
    }

    public void setBrandcn(String brandcn) {
        this.brandcn = brandcn == null ? null : brandcn.trim();
    }

    public String getBranden() {
        return branden;
    }

    public void setBranden(String branden) {
        this.branden = branden == null ? null : branden.trim();
    }
}