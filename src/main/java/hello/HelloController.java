package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
        public String index() {
            return "wellcome our website, please use /api4\n";
        }
    @RequestMapping("/api4")
        public String index2() {

            return "Hello, World!\n";
        }

}
