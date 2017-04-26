package com.fengze.ssm.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_product")
public class ProductDo {
    /**
     * 商品ID
     */
    @Id
    @Column(name = "PRO_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long proId;

    /**
     * 商品名称
     */
    @Column(name = "PRO_NAME")
    private String proName;

    /**
     * 商品原价
     */
    @Column(name = "PRO_REAL_PRICE")
    private Double proRealPrice;

    /**
     * 商品现价
     */
    @Column(name = "PRO_NOW_PRICE")
    private Double proNowPrice;

    /**
     * 是否有库存 1：有库存 0：无库存
     */
    @Column(name = "IS_STOCK")
    private Byte isStock;

    /**
     * 商品简述
     */
    @Column(name = "PRO_DESC")
    private String proDesc;

    /**
     * 商品大小
     */
    @Column(name = "PRO_SIZE")
    private String proSize;

    /**
     * 商品颜色
     */
    @Column(name = "PRO_COLOR")
    private String proColor;

    /**
     * 评价分数
     */
    @Column(name = "PRO_SCORE")
    private Double proScore;

    /**
     * 商品类型ID
     */
    @Column(name = "PRO_TYPE_ID")
    private Long proTypeId;

    /**
     * 商品默认图片ID
     */
    @Column(name = "PRO_PIC_ID")
    private Long proPicId;

    /**
     * 商品默认图片URL
     */
    @Column(name = "PRO_PIC_URI")
    private String proPicUri;

    /**
     * 状态 1:可用状态  0:删除状态
     */
    @Column(name = "STATE")
    private Byte state;

    /**
     * 创建人ID
     */
    @Column(name = "CREATE_BY")
    private Long createBy;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_DATE")
    private Date createDate;

    /**
     * 修改人ID
     */
    @Column(name = "UPDATE_BY")
    private Long updateBy;

    /**
     * 修改时间
     */
    @Column(name = "UPDATE_DATE")
    private Date updateDate;

    /**
     * 获取商品ID
     *
     * @return PRO_ID - 商品ID
     */
    public Long getProId() {
        return proId;
    }

    /**
     * 设置商品ID
     *
     * @param proId 商品ID
     */
    public void setProId(Long proId) {
        this.proId = proId;
    }

    /**
     * 获取商品名称
     *
     * @return PRO_NAME - 商品名称
     */
    public String getProName() {
        return proName;
    }

    /**
     * 设置商品名称
     *
     * @param proName 商品名称
     */
    public void setProName(String proName) {
        this.proName = proName;
    }

    /**
     * 获取商品原价
     *
     * @return PRO_REAL_PRICE - 商品原价
     */
    public Double getProRealPrice() {
        return proRealPrice;
    }

    /**
     * 设置商品原价
     *
     * @param proRealPrice 商品原价
     */
    public void setProRealPrice(Double proRealPrice) {
        this.proRealPrice = proRealPrice;
    }

    /**
     * 获取商品现价
     *
     * @return PRO_NOW_PRICE - 商品现价
     */
    public Double getProNowPrice() {
        return proNowPrice;
    }

    /**
     * 设置商品现价
     *
     * @param proNowPrice 商品现价
     */
    public void setProNowPrice(Double proNowPrice) {
        this.proNowPrice = proNowPrice;
    }

    /**
     * 获取是否有库存 1：有库存 0：无库存
     *
     * @return IS_STOCK - 是否有库存 1：有库存 0：无库存
     */
    public Byte getIsStock() {
        return isStock;
    }

    /**
     * 设置是否有库存 1：有库存 0：无库存
     *
     * @param isStock 是否有库存 1：有库存 0：无库存
     */
    public void setIsStock(Byte isStock) {
        this.isStock = isStock;
    }

    /**
     * 获取商品简述
     *
     * @return PRO_DESC - 商品简述
     */
    public String getProDesc() {
        return proDesc;
    }

    /**
     * 设置商品简述
     *
     * @param proDesc 商品简述
     */
    public void setProDesc(String proDesc) {
        this.proDesc = proDesc;
    }

    /**
     * 获取商品大小
     *
     * @return PRO_SIZE - 商品大小
     */
    public String getProSize() {
        return proSize;
    }

    /**
     * 设置商品大小
     *
     * @param proSize 商品大小
     */
    public void setProSize(String proSize) {
        this.proSize = proSize;
    }

    /**
     * 获取商品颜色
     *
     * @return PRO_COLOR - 商品颜色
     */
    public String getProColor() {
        return proColor;
    }

    /**
     * 设置商品颜色
     *
     * @param proColor 商品颜色
     */
    public void setProColor(String proColor) {
        this.proColor = proColor;
    }

    /**
     * 获取评价分数
     *
     * @return PRO_SCORE - 评价分数
     */
    public Double getProScore() {
        return proScore;
    }

    /**
     * 设置评价分数
     *
     * @param proScore 评价分数
     */
    public void setProScore(Double proScore) {
        this.proScore = proScore;
    }

    /**
     * 获取商品类型ID
     *
     * @return PRO_TYPE_ID - 商品类型ID
     */
    public Long getProTypeId() {
        return proTypeId;
    }

    /**
     * 设置商品类型ID
     *
     * @param proTypeId 商品类型ID
     */
    public void setProTypeId(Long proTypeId) {
        this.proTypeId = proTypeId;
    }

    /**
     * 获取商品默认图片ID
     *
     * @return PRO_PIC_ID - 商品默认图片ID
     */
    public Long getProPicId() {
        return proPicId;
    }

    /**
     * 设置商品默认图片ID
     *
     * @param proPicId 商品默认图片ID
     */
    public void setProPicId(Long proPicId) {
        this.proPicId = proPicId;
    }

    /**
     * 获取商品默认图片URL
     *
     * @return PRO_PIC_URI - 商品默认图片URL
     */
    public String getProPicUri() {
        return proPicUri;
    }

    /**
     * 设置商品默认图片URL
     *
     * @param proPicUri 商品默认图片URL
     */
    public void setProPicUri(String proPicUri) {
        this.proPicUri = proPicUri;
    }

    /**
     * 获取状态 1:可用状态  0:删除状态
     *
     * @return STATE - 状态 1:可用状态  0:删除状态
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置状态 1:可用状态  0:删除状态
     *
     * @param state 状态 1:可用状态  0:删除状态
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * 获取创建人ID
     *
     * @return CREATE_BY - 创建人ID
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人ID
     *
     * @param createBy 创建人ID
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_DATE - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取修改人ID
     *
     * @return UPDATE_BY - 修改人ID
     */
    public Long getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置修改人ID
     *
     * @param updateBy 修改人ID
     */
    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 获取修改时间
     *
     * @return UPDATE_DATE - 修改时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置修改时间
     *
     * @param updateDate 修改时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}