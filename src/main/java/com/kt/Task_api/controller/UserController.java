package com.kt.Task_api.controller;

import com.kt.Task_api.entity.User;
import com.kt.Task_api.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController implements CrudControllerInterface<User> {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Override
    @RequestMapping(method = RequestMethod.GET)
    public List<User> getAll() {
        return this.userService.getAll();
    }

    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getById(@PathVariable Long id) {
        return this.userService.findById(id);
    }

    @Override
    @RequestMapping(method = RequestMethod.POST)
    public User create(User user) {
        return this.userService.save(user);
    }

    @Override
    @RequestMapping(method = RequestMethod.PUT)
    public User update(User user) {
        return this.userService.update(user);
    }

    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        this.userService.deleteById(id);
    }
}
