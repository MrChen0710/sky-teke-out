package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;
import com.sky.result.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface EmployeeService {

    /**
     * 员工登录
     *
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 员工注册
     *
     * @param employeeDTO
     * @return
     */
    Employee save(EmployeeDTO employeeDTO);


    /**
     * 查询员工
     *
     * @param employeePageQueryDTO
     * @return
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);


    /**
     * 启用禁用员工账号
     *
     * @param status id
     * @return
     */
    void startOrStop(Integer status, long id);

    /**
     * 编辑员工信息
     *
     * @return
     */
    void editEmployee(EmployeeDTO employeeDTO);

    Employee getById(Long id);
}
