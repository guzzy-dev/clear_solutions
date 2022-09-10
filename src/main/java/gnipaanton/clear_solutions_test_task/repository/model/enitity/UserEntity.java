package gnipaanton.clear_solutions_test_task.repository.model.enitity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Email(message = "Invalid email")
    @NonNull
    private String email;

    @NotBlank(message = "First name can't be blank or null")
    @Column(name = "first_name")
    private String firstName;

    @NotBlank(message = "Last name can't be blank or null")
    @Column(name = "last_name")
    private String lastName;

    private String birthdate;

    @Column(name = "phone_number")
    private String phoneNumber;
}
