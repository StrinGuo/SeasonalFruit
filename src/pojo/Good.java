package pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Good {
    private Long id;
    private String goodId;
    private String goodName;
    private Byte goodStatus;
    private Byte goodSeason;
    private BigDecimal goodPrice;
    private Date createTime;
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public Byte getGoodStatus() {
        return goodStatus;
    }

    public void setGoodStatus(Byte goodStatus) {
        this.goodStatus = goodStatus;
    }

    public Byte getGoodSeason() {
        return goodSeason;
    }

    public void setGoodSeason(Byte goodSeason) {
        this.goodSeason = goodSeason;
    }

    public BigDecimal getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(BigDecimal goodPrice) {
        this.goodPrice = goodPrice;
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
}
