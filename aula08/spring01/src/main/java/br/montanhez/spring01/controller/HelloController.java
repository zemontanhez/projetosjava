package br.montanhez.spring01.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class HelloController {
/* 
    @GetMapping("/hello")
    public String ola() {
        return "Olá mundo!";
    } */

    @GetMapping("/hello")
    public ResponseEntity<String> ola2() {
        return ResponseEntity.ok("Olá mundo!");
    }

    @GetMapping("/positivo/{numero}")
    public ResponseEntity<String> isPositive(@PathVariable int numero){
        if (numero >= 0){
            return ResponseEntity.ok("É positivo");
        }else {
            return ResponseEntity.ok("É negativo");
        }
    }
}