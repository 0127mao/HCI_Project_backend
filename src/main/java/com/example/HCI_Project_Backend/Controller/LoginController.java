package com.example.HCI_Project_Backend.Controller;


import com.example.HCI_Project_Backend.Domain.User;
import com.example.HCI_Project_Backend.Service.UserService;
import com.example.HCI_Project_Backend.Utils.Result;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/user")
public class LoginController {
    @Resource
    private UserService userService;

    @PostMapping("/login")
    public Result<User> loginController(@RequestParam String uname, @RequestParam String password){
        User user = userService.loginService(uname, password);
        if(user!=null){
            return Result.success(user,"登录成功！");
        }else{
            return Result.error("123","账号或密码错误！");
        }
    }

    @PostMapping("/register")
    public Result<User> registController(@RequestBody User newUser){
        User user = userService.registerService(newUser);
        if(user!=null){
            return Result.success(user,"注册成功！");
        }else{
            return Result.error("456","用户名已存在！");
        }
    }
}