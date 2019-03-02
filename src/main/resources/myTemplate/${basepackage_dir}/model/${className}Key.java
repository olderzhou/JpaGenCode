<#include "/java_copyright.include"/>
${gg.setIgnoreOutput(table.pkCount <= 1)}
<#assign className = table.className>
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author klaus mikaelson
 * ${table}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ${className}Key  implements Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	<#list table.columns as column>
		<#if column.pk>
		/**
		 * ${column.columnAlias}
		 */
		<#if column.isDateTimeColumn>
		@Temporal(TemporalType.DATE)
		</#if>
		@Column(name = "${column.sqlName}", unique = ${column.unique?string}, nullable = ${column.nullable?string}, insertable = true, updatable = true, length = ${column.size})	
		private ${column.javaType} ${column.columnNameLower};
		
		</#if>
	</#list>
	
}