package com.greenbalance.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Komyshenets on 25.05.2019.
 */
@RestController

public class Controller {

    @RequestMapping("/")
    public String home() {
        return "Hello world";
    }

}
