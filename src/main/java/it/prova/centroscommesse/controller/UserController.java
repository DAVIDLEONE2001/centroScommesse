package it.prova.centroscommesse.controller;

import it.prova.centroscommesse.exception.ResourceNotFoundException;
import it.prova.centroscommesse.model.User;
import it.prova.centroscommesse.repository.UserRepository;
import it.prova.centroscommesse.security.CurrentUser;
import it.prova.centroscommesse.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        System.out.println(userRepository.findById(userPrincipal.getId()));
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }
}
