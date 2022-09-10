package gnipaanton.clear_solutions_test_task.util.annotation;

import gnipaanton.clear_solutions_test_task.util.validation.BirthdateValidation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = BirthdateValidation.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface BirthdateAgeConstraint{
    String message() default "Age under 18";
    public Class<?>[] groups() default {};
    public Class<? extends Payload>[] payload() default {};
}
