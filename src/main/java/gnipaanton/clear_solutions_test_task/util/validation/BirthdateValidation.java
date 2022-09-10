package gnipaanton.clear_solutions_test_task.util.validation;

import gnipaanton.clear_solutions_test_task.util.annotation.BirthdateAgeConstraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;

public class BirthdateValidation implements ConstraintValidator<BirthdateAgeConstraint, String> {
    private int minimalAge;

    @Override
    public void initialize(BirthdateAgeConstraint birthdateAgeConstraint) {
        this.minimalAge = birthdateAgeConstraint.minAge();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        LocalDate userDate = LocalDate.parse(s);
        System.out.println(minimalAge);
        LocalDate requiredDate = userDate.plusYears(minimalAge);

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate + " after" + requiredDate + " is " + currentDate.isAfter(requiredDate));
        return currentDate.isAfter(requiredDate);

    }

    public void setMinimalAge(Integer minimalAge) {
        this.minimalAge = minimalAge;
    }
}
