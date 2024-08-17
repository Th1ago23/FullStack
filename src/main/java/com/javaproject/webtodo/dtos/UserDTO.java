package com.javaproject.webtodo.dtos;
import jakarta.validation.constraints.NotBlank;


public record UserDTO(@NotBlank String username, @NotBlank String password) {

}
