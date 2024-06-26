package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 商品
 *
 * @author 
 * @email
 */
@TableName("shangpin")
public class ShangpinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShangpinEntity() {

	}

	public ShangpinEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 商品名称
     */
    @ColumnInfo(comment="商品名称",type="varchar(200)")
    @TableField(value = "shangpin_name")

    private String shangpinName;


    /**
     * 商品编号
     */
    @ColumnInfo(comment="商品编号",type="varchar(200)")
    @TableField(value = "shangpin_uuid_number")

    private String shangpinUuidNumber;


    /**
     * 商品照片
     */
    @ColumnInfo(comment="商品照片",type="varchar(200)")
    @TableField(value = "shangpin_photo")

    private String shangpinPhoto;


    /**
     * 出产地点
     */
    @ColumnInfo(comment="出产地点",type="varchar(200)")
    @TableField(value = "shangpin_address")

    private String shangpinAddress;


    /**
     * 赞
     */
    @ColumnInfo(comment="赞",type="int(11)")
    @TableField(value = "zan_number")

    private Integer zanNumber;


    /**
     * 踩
     */
    @ColumnInfo(comment="踩",type="int(11)")
    @TableField(value = "cai_number")

    private Integer caiNumber;


    /**
     * 商品类型
     */
    @ColumnInfo(comment="商品类型",type="int(11)")
    @TableField(value = "shangpin_types")

    private Integer shangpinTypes;


    /**
     * 商品库存
     */
    @ColumnInfo(comment="商品库存",type="int(11)")
    @TableField(value = "shangpin_kucun_number")

    private Integer shangpinKucunNumber;


    /**
     * 阈值
     */
    @ColumnInfo(comment="阈值",type="int(11)")
    @TableField(value = "shangpin_yuzhi")

    private Integer shangpinYuzhi;


    /**
     * 商品原价
     */
    @ColumnInfo(comment="商品原价",type="decimal(10,2)")
    @TableField(value = "shangpin_old_money")

    private Double shangpinOldMoney;


    /**
     * 现价
     */
    @ColumnInfo(comment="现价",type="decimal(10,2)")
    @TableField(value = "shangpin_new_money")

    private Double shangpinNewMoney;


    /**
     * 所属仓库
     */
    @ColumnInfo(comment="所属仓库",type="varchar(200)")
    @TableField(value = "shangpin_cangku")

    private String shangpinCangku;


    /**
     * 商品热度
     */
    @ColumnInfo(comment="商品热度",type="int(11)")
    @TableField(value = "shangpin_clicknum")

    private Integer shangpinClicknum;


    /**
     * 商品介绍
     */
    @ColumnInfo(comment="商品介绍",type="longtext")
    @TableField(value = "shangpin_content")

    private String shangpinContent;


    /**
     * 是否上架
     */
    @ColumnInfo(comment="是否上架",type="int(11)")
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：商品名称
	 */
    public String getShangpinName() {
        return shangpinName;
    }
    /**
	 * 设置：商品名称
	 */

    public void setShangpinName(String shangpinName) {
        this.shangpinName = shangpinName;
    }
    /**
	 * 获取：商品编号
	 */
    public String getShangpinUuidNumber() {
        return shangpinUuidNumber;
    }
    /**
	 * 设置：商品编号
	 */

    public void setShangpinUuidNumber(String shangpinUuidNumber) {
        this.shangpinUuidNumber = shangpinUuidNumber;
    }
    /**
	 * 获取：商品照片
	 */
    public String getShangpinPhoto() {
        return shangpinPhoto;
    }
    /**
	 * 设置：商品照片
	 */

    public void setShangpinPhoto(String shangpinPhoto) {
        this.shangpinPhoto = shangpinPhoto;
    }
    /**
	 * 获取：出产地点
	 */
    public String getShangpinAddress() {
        return shangpinAddress;
    }
    /**
	 * 设置：出产地点
	 */

    public void setShangpinAddress(String shangpinAddress) {
        this.shangpinAddress = shangpinAddress;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }
    /**
	 * 设置：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }
    /**
	 * 设置：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：商品类型
	 */
    public Integer getShangpinTypes() {
        return shangpinTypes;
    }
    /**
	 * 设置：商品类型
	 */

    public void setShangpinTypes(Integer shangpinTypes) {
        this.shangpinTypes = shangpinTypes;
    }
    /**
	 * 获取：商品库存
	 */
    public Integer getShangpinKucunNumber() {
        return shangpinKucunNumber;
    }
    /**
	 * 设置：商品库存
	 */

    public void setShangpinKucunNumber(Integer shangpinKucunNumber) {
        this.shangpinKucunNumber = shangpinKucunNumber;
    }
    /**
	 * 获取：阈值
	 */
    public Integer getShangpinYuzhi() {
        return shangpinYuzhi;
    }
    /**
	 * 设置：阈值
	 */

    public void setShangpinYuzhi(Integer shangpinYuzhi) {
        this.shangpinYuzhi = shangpinYuzhi;
    }
    /**
	 * 获取：商品原价
	 */
    public Double getShangpinOldMoney() {
        return shangpinOldMoney;
    }
    /**
	 * 设置：商品原价
	 */

    public void setShangpinOldMoney(Double shangpinOldMoney) {
        this.shangpinOldMoney = shangpinOldMoney;
    }
    /**
	 * 获取：现价
	 */
    public Double getShangpinNewMoney() {
        return shangpinNewMoney;
    }
    /**
	 * 设置：现价
	 */

    public void setShangpinNewMoney(Double shangpinNewMoney) {
        this.shangpinNewMoney = shangpinNewMoney;
    }
    /**
	 * 获取：所属仓库
	 */
    public String getShangpinCangku() {
        return shangpinCangku;
    }
    /**
	 * 设置：所属仓库
	 */

    public void setShangpinCangku(String shangpinCangku) {
        this.shangpinCangku = shangpinCangku;
    }
    /**
	 * 获取：商品热度
	 */
    public Integer getShangpinClicknum() {
        return shangpinClicknum;
    }
    /**
	 * 设置：商品热度
	 */

    public void setShangpinClicknum(Integer shangpinClicknum) {
        this.shangpinClicknum = shangpinClicknum;
    }
    /**
	 * 获取：商品介绍
	 */
    public String getShangpinContent() {
        return shangpinContent;
    }
    /**
	 * 设置：商品介绍
	 */

    public void setShangpinContent(String shangpinContent) {
        this.shangpinContent = shangpinContent;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }
    /**
	 * 设置：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Shangpin{" +
            ", id=" + id +
            ", shangpinName=" + shangpinName +
            ", shangpinUuidNumber=" + shangpinUuidNumber +
            ", shangpinPhoto=" + shangpinPhoto +
            ", shangpinAddress=" + shangpinAddress +
            ", zanNumber=" + zanNumber +
            ", caiNumber=" + caiNumber +
            ", shangpinTypes=" + shangpinTypes +
            ", shangpinKucunNumber=" + shangpinKucunNumber +
            ", shangpinYuzhi=" + shangpinYuzhi +
            ", shangpinOldMoney=" + shangpinOldMoney +
            ", shangpinNewMoney=" + shangpinNewMoney +
            ", shangpinCangku=" + shangpinCangku +
            ", shangpinClicknum=" + shangpinClicknum +
            ", shangpinContent=" + shangpinContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
