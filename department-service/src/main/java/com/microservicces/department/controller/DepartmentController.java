package com.microservicces.department.controller;

import com.microservicces.department.entity.Department;
import com.microservicces.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartMent(@RequestBody Department department)
    {
        log.info("inside saveDepartMent Method of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){

        log.info("inside findDepartmentById Method of DepartmentController");
        return departmentService.findByDepartMentId(departmentId);
    }


}
