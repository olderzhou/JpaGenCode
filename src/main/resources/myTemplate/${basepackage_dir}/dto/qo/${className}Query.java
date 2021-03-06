<#include "/java_copyright.include"/>
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.dto.qo;

import ${basepackage}.model.${className};
import io.swagger.annotations.ApiModel;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;


@ApiModel(value = "${className}Query", description = "base query obj", parent = "${basepackage}.dto.qo.${className}Query")
public class ${className}Query extends BaseQuery<${className}>{
    /**
     * 自定义查询字段
     */
    //public String xxx;

    /**
     * 组合where查询条件
    */
    @Override
    public Specification<${className}> where() {
        return new Specification<${className}>() {
            @Override
            public Predicate toPredicate(Root<${className}> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Predicate where = null;
                if (!StringUtils.isEmpty(getKeyword())) {
                    where = criteriaBuilder.like(root.get("acctNbr").as(String.class), "%" + getKeyword() + "%");
                }
                return where == null ? null : criteriaQuery.where(where).getRestriction();
            }
        };
    }
}
