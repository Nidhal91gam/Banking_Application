package com.Gam.Banking.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;


@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Adress extends AbstractEntity implements Serializable {


    private String street;

    private Integer houseNumber;

    private Integer zipCode;

    private String city;

    private String country ;

    @OneToOne
    @JoinColumn(name="id_user")
    private User user;
}