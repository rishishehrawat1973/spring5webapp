package guru.springframework.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestBS implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hi-------");
    }
}
