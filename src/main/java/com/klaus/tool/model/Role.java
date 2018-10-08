/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2017 - 2018
 */

package com.klaus.tool.model;

import com.klaus.tool.utils.DataTypeUtils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;

/**
 * @表名 t_role
 * @author klaus mikaelson
 * Database Table:t_role to ClassName:Role
 */
@Entity
@Table(name = "t_role")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role implements Serializable{

	private static final long serialVersionUID = 5454155825314635342L;

	public static final String TABLE_NAME = "t_role";

	/*
	 * <p>id</p>
	 */
	@Id
	@Column(name="id", nullable=false, length = 19)
	private Long id;

	/*
	 * <p>createBy</p>
	 */
	@Column(name="create_by", nullable=true, length = 255)
	private String createBy;

	/*
	 * <p>createTime</p>
	 */
	@Column(name="create_time", nullable=true, length = 19)
	private Date createTime;

	/*
	 * <p>updateBy</p>
	 */
	@Column(name="update_by", nullable=true, length = 255)
	private String updateBy;

	/*
	 * <p>updateTime</p>
	 */
	@Column(name="update_time", nullable=true, length = 19)
	private Date updateTime;

	/*
	 * <p>name</p>
	 */
	@Column(name="name", nullable=true, length = 255)
	private String name;

	/*
	 * <p>delFlag</p>
	 */
	@Column(name="del_flag", nullable=true, length = 10)
	private Integer delFlag;

	/*
	 * <p>defaultRole</p>
	 */
	@Column(name="default_role", nullable=true, length = 3)
	private Integer defaultRole;


    public Map<String, Serializable> convertToMap() {
        HashMap<String, Serializable> map = new HashMap<String, Serializable>();
        map.put("id", id);
        map.put("createBy", createBy);
        map.put("createTime", createTime);
        map.put("updateBy", updateBy);
        map.put("updateTime", updateTime);
        map.put("name", name);
        map.put("delFlag", delFlag);
        map.put("defaultRole", defaultRole);
        return map;
    }

    public void updateFromMap(Map<String, Serializable> map) {
        if(map.containsKey("id")) this.setId(DataTypeUtils.getLongValue(map.get("id")));
        if(map.containsKey("createBy")) this.setCreateBy(DataTypeUtils.getStringValue(map.get("createBy")));
        if(map.containsKey("createTime")) this.setCreateTime(DataTypeUtils.getDateValue(map.get("createTime")));
        if(map.containsKey("updateBy")) this.setUpdateBy(DataTypeUtils.getStringValue(map.get("updateBy")));
        if(map.containsKey("updateTime")) this.setUpdateTime(DataTypeUtils.getDateValue(map.get("updateTime")));
        if(map.containsKey("name")) this.setName(DataTypeUtils.getStringValue(map.get("name")));
        if(map.containsKey("delFlag")) this.setDelFlag(DataTypeUtils.getIntegerValue(map.get("delFlag")));
        if(map.containsKey("defaultRole")) this.setDefaultRole(DataTypeUtils.getIntegerValue(map.get("defaultRole")));
    }

}
