package com.example.PassbookApp.index.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controllerClass {
    @GetMapping("/detail")
    public String detail(){
        return "detail/bankbook";
    }

    @GetMapping("/create")
    public String create(){
        return "detail/newRegister";
    }

    @GetMapping("/update")
    public String update(){
        return "detail/Update";
    }


}
