package gr.aueb.cf.recipesapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CustomerDTO {
    private Long customerId;
    private String firstname;
    private String lastname;
    private String email;
    private String password;

    public CustomerDTO(Long customerId, String firstname, String lastname, String email, String password) {
        this.customerId = customerId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
    }
}
