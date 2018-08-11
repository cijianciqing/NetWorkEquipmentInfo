package jsjzx.wlyw.sb004.entities;

public class AssetModel {
    private Integer id;

    private String model;

    private Integer typebrandid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public Integer getTypebrandid() {
        return typebrandid;
    }

    public void setTypebrandid(Integer typebrandid) {
        this.typebrandid = typebrandid;
    }
}