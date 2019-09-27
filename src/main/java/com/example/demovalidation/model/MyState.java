package com.example.demovalidation.model;

import javax.validation.constraints.NotNull;

import com.example.demovalidation.validation.CheckBusinessRule;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyState {
    
    @NotNull
    @CheckBusinessRule
    String name;
    
    
    String otherProp;

}
