package com.upiiz.tablas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class tablasController {
    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
