package com.welearn.controller;

import java.util.List;

import javax.annotation.Resource;  
import javax.servlet.http.HttpServletRequest;  
  

import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
  

import com.welearn.domain.*;
import com.welearn.service.*;;  
  
@Controller  
@RequestMapping("/user")  
public class UserController {  
    @Resource  
    private ITestService userService;  
      
    @RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));  
        Employees employee = this.userService.getEmployeeById(userId);  
        model.addAttribute("user", employee);  
        return "showUser";  
    }  
    
    @RequestMapping("/showAll")  
    public String showAll(HttpServletRequest request,Model model){
    	String username = request.getParameter("name").toString();  
        List<Employees> employee = this.userService.getEmpsByNameLike(username);
        model.addAttribute("user", employee);  
        return "showUser";  
    }  
}  