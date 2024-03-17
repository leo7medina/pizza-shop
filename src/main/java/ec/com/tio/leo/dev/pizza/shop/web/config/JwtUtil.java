package ec.com.tio.leo.dev.pizza.shop.web.config;

import ch.qos.logback.core.util.TimeUtil;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@Component
public class JwtUtil {

    private static final String SECRET_KEY = "pl4taz1_p1zz4";
    private static final Algorithm ALGORITHM = Algorithm.HMAC256(SECRET_KEY);

    public String create(String username) {
        return JWT.create()
                .withSubject(username)
                .withIssuer("platzi-piazza")
                .withIssuedAt(new Date())
                .withExpiresAt(new Date(System.currentTimeMillis() + + TimeUnit.DAYS.toMillis(15)))
                .sign(ALGORITHM);
    }

    public boolean isValid(String jwt) {
        try {
            JWT.require(ALGORITHM).build().verify(jwt);
            return true;
        } catch (JWTVerificationException e) {
            return false;
        }
    }

    public String getUserName(String jwt) {
        return JWT.require(ALGORITHM).build().verify(jwt).getSubject();
    }
}
