package com.mycompany.storelocatorapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
//no need of gett...
@JsonInclude(JsonInclude.Include.NON_NULL)  //null values are indeed not part of the final JSON output:
@JsonIgnoreProperties(ignoreUnknown = true)  //to ignore null value which is not given
public class UserModel {
    private String fullName;
    private String mobileNumber;
    private String email;
    private String password;
}
