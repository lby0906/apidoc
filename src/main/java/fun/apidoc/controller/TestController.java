package fun.apidoc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: sanyuan
 * @Desc:
 * @create: 2024-05-22 16:45
 **/
@RestController
@RequestMapping("/common")
public class TestController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/inner")
    public String inner(){
        return "inner";
    }


}
