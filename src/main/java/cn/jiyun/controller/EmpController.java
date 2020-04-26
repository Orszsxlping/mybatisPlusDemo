package cn.jiyun.controller;

import cn.jiyun.pojo.Emp;
import cn.jiyun.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EmpController {

    @Autowired
    EmpService empService;

    @RequestMapping("list")
    @ResponseBody
    public List<Emp> list(){
        return empService.findEmpAll(new Emp());
    }
}
