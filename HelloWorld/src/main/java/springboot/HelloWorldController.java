package springboot;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 *
 * @author manoj.bardhan
 *
 */
@Controller
@EnableAutoConfiguration
public class HelloWorldController {
    private String keys;

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

    @RequestMapping("/batchGet")
    @ResponseBody
    public String batchGet(@RequestParam String keys) {
        System.out.println(keys);

        return keys;
    }

    @RequestMapping("/batchGetArray")
    @ResponseBody
    public String batchGetArray(@RequestParam ArrayList keys) {
        System.out.println(keys);
        return keys.toString();
    }
}
