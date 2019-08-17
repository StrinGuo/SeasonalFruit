package pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ComposeGood {
    private Long id;

    private String composeGoodId;
    private String composeGoodName;
    private String composeGoodDescribe;
    private String composeGoodType;
    private Integer composeGoodStatus;
    private String composeGoodIcon;
    private Integer composeGoodWeight;

    private Date createTime;
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComposeGoodId() {
        return composeGoodId;
    }

    public void setComposeGoodId(String composeGoodId) {
        this.composeGoodId = composeGoodId;
    }

    public String getComposeGoodName() {
        return composeGoodName;
    }

    public void setComposeGoodName(String composeGoodName) {
        this.composeGoodName = composeGoodName;
    }

    public String getComposeGoodDescribe() {
        return composeGoodDescribe;
    }

    public void setComposeGoodDescribe(String composeGoodDescribe) {
        this.composeGoodDescribe = composeGoodDescribe;
    }

    public String getComposeGoodType() {
        return composeGoodType;
    }

    public void setComposeGoodType(String composeGoodType) {
        this.composeGoodType = composeGoodType;
    }

    public Integer getComposeGoodStatus() {
        return composeGoodStatus;
    }

    public void setComposeGoodStatus(Integer composeGoodStatus) {
        this.composeGoodStatus = composeGoodStatus;
    }

    public String getComposeGoodIcon() {
        return composeGoodIcon;
    }

    public void setComposeGoodIcon(String composeGoodIcon) {
        this.composeGoodIcon = composeGoodIcon;
    }

    public Integer getComposeGoodWeight() {
        return composeGoodWeight;
    }

    public void setComposeGoodWeight(Integer composeGoodWeight) {
        this.composeGoodWeight = composeGoodWeight;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "ComposeGood{" +
                "id=" + id +
                ", composeGoodId='" + composeGoodId + '\'' +
                ", composeGoodName='" + composeGoodName + '\'' +
                ", composeGoodDescribe='" + composeGoodDescribe + '\'' +
                ", composeGoodType='" + composeGoodType + '\'' +
                ", composeGoodStatus=" + composeGoodStatus +
                ", composeGoodIcon='" + composeGoodIcon + '\'' +
                ", composeGoodWeight=" + composeGoodWeight +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
