package com.example.demo.validators;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 *
 *
 *
 */
public class InventoryValidator implements ConstraintValidator<ValidInventory, Part> {
    /*@Autowired
    private ApplicationContext context;
    public static  ApplicationContext myContext;*/
    @Override
    public void initialize(ValidInventory constraintAnnotation) {
        //ConstraintValidator.super.initialize(constraintAnnotation);
    }

    //Modify the code to enforce that the inventory is between or at the minimum and maximum value.

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {

        if(part.getInv() > part.getMaxInv()){           //inv is more than maxInv
            constraintValidatorContext.buildConstraintViolationWithTemplate("Your inventory is greater than the Max allowed inventory.").addConstraintViolation();
            return false;
            }
        else if(part.getInv() < part.getMinInv()){      //inv is less than minInv
            constraintValidatorContext.buildConstraintViolationWithTemplate("Your inventory is less than the Minimum allowed inventory.").addConstraintViolation();
            return false;
            }
            return true;

        }
}
