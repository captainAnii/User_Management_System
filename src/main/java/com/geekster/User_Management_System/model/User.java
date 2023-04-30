package com.geekster.User_Management_System.model;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int userId;
    @NotEmpty
    private String name;
    @Email
    @NotEmpty
    private String userName;
    private String address;
    @Size(min = 10,max = 12)
    @Pattern(regexp = "7.*62.*8.*2")
    private String phoneNumber;
}
