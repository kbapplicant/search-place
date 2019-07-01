package jhchv.searchplace.controller.token;

import jhchv.searchplace.config.security.JwtManager;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/token")
@RequiredArgsConstructor
public class TokenController {

    private final JwtManager jwtManager;

    @PostMapping
    public Token doPost(Authentication auth) {
        return new Token(jwtManager.create(auth.getName()));
    }

}