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
 * @表名 t_school
 * @author klaus mikaelson
 * Database Table:t_school to ClassName:School
 */
@Entity
@Table(name = "t_school")
@IdClass(SchoolKey.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class School implements Serializable{

	private static final long serialVersionUID = 5454155825314635342L;

	public static final String TABLE_NAME = "t_school";

	/**
	 * id
	 */
	@Id
	@Column(name="id", nullable=false, length = 19)
	private Long id;

	/**
	 * school code in education org record
	 */
	@Id
	@Column(name="code", nullable=false, length = 128)
	private String code;

	/**
	 * school chinese name
	 */
	@Column(name="name_zh", nullable=false, length = 128)
	private String nameZh;

	/**
	 * createBy
	 */
	@Column(name="create_by", nullable=false, length = 19)
	private Long createBy;

	/**
	 * lastUpdateBy
	 */
	@Column(name="last_update_by", nullable=false, length = 19)
	private Long lastUpdateBy;

	/**
	 * createDate
	 */
	@Column(name="create_date", nullable=false, length = 19)
	private Date createDate;

	/**
	 * lastUpdateDate
	 */
	@Column(name="last_update_date", nullable=false, length = 19)
	private Date lastUpdateDate;

	/**
	 * school english name
	 */
	@Column(name="name_en", nullable=false, length = 128)
	private String nameEn;

	/**
	 * school type， enum(Public)
	 */
	@Column(name="school_type", nullable=false, length = 128)
	private String schoolType;

	/**
	 * school desc
	 */
	@Column(name="desc_info", nullable=false, length = 128)
	private String descInfo;


    public Map<String, Serializable> convertToMap() {
        HashMap<String, Serializable> map = new HashMap<String, Serializable>();
        map.put("id", id);
        map.put("code", code);
        map.put("nameZh", nameZh);
        map.put("createBy", createBy);
        map.put("lastUpdateBy", lastUpdateBy);
        map.put("createDate", createDate);
        map.put("lastUpdateDate", lastUpdateDate);
        map.put("nameEn", nameEn);
        map.put("schoolType", schoolType);
        map.put("descInfo", descInfo);
        return map;
    }

    public void updateFromMap(Map<String, Serializable> map) {
        if(map.containsKey("id")) {
        	this.setId(DataTypeUtils.getLongValue(map.get("id")));
        }
        if(map.containsKey("code")) {
        	this.setCode(DataTypeUtils.getStringValue(map.get("code")));
        }
        if(map.containsKey("nameZh")) {
        	this.setNameZh(DataTypeUtils.getStringValue(map.get("nameZh")));
        }
        if(map.containsKey("createBy")) {
        	this.setCreateBy(DataTypeUtils.getLongValue(map.get("createBy")));
        }
        if(map.containsKey("lastUpdateBy")) {
        	this.setLastUpdateBy(DataTypeUtils.getLongValue(map.get("lastUpdateBy")));
        }
        if(map.containsKey("createDate")) {
        	this.setCreateDate(DataTypeUtils.getDateValue(map.get("createDate")));
        }
        if(map.containsKey("lastUpdateDate")) {
        	this.setLastUpdateDate(DataTypeUtils.getDateValue(map.get("lastUpdateDate")));
        }
        if(map.containsKey("nameEn")) {
        	this.setNameEn(DataTypeUtils.getStringValue(map.get("nameEn")));
        }
        if(map.containsKey("schoolType")) {
        	this.setSchoolType(DataTypeUtils.getStringValue(map.get("schoolType")));
        }
        if(map.containsKey("descInfo")) {
        	this.setDescInfo(DataTypeUtils.getStringValue(map.get("descInfo")));
        }
    }

}
