CREATE TABLE `test_task`.`users` (
                                         `id` INT NOT NULL AUTO_INCREMENT,
                                         `email` VARCHAR(64) NOT NULL,
                                         `first_name` VARCHAR(25) NOT NULL,
                                         `last_name` VARCHAR(25) NOT NULL,
                                         `birthdate` DATE NOT NULL,
                                         `phone_number` VARCHAR(17) NULL,
                                         PRIMARY KEY (`id`),
                                         UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE,
                                         UNIQUE INDEX `phone_number_UNIQUE` (`phone_number` ASC) VISIBLE);