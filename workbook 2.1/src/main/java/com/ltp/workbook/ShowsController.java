package com.ltp.workbook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowsController {
    
    @GetMapping("/shows")
    public String shows(){
        return "shows";
    }
}
