package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;

/**
 * 车辆信息对象 sys_car
 *
 * @author ruoyi
 * @date 2020-03-18
 */
public class SysCar extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 车辆id
     */
    private Long id;

    /**
     * 车牌号
     */
    @Excel(name = "车牌号")
    private String carNumber;

    /**
     * 车类型
     */
    @Excel(name = "车类型")
    private String carType;

    /**
     * 状态
     */
    @Excel(name = "状态")
    private String status;


    /**
     * 车数量
     */
    @Excel(name = "创建时间")
    private Date createTime;

    /**
     * 车数量
     */
    @Excel(name = "租借点Id")
    private Integer rendId;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarType() {
        return carType;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getRendId() {
        return rendId;
    }

    public void setRendId(Integer rendId) {
        this.rendId = rendId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("carNumber", getCarNumber())
                .append("carType", getCarType())
                .append("status", getStatus())
                .append("createTime", getCreateTime())
                .append("rendId", getRendId())
                .toString();
    }
}
