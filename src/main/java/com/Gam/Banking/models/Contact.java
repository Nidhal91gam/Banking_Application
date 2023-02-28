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
public class Contact extends AbstractEntity implements Serializable {

    private String firstName;

    private String lasttName;

    private String email;

    private String iban;

    @ManyToOne
    @JoinColumn(name="id_user")
    private User user;

}
