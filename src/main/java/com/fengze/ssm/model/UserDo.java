package com.fengze.ssm.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_user")
public class UserDo {
    /**
     * 会员id
     */
    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    /**
     * 会员名
     */
    @Column(name = "USER_NAME")
    private String userName;

    /**
     * 会员性别:0代表男，1代表女
     */
    @Column(name = "USER_SEX")
    private String userSex;

    /**
     * 登录密码
     */
    @Column(name = "PASS_WORD")
    private String passWord;

    /**
     * 手机号码
     */
    @Column(name = "USER_PHONE")
    private String userPhone;

    /**
     * 真实名字
     */
    @Column(name = "REAL_NAME")
    private String realName;

    /**
     * 邮箱
     */
    @Column(name = "EMAIL")
    private String email;

    /**
     * 会员类型：1：游客用户 0：注册会员用户
     */
    @Column(name = "USER_TYPE")
    private String userType;

    /**
     * 状态 1:可用状态  0:删除状态  2:锁定状态
     */
    @Column(name = "STATE")
    private String state;

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
     * 获取会员id
     *
     * @return USER_ID - 会员id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置会员id
     *
     * @param userId 会员id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取会员名
     *
     * @return USER_NAME - 会员名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置会员名
     *
     * @param userName 会员名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取会员性别:0代表男，1代表女
     *
     * @return USER_SEX - 会员性别:0代表男，1代表女
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * 设置会员性别:0代表男，1代表女
     *
     * @param userSex 会员性别:0代表男，1代表女
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    /**
     * 获取登录密码
     *
     * @return PASS_WORD - 登录密码
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置登录密码
     *
     * @param passWord 登录密码
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * 获取手机号码
     *
     * @return USER_PHONE - 手机号码
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 设置手机号码
     *
     * @param userPhone 手机号码
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * 获取真实名字
     *
     * @return REAL_NAME - 真实名字
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置真实名字
     *
     * @param realName 真实名字
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取邮箱
     *
     * @return EMAIL - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取会员类型：1：游客用户 0：注册会员用户
     *
     * @return USER_TYPE - 会员类型：1：游客用户 0：注册会员用户
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 设置会员类型：1：游客用户 0：注册会员用户
     *
     * @param userType 会员类型：1：游客用户 0：注册会员用户
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * 获取状态 1:可用状态  0:删除状态  2:锁定状态
     *
     * @return STATE - 状态 1:可用状态  0:删除状态  2:锁定状态
     */
    public String getState() {
        return state;
    }

    /**
     * 设置状态 1:可用状态  0:删除状态  2:锁定状态
     *
     * @param state 状态 1:可用状态  0:删除状态  2:锁定状态
     */
    public void setState(String state) {
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