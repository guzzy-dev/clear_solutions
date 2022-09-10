package gnipaanton.clear_solutions_test_task.config;

import gnipaanton.clear_solutions_test_task.util.validation.BirthdateValidation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ValidatorConfig {

    @Bean
    BirthdateValidation birthdateValidation(@Value("${validation.minimalAge}") Integer minimalAge){
        BirthdateValidation validator = new BirthdateValidation();
        validator.setMinimalAge(minimalAge);
        return validator;
    }
}
