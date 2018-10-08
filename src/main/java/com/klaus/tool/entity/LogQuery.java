/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2017 - 2018
 */

package com.klaus.tool.entity;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import com.klaus.tool.model.Log;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class LogQuery extends BaseQuery<Log>{
    /**
     * 自定义查询字段
     */
    public String ip;
    public String postType;

    /**
       * 组合where查询条件
     */
    public Specification<Log> where() {
        return new Specification<Log>() {
            @Override
            public Predicate toPredicate(Root<Log> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Predicate where = null;
                if (!StringUtils.isEmpty(getIp())) {
                    where = criteriaBuilder.like(root.get("ip").as(String.class), "%" + getIp() + "%");
                }
                if(!StringUtils.isEmpty(getPostType())) {
                	where = criteriaBuilder.and(where,criteriaBuilder.equal(root.get("requestType").as(String.class), getPostType()));
                }
                return where == null ? null : criteriaQuery.where(where).getRestriction();
            }
        };
    }
}
