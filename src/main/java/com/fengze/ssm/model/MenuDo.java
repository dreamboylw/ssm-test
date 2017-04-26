package com.fengze.ssm.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_prod_type")
public class MenuDo {
    /**
     * 商品类型ID
     */
    @Id
    @Column(name = "TYPE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long typeId;

    /**
     * 商品类型名称
     */
    @Column(name = "TYPE_NAME")
    private String typeName;

    /**
     * 商品类型父ID
     */
    @Column(name = "TYPE_P_ID")
    private Long typePId;

    /**
     * 菜单URL
     */
    @Column(name = "MENU_URI")
    private String menuUri;

    /**
     * 菜单样式 1: 平铺,2: 层级菜单, 3: 图片 ,4: 仅链接
     */
    @Column(name = "MENU_STYLE")
    private Byte menuStyle;

    /**
     *  1:是菜单  0:不是菜单
     */
    @Column(name = "IS_MENU")
    private Byte isMenu;

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
     * 获取商品类型ID
     *
     * @return TYPE_ID - 商品类型ID
     */
    public Long getTypeId() {
        return typeId;
    }

    /**
     * 设置商品类型ID
     *
     * @param typeId 商品类型ID
     */
    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    /**
     * 获取商品类型名称
     *
     * @return TYPE_NAME - 商品类型名称
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 设置商品类型名称
     *
     * @param typeName 商品类型名称
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * 获取商品类型父ID
     *
     * @return TYPE_P_ID - 商品类型父ID
     */
    public Long getTypePId() {
        return typePId;
    }

    /**
     * 设置商品类型父ID
     *
     * @param typePId 商品类型父ID
     */
    public void setTypePId(Long typePId) {
        this.typePId = typePId;
    }

    /**
     * 获取菜单URL
     *
     * @return MENU_URI - 菜单URL
     */
    public String getMenuUri() {
        return menuUri;
    }

    /**
     * 设置菜单URL
     *
     * @param menuUri 菜单URL
     */
    public void setMenuUri(String menuUri) {
        this.menuUri = menuUri;
    }

    /**
     * 获取菜单样式 1: 平铺,2: 层级菜单, 3: 图片 ,4: 仅链接
     *
     * @return MENU_STYLE - 菜单样式 1: 平铺,2: 层级菜单, 3: 图片 ,4: 仅链接
     */
    public Byte getMenuStyle() {
        return menuStyle;
    }

    /**
     * 设置菜单样式 1: 平铺,2: 层级菜单, 3: 图片 ,4: 仅链接
     *
     * @param menuStyle 菜单样式 1: 平铺,2: 层级菜单, 3: 图片 ,4: 仅链接
     */
    public void setMenuStyle(Byte menuStyle) {
        this.menuStyle = menuStyle;
    }

    /**
     * 获取 1:是菜单  0:不是菜单
     *
     * @return IS_MENU -  1:是菜单  0:不是菜单
     */
    public Byte getIsMenu() {
        return isMenu;
    }

    /**
     * 设置 1:是菜单  0:不是菜单
     *
     * @param isMenu  1:是菜单  0:不是菜单
     */
    public void setIsMenu(Byte isMenu) {
        this.isMenu = isMenu;
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