package com.example.demo.Controller;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.time.Period;

@RestController
public class AgeController {

    String Message ="";

    @GetMapping("/Age")
    public String hello(@RequestParam(value = "day", defaultValue = "16") int day
            , @RequestParam(value = "month", defaultValue = "03") int month
            , @RequestParam(value = "year", defaultValue = "2022") int year
            ,@RequestParam(value = "Name", defaultValue = "Hombre Araña") String name ) {

        Period edad = Period.between(LocalDate.of(year, month, day), LocalDate.now());
        if(edad.getYears()>=18){
            Message ="Hello "+ name+", you're an adult.";
            }
            else {
            Message ="Hello "+ name+", keep enjoying life!";
        }
        return Message;
    }

}
