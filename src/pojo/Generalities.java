package pojo;

import java.util.Date;
import java.util.List;

public class Generalities {
    private Long id;

    private String generalitiesName;
    private String generalitiesImg;
    private String generalitiesIcon;

    private List<Classify> classify;

//    private Date createTime;
//    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGeneralitiesName() {
        return generalitiesName;
    }

    public void setGeneralitiesName(String generalitiesName) {
        this.generalitiesName = generalitiesName;
    }

    public String getGeneralitiesImg() {
        return generalitiesImg;
    }

    public void setGeneralitiesImg(String generalitiesImg) {
        this.generalitiesImg = generalitiesImg;
    }

    public String getGeneralitiesIcon() {
        return generalitiesIcon;
    }

    public void setGeneralitiesIcon(String generalitiesIcon) {
        this.generalitiesIcon = generalitiesIcon;
    }

    public List<Classify> getClassify() {
        return classify;
    }

    public void setClassify(List<Classify> classify) {
        this.classify = classify;
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
        return "Generalities{" +
                " generalitiesName='" + generalitiesName + '\'' +
                ", generalitiesImg='" + generalitiesImg + '\'' +
                ", generalitiesIcon='" + generalitiesIcon + '\'' +
                ", classify=" + classify +
                '}';
    }
}
