package com.excmmy.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Excmmy
 * @since 2020-03-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CenterInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;

    @TableField(fill = FieldFill.UPDATE)
    private Date gmtModified;

    private Integer isDelete;

    private Long productId;

    private Integer repertoryNum;

    private Integer alertNum;

    private Integer returnNum;

    private Integer diliveryNum;

    private Integer usableNum;

    public CenterInfo() {
    }

    public CenterInfo(Long id, Date gmtCreate, Date gmtModified, Integer isDelete, Long productId, Integer repertoryNum, Integer alertNum, Integer returnNum, Integer diliveryNum, Integer usableNum) {
        this.id = id;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.isDelete = isDelete;
        this.productId = productId;
        this.repertoryNum = repertoryNum;
        this.alertNum = alertNum;
        this.returnNum = returnNum;
        this.diliveryNum = diliveryNum;
        this.usableNum = usableNum;
    }

    @Override
    public String toString() {
        return "CenterInfo{" +
                "id=" + id +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", isDelete=" + isDelete +
                ", productId=" + productId +
                ", repertoryNum=" + repertoryNum +
                ", alertNum=" + alertNum +
                ", returnNum=" + returnNum +
                ", diliveryNum=" + diliveryNum +
                ", usableNum=" + usableNum +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getRepertoryNum() {
        return repertoryNum;
    }

    public void setRepertoryNum(Integer repertoryNum) {
        this.repertoryNum = repertoryNum;
    }

    public Integer getAlertNum() {
        return alertNum;
    }

    public void setAlertNum(Integer alertNum) {
        this.alertNum = alertNum;
    }

    public Integer getReturnNum() {
        return returnNum;
    }

    public void setReturnNum(Integer returnNum) {
        this.returnNum = returnNum;
    }

    public Integer getDiliveryNum() {
        return diliveryNum;
    }

    public void setDiliveryNum(Integer diliveryNum) {
        this.diliveryNum = diliveryNum;
    }

    public Integer getUsableNum() {
        return usableNum;
    }

    public void setUsableNum(Integer usableNum) {
        this.usableNum = usableNum;
    }
}
