package com.example.controller;

import com.example.pojo.*;
import com.example.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping
    public Result getStu(String username){
        log.info("查询该学生用户数据（单独）");
        Stu s = userService.getStu(username);
        return Result.success(s);
    }

    @GetMapping("/teacher")
    public Result getTeacher(String username){
        log.info("查询该老师用户数据（单独）");
        Teacher t = userService.getTeacher(username);
        return Result.success(t);
    }

    @GetMapping("/uid2")
    public Result getUID2(String username){
        log.info("查询管理员UID");
        Integer uid2 = userService.getUID2(username);
        return Result.success(uid2);
    }

    @PutMapping
    public Result updateStu(@RequestBody Stu stu){
        log.info("学生权限，修改学生：{}",stu);
        userService.updateStu(stu);
        return Result.success(stu.getUsername(),null);
    }

    @PutMapping("updateTeacher")
    public Result updateTeacher(@RequestBody Teacher t){
        log.info("教师权限，修改教师：{}",t);
        userService.updateTeacher(t);
        return Result.success(t.getUsername(),null);
    }

    @PutMapping("/updateAdmin")
    public Result updateAdmin(@RequestBody User user){
        log.info("学生权限，修改管理员：{}",user);
        userService.updateAdmin(user);
        return Result.success(user.getUsername(),null);
    }


    @PutMapping("/pwd")
    public Result updatePwd(@RequestBody Pwd pwd){
        log.info("修改密码为：{}",pwd.getPassword());
        userService.updatePwd(pwd);
        return Result.success();
    }

    @GetMapping("/pwd2")
    public Result getPwd2(Integer uid2){
        log.info("拿到密码");
        String pwd = userService.getPwd2(uid2);
        return Result.success(pwd);
    }

    @GetMapping("/pwd")
    public Result getPwd(String username){
        log.info("拿到密码");
        String pwd = userService.getPwd(username);
        return Result.success(username,pwd);
    }

    @DeleteMapping("/delete/{username}")
    public Result deleteUser(@PathVariable String username){
        log.info("正在删除用户：{}",username);
        userService.deleteUser(username);
        return Result.success(username,null);
    }
}
