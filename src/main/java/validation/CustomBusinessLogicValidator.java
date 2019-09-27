package validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomBusinessLogicValidator implements ConstraintValidator<CheckBusinessRule, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        if( value == null || value.equalsIgnoreCase("stefan")) { 
            return false;
        } 
        return true;
    }

}
