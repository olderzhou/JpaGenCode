/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2017 - 2019
 */

package com.klaus.gen.dto.qo;

import com.klaus.gen.model.User;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class UserQuery extends BaseQuery<User>{
    /**
     * 自定义查询字段
     */
    //public String xxx;

    /**
     * 组合where查询条件
    */
    @Override
    public Specification<User> where() {
        return new Specification<User>() {
            @Override
            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Predicate where = null;
                if (!StringUtils.isEmpty(getKeyword())) {
                    where = criteriaBuilder.like(root.get("acctNbr").as(String.class), "%" + getKeyword() + "%");
                }
                return where == null ? null : criteriaQuery.where(where).getRestriction();
            }
        };
    }
}
