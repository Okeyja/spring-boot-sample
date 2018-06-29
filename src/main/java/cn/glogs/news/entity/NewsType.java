package cn.glogs.news.entity;

public class NewsType {
    private int typeId;
    private String typeName;
    private String Remark;

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    @Override
    public String toString() {
        return "NewsType{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                ", Remark='" + Remark + '\'' +
                '}';
    }
}
