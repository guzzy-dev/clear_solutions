package gnipaanton.clear_solutions_test_task.util.validation;

import gnipaanton.clear_solutions_test_task.util.annotation.BirthdateAgeConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;

public class BirthdateValidation implements ConstraintValidator<BirthdateAgeConstraint, String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        LocalDate userDate = LocalDate.parse(s);
        LocalDate requiredDate = userDate.plusYears(18);
        LocalDate currentDate = LocalDate.now();
        return currentDate.isAfter(requiredDate);

    }
}
