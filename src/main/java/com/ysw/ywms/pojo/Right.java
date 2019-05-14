package com.ysw.ywms.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 权限
 */
public class Right implements Serializable {
    /**
     * 权限类型：菜单
     */
    public static int PTYPE_MENU = 1;
    /**
     * 权限类型：按钮
     */
    public static int PTYPE_BUTTON = 2;

    private Long pid;       // 权限id
    private String pname;   // 权限名称
    private Integer ptype;  // 权限类型：1.菜单；2.按钮
    private String pval;    // 权限值，shiro的权限控制表达式
    private Date createDate;   // 创建时间
    private Date modifyDate;   // 修改时间


    public static int getPtypeMenu() {
        return PTYPE_MENU;
    }

    public static void setPtypeMenu(int ptypeMenu) {
        PTYPE_MENU = ptypeMenu;
    }

    public static int getPtypeButton() {
        return PTYPE_BUTTON;
    }

    public static void setPtypeButton(int ptypeButton) {
        PTYPE_BUTTON = ptypeButton;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getPtype() {
        return ptype;
    }

    public void setPtype(Integer ptype) {
        this.ptype = ptype;
    }

    public String getPval() {
        return pval;
    }

    public void setPval(String pval) {
        this.pval = pval;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}
