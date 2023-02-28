package com.Gam.Banking.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name= "User")
public class User extends AbstractEntity implements Serializable {

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private Boolean active ;

    @OneToOne
    private Adress adress;

    // relationShip User Transaction
    @OneToMany(mappedBy = "user")
    private List<Transaction> transactions;

    // relationShip User Contact

    @OneToMany(mappedBy = "user")
    private List<Contact> contacts;

    // relationShip User Account

    @OneToOne
    private Account account;

    // relationShip User Role*

    @OneToOne
    private Role role;





}
