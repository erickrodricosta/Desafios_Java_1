/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia_16;

/**
 *
 * @author ficdev
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola")
@SpringBootApplication
public class OlaResourseMain {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String ola() {
        return "{\"message\": \"Olá, seja bem-vindo!\"}";
    }

    public static void main(String[] args) {
        SpringApplication.run(OlaResourseMain.class, args);
    }
}

