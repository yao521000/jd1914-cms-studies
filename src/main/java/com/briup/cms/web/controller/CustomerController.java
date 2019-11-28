package com.briup.cms.web.controller;


import com.briup.cms.bean.Customer;
import com.briup.cms.service.ICustomerService;
import com.briup.cms.util.Message;
import com.briup.cms.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "客户相关接口 ")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("/showById/{id}")
    @ApiOperation("根据ID查询客户")
    @ApiImplicitParam(name="id",value = "顾客id",paramType = "query",dataType = "int")
    public Customer showById(@PathVariable int id){
        return customerService.findById(id);
    }


    @GetMapping("/aa")
    @ApiOperation("测试")
    public Message<Customer> aa(Customer customer){
        return MessageUtil.success(customer);
    }

    @GetMapping("/bb")
    @ApiOperation("测试2")
    public Message<Customer> bb(Customer customer){
        return MessageUtil.success(customer);
    }


}
