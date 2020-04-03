package com.ruoyi.system.domain;

import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;

/**
 * 共享单车记录对象 sys_record
 *
 * @author ruoyi
 * @date 2020-03-18
 */
public class SysRecord extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 记录id
     */
    private Long id;

    /**
     * 车牌号
     */
    @Excel(name = "车牌号")
    private String carNumber;

    /**
     * 租借点id
     */
    @Excel(name = "租借点id")
    private Long postId;

    /**
     * 租借点名称
     */
    @Excel(name = "租借点名称")
    private String postName;

    /**
     * 状态（0 已还车  1 已借车）
     */
    @Excel(name = "状态", readConverterExp = "0=,已=还车,1=,已=借车")
    private Long status;

    /**
     * 租借天数
     */
    @Excel(name = "租借时间")
    private Date rendDate;

    /**
     * 车类型
     */
    @Excel(name = "车类型")
    private String carType;

    /**
     * 租借天数
     */
    @Excel(name = "租借人")
    private String name;


    /**
     * 租借天数
     */
    @Excel(name = "电话")
    private String phone;

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

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getPostName() {
        return postName;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return status;
    }

    public void setRendDate(Date rendDate) {
        this.rendDate = rendDate;
    }

    public Date getRendDate() {
        return rendDate;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarType() {
        return carType;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("carNumber", getCarNumber())
                .append("postId", getPostId())
                .append("postName", getPostName())
                .append("status", getStatus())
                .append("rendDate", getRendDate())
                .append("carType", getCarType())
                .append("phone", getPhone())
                .append("Name", getName())
                .toString();
    }
}
