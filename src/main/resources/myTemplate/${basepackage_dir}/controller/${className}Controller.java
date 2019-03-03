<#include "/java_copyright.include"/>
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.controller;

import ${basepackage}.dto.qo.${className}Query;
import ${basepackage}.service.${className}Service;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ${basepackage}.dto.R;


/**
* @author klaus mikaelson
*/
@RestController()
@RequestMapping("/api/v1/${classNameLower}")
@Api(tags = "${className}")
public class ${className}Controller{

    @Autowired
    ${className}Service service;
    @ApiOperation("${classNameLower}-list")
    @GetMapping()
    public R ${classNameLower}(${className}Query query) {
        return service.getPage(query);
    }

    @ApiOperation("${classNameLower}-findById")
    @GetMapping(value = "/{id}")
    public R findById(@PathVariable("id") Long id) {
    	return R.ok().put("data",service.findById(id));
    }

    @ApiOperation("${classNameLower}-deleteById")
    @DeleteMapping(value = "/{id}")
    public R deleteById(@PathVariable("id") Long id) {
        service.deleteById(id);
    	return R.ok();
    }

}
