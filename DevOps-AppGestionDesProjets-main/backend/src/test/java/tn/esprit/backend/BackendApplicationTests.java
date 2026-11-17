package tn.esprit.backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BackendApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
void testQuiEchoue() {
    org.junit.jupiter.api.Assertions.fail("Echec volontaire pour tester l'email");
}

}
