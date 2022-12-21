package at.beefburger.herzelnbackend.controllers;

import at.beefburger.herzelnbackend.models.dtos.UserDto;
import at.beefburger.herzelnbackend.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController()
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping ("/all")
    public ResponseEntity<List<UserDto>> createUser() {
        return ResponseEntity.ok(userService.getAllUsers());
    }
}
