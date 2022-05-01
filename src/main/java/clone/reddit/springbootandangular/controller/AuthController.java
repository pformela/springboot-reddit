package clone.reddit.springbootandangular.controller;

import clone.reddit.springbootandangular.dto.RegisterRequest;
import clone.reddit.springbootandangular.exceptions.SpringRedditException;
import clone.reddit.springbootandangular.service.AuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody RegisterRequest registerRequest) throws SpringRedditException {
        log.info("test");
        authService.signup(registerRequest);
        return new ResponseEntity<>("User registration successful.", HttpStatus.OK);
    }
}







