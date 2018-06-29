package cn.glogs.news.entity;

import java.util.Date;

public class NewsMessage {
    private int id;
    private String title;
    private int detailType;
    private Date time;
    private String address;
    private String Content;

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

    public int getDetailType() {
        return detailType;
    }

    public void setDetailType(int detailType) {
        this.detailType = detailType;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    @Override
    public String toString() {
        return "NewsMessage{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", detailType=" + detailType +
                ", time=" + time +
                ", address='" + address + '\'' +
                ", Content='" + Content + '\'' +
                '}';
    }
}
