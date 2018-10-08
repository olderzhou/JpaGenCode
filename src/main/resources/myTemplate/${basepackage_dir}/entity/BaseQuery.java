<#include "/java_copyright.include"/>
package ${basepackage}.entity;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import com.klaus.tool.entity.BaseQuery;

import lombok.Data;

/**
 * Created by chuangang.li on 2017/1/18.
 */
@Data
public class BaseQuery<T> {
    private int pageIndex = 0;

    private int pageSize = 20;

    private String keyword;

    private String sort;

    private boolean isAsc;

    public PageRequest getPageReq() {
        //不排序
        if (StringUtils.isEmpty(this.sort)) {
            return new PageRequest(this.pageIndex, this.pageSize);
        }
        //需要排序，通用分页只支持单字段
        return new PageRequest(this.pageIndex, this.pageSize, new Sort(this.isAsc ? Sort.Direction.ASC : Sort.Direction.DESC, this.sort));
    }

    public Specification<T> where() {
        return null;
    }
    
}
