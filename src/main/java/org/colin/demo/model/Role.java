package org.colin.demo.model;

import org.apache.ibatis.type.Alias;

@Alias("Role")
public class Role {

	
	private Integer id;
	private String roleCode;
	private String roleNm;
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
	public String getRoleNm() {
		return roleNm;
	}
	public void setRoleNm(String roleNm) {
		this.roleNm = roleNm;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", roleCode=" + roleCode + ", roleNm=" + roleNm + "]";
	}
	
	
}
