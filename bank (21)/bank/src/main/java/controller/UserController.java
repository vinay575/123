package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.UserDto;
import service.UserService;


@RestController
@CrossOrigin                       //used to connect frnt end 
@RequestMapping("api/v1/User") //api setting  path 
public class UserController {


    @Autowired
    private UserService userService;


    @PostMapping(path = "/save")     //posting valuse  "/save"-->saves the data 
    public String saveEmployee(@RequestBody UserDto userDto) 
    {
        String id = userService.addUser(userDto);
        return id;
    }


}