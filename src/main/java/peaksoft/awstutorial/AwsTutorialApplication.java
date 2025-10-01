package peaksoft.awstutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class AwsTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwsTutorialApplication.class, args);
    }

    @GetMapping
    public String index() {
        return "index";
    }

}
