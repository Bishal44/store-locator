package com.mycompany.storelocatorapi.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "USER_TABLE")
@Getter
@Setter
@NoArgsConstructor  //lombok advantage no need to create getter setter method
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID")
    private Long id;//just variable

    @Column(name = "FUll_NAME")
    private String fullName;

    private String mobileNumber; //create column with same name
    private String email;
    private String password;
}
