package com.example.SpringBootWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.print.DocFlavor;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("Home method called");
        return "index.jsp";
    }

}
