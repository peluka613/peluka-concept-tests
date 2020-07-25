package edu.springbootdemo.edu.springbootdemo.model.response;

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
public class UserRest {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
}
