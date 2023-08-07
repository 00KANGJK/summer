package com.example.summer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class HomeController {

    @Autowired
    BoardService boardService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String Home(){
        System.out.println("home");

        return "redirect:board/list";
    }
}