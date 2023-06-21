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
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.mycompany.dia_16.SwaggerConfig") // Especifique o pacote base do seu aplicativo
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

