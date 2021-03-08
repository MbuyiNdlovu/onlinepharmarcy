package com.tsb.onlinepharmarcy.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
    @GetMapping (value = "/")
    public String Index(){
    return  "onlinepharmarcy api is up and running";
}
}
