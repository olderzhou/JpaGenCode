/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2017 - 2019
 */

package com.klaus.gen.controller;

import com.klaus.gen.dto.qo.SchoolQuery;
import com.klaus.gen.service.SchoolService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klaus.gen.dto.R;


/**
* @author klaus mikaelson
*/
@RestController()
@RequestMapping("/api/v1/school")
@Api(tags = "School")
public class SchoolController{

    @Autowired
    SchoolService service;
    @ApiOperation("school-list")
    @GetMapping()
    public R school(SchoolQuery query) {
        return service.getPage(query);
    }

    @ApiOperation("school-findById")
    @GetMapping(value = "/{id}")
    public R findById(@PathVariable("id") Long id) {
    	return R.ok().put("data",service.findById(id));
    }

    @ApiOperation("school-deleteById")
    @DeleteMapping(value = "/{id}")
    public R deleteById(@PathVariable("id") Long id) {
        service.deleteById(id);
    	return R.ok();
    }

}
