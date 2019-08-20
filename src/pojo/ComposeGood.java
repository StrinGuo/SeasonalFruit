package pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ComposeGood {
    private Long id;

    private String composeGoodName;
    private Integer composeGoodPrice;
    private String composeGoodDescribe;
    private Integer composeGoodType;
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

    public String getComposeGoodName() {
        return composeGoodName;
    }

    public void setComposeGoodName(String composeGoodName) {
        this.composeGoodName = composeGoodName;
    }

    public Integer getComposeGoodPrice() {
        return composeGoodPrice;
    }

    public void setComposeGoodPrice(Integer composeGoodPrice) {
        this.composeGoodPrice = composeGoodPrice;
    }

    public String getComposeGoodDescribe() {
        return composeGoodDescribe;
    }

    public void setComposeGoodDescribe(String composeGoodDescribe) {
        this.composeGoodDescribe = composeGoodDescribe;
    }

    public Integer getComposeGoodType() {
        return composeGoodType;
    }

    public void setComposeGoodType(Integer composeGoodType) {
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

    @java.lang.Override
    public java.lang.String toString() {
        return "ComposeGood{" +
                "id=" + id +
                ", composeGoodName='" + composeGoodName + '\'' +
                ", composeGoodPrice=" + composeGoodPrice +
                ", composeGoodDescribe='" + composeGoodDescribe + '\'' +
                ", composeGoodType=" + composeGoodType +
                ", composeGoodStatus=" + composeGoodStatus +
                ", composeGoodIcon='" + composeGoodIcon + '\'' +
                ", composeGoodWeight=" + composeGoodWeight +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
