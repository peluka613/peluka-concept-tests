package edu.springbootdemo.edu.springbootdemo.controller;

import edu.springbootdemo.edu.springbootdemo.model.request.UserDetailRequestModel;
import edu.springbootdemo.edu.springbootdemo.model.response.UserRest;
import edu.springbootdemo.edu.springbootdemo.service.UserService;
import edu.springbootdemo.shared.dto.UserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String getUser() {
        return "getUser";
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailRequestModel userDetails) {

        UserRest userRest = new UserRest();

        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userDetails, userDto);

        userDto = userService.createUser(userDto);
        BeanUtils.copyProperties(userDto, userRest);

        return userRest;
    }

    @PutMapping
    public String updateUser() {
        return "updateUser";
    }

    @DeleteMapping
    public String deleteUser() {
        return "deleteUser";
    }
}
