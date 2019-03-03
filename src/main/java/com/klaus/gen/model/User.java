/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2017 - 2019
 */

package com.klaus.gen.model;

import com.klaus.gen.utils.DataTypeUtils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;

/**
 * @表名 t_user
 * @author klaus mikaelson
 * Database Table:t_user to ClassName:User
 */
@Entity
@Table(name = "t_user")
@IdClass(UserKey.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable{

	private static final long serialVersionUID = 5454155825314635342L;

	public static final String TABLE_NAME = "t_user";

	/**
	 * id
	 */
	@Id
	@Column(name="id", nullable=false, length = 19)
	private Long id;

	/**
	 * schoolId
	 */
	@Column(name="school_id", nullable=false, length = 19)
	private Long schoolId;

	/**
	 * idCode
	 */
	@Id
	@Column(name="id_code", nullable=false, length = 50)
	private String idCode;

	/**
	 * username
	 */
	@Column(name="username", nullable=true, length = 20)
	private String username;

	/**
	 * email
	 */
	@Column(name="email", nullable=true, length = 20)
	private String email;

	/**
	 * mobilePhone
	 */
	@Column(name="mobile_phone", nullable=true, length = 50)
	private String mobilePhone;

	/**
	 * phone
	 */
	@Column(name="phone", nullable=true, length = 11)
	private String phone;

	/**
	 * userType
	 */
	@Column(name="user_type", nullable=true, length = 8)
	private String userType;

	/**
	 * descInfo
	 */
	@Column(name="desc_info", nullable=true, length = 50)
	private String descInfo;

	/**
	 * createDate
	 */
	@Column(name="create_date", nullable=true, length = 19)
	private Date createDate;

	/**
	 * lastUpdateDate
	 */
	@Column(name="last_update_date", nullable=true, length = 19)
	private Date lastUpdateDate;

	/**
	 * createBy
	 */
	@Column(name="create_by", nullable=true, length = 19)
	private Long createBy;

	/**
	 * lastUpdateBy
	 */
	@Column(name="last_update_by", nullable=true, length = 19)
	private Long lastUpdateBy;


    public Map<String, Serializable> convertToMap() {
        HashMap<String, Serializable> map = new HashMap<String, Serializable>();
        map.put("id", id);
        map.put("schoolId", schoolId);
        map.put("idCode", idCode);
        map.put("username", username);
        map.put("email", email);
        map.put("mobilePhone", mobilePhone);
        map.put("phone", phone);
        map.put("userType", userType);
        map.put("descInfo", descInfo);
        map.put("createDate", createDate);
        map.put("lastUpdateDate", lastUpdateDate);
        map.put("createBy", createBy);
        map.put("lastUpdateBy", lastUpdateBy);
        return map;
    }

    public void updateFromMap(Map<String, Serializable> map) {
        if(map.containsKey("id")) {
        	this.setId(DataTypeUtils.getLongValue(map.get("id")));
        }
        if(map.containsKey("schoolId")) {
        	this.setSchoolId(DataTypeUtils.getLongValue(map.get("schoolId")));
        }
        if(map.containsKey("idCode")) {
        	this.setIdCode(DataTypeUtils.getStringValue(map.get("idCode")));
        }
        if(map.containsKey("username")) {
        	this.setUsername(DataTypeUtils.getStringValue(map.get("username")));
        }
        if(map.containsKey("email")) {
        	this.setEmail(DataTypeUtils.getStringValue(map.get("email")));
        }
        if(map.containsKey("mobilePhone")) {
        	this.setMobilePhone(DataTypeUtils.getStringValue(map.get("mobilePhone")));
        }
        if(map.containsKey("phone")) {
        	this.setPhone(DataTypeUtils.getStringValue(map.get("phone")));
        }
        if(map.containsKey("userType")) {
        	this.setUserType(DataTypeUtils.getStringValue(map.get("userType")));
        }
        if(map.containsKey("descInfo")) {
        	this.setDescInfo(DataTypeUtils.getStringValue(map.get("descInfo")));
        }
        if(map.containsKey("createDate")) {
        	this.setCreateDate(DataTypeUtils.getDateValue(map.get("createDate")));
        }
        if(map.containsKey("lastUpdateDate")) {
        	this.setLastUpdateDate(DataTypeUtils.getDateValue(map.get("lastUpdateDate")));
        }
        if(map.containsKey("createBy")) {
        	this.setCreateBy(DataTypeUtils.getLongValue(map.get("createBy")));
        }
        if(map.containsKey("lastUpdateBy")) {
        	this.setLastUpdateBy(DataTypeUtils.getLongValue(map.get("lastUpdateBy")));
        }
    }

}
