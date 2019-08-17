package pojo;

import java.math.BigDecimal;
import java.util.Date;

public class DeliveryForm {
    private Long id;
    private Byte deliveryWay;
    private Byte deliveryTime;
    private BigDecimal deliveryMoney;
    private Date createTime;
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getDeliveryWay() {
        return deliveryWay;
    }

    public void setDeliveryWay(Byte deliveryWay) {
        this.deliveryWay = deliveryWay;
    }

    public Byte getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Byte deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public BigDecimal getDeliveryMoney() {
        return deliveryMoney;
    }

    public void setDeliveryMoney(BigDecimal deliveryMoney) {
        this.deliveryMoney = deliveryMoney;
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
