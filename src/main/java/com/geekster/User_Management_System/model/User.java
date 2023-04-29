package com.geekster.User_Management_System.model;
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
    private String name;
    private String userName;
    private String address;
    private String phoneNumber;
}
