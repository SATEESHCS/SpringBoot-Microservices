package com.microservicces.department.service;

import com.microservicces.department.entity.Department;
import com.microservicces.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {


    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("inside saveDepartment method of DepartmentService");
        return  departmentRepository.save(department);
    }

    public Department findByDepartMentId(Long departmentId) {

        return departmentRepository.findByDepartmentId(departmentId);
    }
}
