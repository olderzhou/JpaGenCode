/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2017 - 2019
 */


package com.klaus.gen.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author klaus mikaelson
 * Database Table:t_user to ClassName:User
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserKey  implements Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
		/**
		 * id
		 */
		@Column(name = "id", unique = false, nullable = false, insertable = true, updatable = true, length = 19)	
		private Long id;
		
		/**
		 * idCode
		 */
		@Column(name = "id_code", unique = false, nullable = false, insertable = true, updatable = true, length = 50)	
		private String idCode;
		
	
}