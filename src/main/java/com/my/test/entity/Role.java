package com.my.test.entity;

import java.util.Date;

public class Role {
    private Integer id;
    private String roleCode;
    private String roleName;
    private Integer createBy;
    private Date creattionDate;
    private String modifyBy;
    private Integer modifyDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getCreattionDate() {
        return creattionDate;
    }

    public void setCreattionDate(Date creattionDate) {
        this.creattionDate = creattionDate;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Integer getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Integer modifyDate) {
        this.modifyDate = modifyDate;
    }
}
