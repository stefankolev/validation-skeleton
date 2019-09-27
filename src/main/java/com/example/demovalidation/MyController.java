package com.example.demovalidation;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demovalidation.model.MyState;

@RestController
@Validated
public class MyController {
    
    @GetMapping("/test")
    public String go (@Valid @RequestBody List<MyState> data ) { 

        return "OK";
    }

}
