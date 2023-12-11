package com.example.Weeek7.controllers;

import com.example.Weeek7.dto.JwtRequest;
import com.example.Weeek7.dto.RegistrationUserDto;
import com.example.Weeek7.entity.ActivationToken;
import com.example.Weeek7.entity.User;
import com.example.Weeek7.service.AuthService;
import com.example.Weeek7.service.EmailService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.example.Weeek7.config.SwaggerConfig.AUTH;


@Api(tags = AUTH)
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class AuthController {
    private final AuthService authService;

    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthToken(@RequestBody JwtRequest authRequest) {
        return authService.createAuthToken(authRequest);
    }

    @PostMapping("/registration")
    public ResponseEntity<?> createNewUser(@RequestBody RegistrationUserDto registrationUserDto) {
        return authService.createNewUser(registrationUserDto);
    }

    @GetMapping("/activate")
    public ResponseEntity<String> activateUserAccount(@RequestParam("token") String token) {
        authService.activateUserByToken(token);
        return ResponseEntity.ok("Активация аккаунта прошла успешно!");
    }

}
