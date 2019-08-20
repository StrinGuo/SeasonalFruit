package pojo;

import java.util.Date;

public class Classify {
    private Long id;

    private Long generalitiesId;
    private String classifyName;

    private Date createTime;
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Classify{" +
                "id=" + id +
                ", generalitiesId=" + generalitiesId +
                ", classifyName='" + classifyName + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
