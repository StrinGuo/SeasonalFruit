package pojo;

import java.math.BigDecimal;
import java.util.Date;

public class DetailedCommodityForm {
    private Long id;
    private String goodId;
    private Byte goodCount;
    private BigDecimal commodityMoney;
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

    public Byte getGoodCount() {
        return goodCount;
    }

    public void setGoodCount(Byte goodCount) {
        this.goodCount = goodCount;
    }

    public BigDecimal getCommodityMoney() {
        return commodityMoney;
    }

    public void setCommodityMoney(BigDecimal commodityMoney) {
        this.commodityMoney = commodityMoney;
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
