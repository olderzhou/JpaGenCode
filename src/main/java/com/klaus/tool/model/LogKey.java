/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2017 - 2018
 */


package com.klaus.tool.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author klaus mikaelson
 * Database Table:t_log to ClassName:Log
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LogKey  implements Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
		/*
		 * <p>主键，id</p>
		 */
		@Column(name = "id", unique = false, nullable = false, insertable = true, updatable = true, length = 64)	
		private String id;
		
		/*
		 * <p>name</p>
		 */
		@Column(name = "name", unique = false, nullable = false, insertable = true, updatable = true, length = 64)	
		private String name;
		
	
}