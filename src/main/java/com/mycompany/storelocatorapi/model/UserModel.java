package com.mycompany.storelocatorapi.model;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
//no need of gett...
public class UserModel {
    private String fullName;
    private String mobileNumber;
    private String email;
    private String password;
}
