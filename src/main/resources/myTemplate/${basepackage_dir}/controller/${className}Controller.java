<#include "/java_copyright.include"/>
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.controller;

import ${basepackage}.dto.qo.${className}Query;
import ${basepackage}.service.${className}Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ${basepackage}.dto.R;


/**
* @author klaus mikaelson
*/
@RestController()
@RequestMapping("/api/v1/${classNameLower}")
public class ${className}Controller{

    @Autowired
    ${className}Service service;

    @GetMapping()
    public R ${classNameLower}(${className}Query query) {
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
