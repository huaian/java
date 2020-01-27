package springboot;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author manoj.bardhan
 *
 */
@Controller
@EnableAutoConfiguration
public class HelloWorldController {
    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello World Developer!!!";
    }

    @RequestMapping("/auth")
    @ResponseBody
    public String auth() {
        return "auth check";
    }
}
