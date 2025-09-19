package org.Infointerface.controller;

import org.Infointerface.entity.GyDepartmentDto;
import org.Infointerface.entity.Result;
import org.Infointerface.entity.RsPersonBaseInfoDto;
import org.Infointerface.services.IBaseinfoService;
import org.Infointerface.services.IGydepartmentService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

// 控制器类
@Api(tags = "信息模块")
@RestController
@RequestMapping("/api")
public class InfoConstroller {

    // 自动注入
    @Autowired
    private IBaseinfoService baseinfoService;

    @Autowired
    private IGydepartmentService departmentService;

    @Autowired
    private ObjectMapper objectMapper;
    private Log log = LogFactory.getLog(getClass());

    // 获取人员基本信息
    @ApiImplicitParam(name = "id", value = "人员ID", required = true)
    @ApiOperation(value = "获取人员基本信息")
    @GetMapping("/baseinfo/{id}")
    public Result<RsPersonBaseInfoDto> baseinfo(@PathVariable String id) throws JsonProcessingException {
        RsPersonBaseInfoDto personDto = baseinfoService.getPersonDtoById(id);

        log.info("✅ 返回参数: " +
                objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(personDto));
        return Result.success(personDto);
    }

    // 获取部门信息
    @ApiImplicitParam(name = "departmentid", value = "部门ID", required = true)
    @ApiOperation(value = "获取部门信息")
    @GetMapping("/department/{departmentid}")
    public Result<GyDepartmentDto> departResult(@PathVariable String departmentid) throws JsonProcessingException {
        GyDepartmentDto departmentDto = departmentService.getDepartmentDtoById(departmentid);

        log.info("✅ 返回参数: " +
                objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(departmentDto));
        return Result.success(departmentDto);

    }
}
