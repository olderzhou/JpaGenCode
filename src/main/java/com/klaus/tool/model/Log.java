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
 * @表名 t_log
 * @author klaus mikaelson
 * Database Table:t_log to ClassName:Log
 */
@Entity
@Table(name = "t_log")
@IdClass(LogKey.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Log implements Serializable{

	private static final long serialVersionUID = 5454155825314635342L;

	public static final String TABLE_NAME = "t_log";

	/*
	 * <p>主键，id</p>
	 */
	@Id
	@Column(name="id", nullable=false, length = 64)
	private String id;

	/*
	 * <p>创建人</p>
	 */
	@Column(name="create_by", nullable=true, length = 255)
	private String createBy;

	/*
	 * <p>创建时间</p>
	 */
	@Column(name="create_time", nullable=true, length = 19)
	private Date createTime;

	/*
	 * <p>isDel</p>
	 */
	@Column(name="is_del", nullable=true, length = 10)
	private Integer isDel;

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
	 * <p>costTime</p>
	 */
	@Column(name="cost_time", nullable=true, length = 10)
	private Integer costTime;

	/*
	 * <p>ip</p>
	 */
	@Column(name="ip", nullable=true, length = 255)
	private String ip;

	/*
	 * <p>ipInfo</p>
	 */
	@Column(name="ip_info", nullable=true, length = 255)
	private String ipInfo;

	/*
	 * <p>name</p>
	 */
	@Id
	@Column(name="name", nullable=false, length = 64)
	private String name;

	/*
	 * <p>requestParam</p>
	 */
	@Column(name="request_param", nullable=true, length = 255)
	private String requestParam;

	/*
	 * <p>requestType</p>
	 */
	@Column(name="request_type", nullable=true, length = 255)
	private String requestType;

	/*
	 * <p>requestUrl</p>
	 */
	@Column(name="request_url", nullable=true, length = 255)
	private String requestUrl;

	/*
	 * <p>username</p>
	 */
	@Column(name="username", nullable=true, length = 255)
	private String username;


    public Map<String, Serializable> convertToMap() {
        HashMap<String, Serializable> map = new HashMap<String, Serializable>();
        map.put("id", id);
        map.put("createBy", createBy);
        map.put("createTime", createTime);
        map.put("isDel", isDel);
        map.put("updateBy", updateBy);
        map.put("updateTime", updateTime);
        map.put("costTime", costTime);
        map.put("ip", ip);
        map.put("ipInfo", ipInfo);
        map.put("name", name);
        map.put("requestParam", requestParam);
        map.put("requestType", requestType);
        map.put("requestUrl", requestUrl);
        map.put("username", username);
        return map;
    }

    public void updateFromMap(Map<String, Serializable> map) {
        if(map.containsKey("id")) this.setId(DataTypeUtils.getStringValue(map.get("id")));
        if(map.containsKey("createBy")) this.setCreateBy(DataTypeUtils.getStringValue(map.get("createBy")));
        if(map.containsKey("createTime")) this.setCreateTime(DataTypeUtils.getDateValue(map.get("createTime")));
        if(map.containsKey("isDel")) this.setIsDel(DataTypeUtils.getIntegerValue(map.get("isDel")));
        if(map.containsKey("updateBy")) this.setUpdateBy(DataTypeUtils.getStringValue(map.get("updateBy")));
        if(map.containsKey("updateTime")) this.setUpdateTime(DataTypeUtils.getDateValue(map.get("updateTime")));
        if(map.containsKey("costTime")) this.setCostTime(DataTypeUtils.getIntegerValue(map.get("costTime")));
        if(map.containsKey("ip")) this.setIp(DataTypeUtils.getStringValue(map.get("ip")));
        if(map.containsKey("ipInfo")) this.setIpInfo(DataTypeUtils.getStringValue(map.get("ipInfo")));
        if(map.containsKey("name")) this.setName(DataTypeUtils.getStringValue(map.get("name")));
        if(map.containsKey("requestParam")) this.setRequestParam(DataTypeUtils.getStringValue(map.get("requestParam")));
        if(map.containsKey("requestType")) this.setRequestType(DataTypeUtils.getStringValue(map.get("requestType")));
        if(map.containsKey("requestUrl")) this.setRequestUrl(DataTypeUtils.getStringValue(map.get("requestUrl")));
        if(map.containsKey("username")) this.setUsername(DataTypeUtils.getStringValue(map.get("username")));
    }

}
