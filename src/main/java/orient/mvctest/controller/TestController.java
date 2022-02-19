package orient.mvctest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){

        return "Hello!";
    }

    @GetMapping("/welcome")
    public String welcome(){

        return "WellCome!";
    }

}
