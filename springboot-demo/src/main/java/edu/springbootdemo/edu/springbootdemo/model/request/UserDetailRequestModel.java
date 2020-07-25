package edu.springbootdemo.edu.springbootdemo.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDetailRequestModel {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
