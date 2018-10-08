/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2017 - 2018
 */

package com.klaus.tool.controller;

import com.klaus.tool.entity.RoleQuery;
import com.klaus.tool.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klaus.tool.entity.R;


/**
* @author klaus mikaelson
*/
@RestController()
@RequestMapping("/api/v1/role")
public class RoleController{

    @Autowired
    RoleService service;

    @GetMapping()
    public R role(RoleQuery query) {
        return service.getPage(query);
    }
    
    @GetMapping(value = "/{id}")
    public R findById(@PathVariable("id") Long id) {
    	return R.ok().put("data", service.findById(id));
    }
    
    @DeleteMapping(value = "/{id}")
    public R deleteById(@PathVariable("id") Long id) {
    	service.deleteById(id);
    	return R.ok();
    }

}
