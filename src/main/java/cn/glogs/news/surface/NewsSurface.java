package cn.glogs.news.surface;

import java.util.Date;

public class NewsSurface {

    private int id;
    private String title;
    private String detailTypeName;
    private String TypeName;
    private String address;
    private String content;
    private Date time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetailTypeName() {
        return detailTypeName;
    }

    public void setDetailTypeName(String detailTypeName) {
        this.detailTypeName = detailTypeName;
    }

    public String getTypeName() {
        return TypeName;
    }

    public void setTypeName(String typeName) {
        TypeName = typeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "NewsSurface{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", detailTypeName='" + detailTypeName + '\'' +
                ", TypeName='" + TypeName + '\'' +
                ", address='" + address + '\'' +
                ", content='" + content + '\'' +
                ", time=" + time +
                '}';
    }
}
