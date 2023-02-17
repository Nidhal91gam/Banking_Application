package com.Gam.Banking.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name= "User")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

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
