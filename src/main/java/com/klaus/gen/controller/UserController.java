/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2017 - 2019
 */

package com.klaus.gen.controller;

import com.klaus.gen.dto.qo.UserQuery;
import com.klaus.gen.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klaus.gen.dto.R;


/**
* @author klaus mikaelson
*/
@RestController()
@RequestMapping("/api/v1/user")
@Api(tags = "User")
public class UserController{

    @Autowired
    UserService service;
    @ApiOperation("user-list")
    @GetMapping()
    public R user(UserQuery query) {
        return service.getPage(query);
    }

    @ApiOperation("user-findById")
    @GetMapping(value = "/{id}")
    public R findById(@PathVariable("id") Long id) {
    	return R.ok().put("data",service.findById(id));
    }

    @ApiOperation("user-deleteById")
    @DeleteMapping(value = "/{id}")
    public R deleteById(@PathVariable("id") Long id) {
        service.deleteById(id);
    	return R.ok();
    }

}
