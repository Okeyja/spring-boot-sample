package cn.glogs.news.entity;

public class NewsDetailType {
    private int DetailTypeId;
    private int TypeId;
    private String DetailTypeName;
    private String Remark;

    public int getDetailTypeId() {
        return DetailTypeId;
    }

    public void setDetailTypeId(int detailTypeId) {
        DetailTypeId = detailTypeId;
    }

    public int getTypeId() {
        return TypeId;
    }

    public void setTypeId(int typeId) {
        TypeId = typeId;
    }

    public String getDetailTypeName() {
        return DetailTypeName;
    }

    public void setDetailTypeName(String detailTypeName) {
        DetailTypeName = detailTypeName;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    @Override
    public String toString() {
        return "NewsDetailType{" +
                "DetailTypeId=" + DetailTypeId +
                ", TypeId=" + TypeId +
                ", DetailTypeName='" + DetailTypeName + '\'' +
                ", Remark='" + Remark + '\'' +
                '}';
    }
}
