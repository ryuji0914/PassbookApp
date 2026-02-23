package com.example.PassbookApp.index.Controller;

import com.example.PassbookApp.index.Entity.CreateForm;
import com.example.PassbookApp.index.Service.CreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.service.annotation.PutExchange;

@Controller
@RequiredArgsConstructor
public class controllerClass {
    private final CreateService createservice;

    @GetMapping("/detail")
    public String detail(Model model){
        var find = createservice.find();
        model.addAttribute("find",find);
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

    @GetMapping("/targetMoney")
    public String settingmoney(){
        return "detail/targetMoney";
    }

    @PostMapping("/detail")
    public String createrecord(@Validated CreateForm form, Model model){
        createservice.create(form.createEntity());
        return "redirect:/detail";
    }





}
