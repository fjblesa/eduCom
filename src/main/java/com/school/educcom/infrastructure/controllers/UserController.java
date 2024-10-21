package com.school.educcom.infrastructure.controllers;

import static com.school.educcom.domain.enums.Role.STUDENT;
import static com.school.educcom.domain.enums.Role.TEACHER;

import com.school.educcom.application.service.UserService;
import com.school.educcom.domain.model.UserDTO;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
@Tag(name = "User controller", description = "This controller its to get users By id or for role")
public class UserController {

  private final UserService userService;

  // Get user
  @GetMapping("/")
  public UserDTO getUser(@RequestParam Long userId) {
    return userService.findById(userId);
  }

  @GetMapping("/teachers")
  public List<UserDTO> getTeacherUsers() {
    return userService.findByRole(TEACHER);
  }

  @GetMapping("/students")
  public List<UserDTO> getStudentUsers() {
    return userService.findByRole(STUDENT);
  }

  @PostMapping("/")
  public UserDTO updateUser(@RequestBody UserDTO userRequest) {
    return userService.updateUser(userRequest);
  }

  @GetMapping("/user-name")
  public String getUserName(@RequestParam Long userId){
    return userService.getUserName(userId);
  }
}
