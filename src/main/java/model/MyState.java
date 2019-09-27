package model;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import validation.CheckBusinessRule;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyState {
    
    @NotNull
    @CheckBusinessRule
    String name;
    
    
    String otherProp;

}
