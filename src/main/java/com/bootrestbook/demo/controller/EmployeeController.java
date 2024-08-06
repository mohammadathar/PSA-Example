package com.bootrestbook.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    @ResponseBody
    public String getEmployee(){
        return "This method returns all employees";
    }
}
