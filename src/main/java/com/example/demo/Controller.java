/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author eyvind
 */
@RestController
public class Controller {
    
    @RequestMapping("/")
    public String home()
    {
    return "hello S1!";
    }

    
}
