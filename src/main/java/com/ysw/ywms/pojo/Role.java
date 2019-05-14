package com.ysw.ywms.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色类
 */
public class Role implements Serializable {
    private Long rid;       // 角色id
    private String rname;   // 角色名，用于显示
    private String rdesc;   // 角色描述
    private String rval;    // 角色值，用于权限判断
    private Date createDate;   // 创建时间
    private Date modifyDate;   // 修改时间

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRdesc() {
        return rdesc;
    }

    public void setRdesc(String rdesc) {
        this.rdesc = rdesc;
    }

    public String getRval() {
        return rval;
    }

    public void setRval(String rval) {
        this.rval = rval;
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
