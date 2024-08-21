package com.javaproject.webtodo.models;


import com.javaproject.webtodo.dtos.UserDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String username;
    @NotBlank
    private String password;
    @NotBlank
    private String name;
    @NotBlank
    private String email;
    @NotBlank
    private String phone;

    private User(UserDTO userDTO) {
        this.username = userDTO.username();
        this.password = userDTO.password();
        this.name = userDTO.name();
        this.email = userDTO.email();
        this.phone = userDTO.phone();

    }
}
