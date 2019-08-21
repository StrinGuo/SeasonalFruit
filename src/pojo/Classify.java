package pojo;

import java.util.Date;
import java.util.List;

public class Classify {
    private Long id;

    private Long generalitiesId;
    private String classifyName;
    private List<ComposeGood> composeGood;
//    private Date createTime;
//    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGeneralitiesId() {
        return generalitiesId;
    }

    public void setGeneralitiesId(Long generalitiesId) {
        this.generalitiesId = generalitiesId;
    }

    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName;
    }

    public List<ComposeGood> getComposeGood() {
        return composeGood;
    }

    public void setComposeGood(List<ComposeGood> composeGood) {
        this.composeGood = composeGood;
    }

//    public Date getCreateTime() {
//        return createTime;
//    }
//
//    public void setCreateTime(Date createTime) {
//        this.createTime = createTime;
//    }
//
//    public Date getUpdateTime() {
//        return updateTime;
//    }
//
//    public void setUpdateTime(Date updateTime) {
//        this.updateTime = updateTime;
//    }

    @Override
    public String toString() {
        return "Classify{" +
                " generalitiesId=" + generalitiesId +
                ", classifyName='" + classifyName + '\'' +
                ", composeGood=" + composeGood +
                '}';
    }
}
