package gnipaanton.clear_solutions_test_task.controller;

import gnipaanton.clear_solutions_test_task.repository.model.enitity.UserEntity;
import gnipaanton.clear_solutions_test_task.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("")
    public ResponseEntity createUser(@RequestBody UserEntity user){
        userService.save(user);
        return ResponseEntity.ok(user);
    }
}
