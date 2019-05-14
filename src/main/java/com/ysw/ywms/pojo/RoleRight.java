package com.ysw.ywms.pojo;

import java.io.Serializable;

/**
 *
 */
public class RoleRight implements Serializable {

    private Long roleId;
    private Long rightId;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getRightId() {
        return rightId;
    }

    public void setRightId(Long rightId) {
        this.rightId = rightId;
    }
}
