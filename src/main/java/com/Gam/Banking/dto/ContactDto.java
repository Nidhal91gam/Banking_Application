package com.Gam.Banking.dto;

import com.Gam.Banking.models.Contact;
import com.Gam.Banking.models.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ContactDto {

    private Integer id;

    private String firstName;

    private String lasttName;

    private String email;

    private String iban;

    private Integer userId;

    public static ContactDto contactTocontactDto (Contact contact){
        return ContactDto.builder()
                .id(contact.getId())
                .firstName(contact.getFirstName())
                .lasttName(contact.getLasttName())
                .email(contact.getEmail())
                .iban(contact.getIban())
                .userId(contact.getUser().getId())
                .build();
    }

    public static Contact contactDtoTocontact (ContactDto contact){
        return Contact.builder()
                .id(contact.getId())
                .firstName(contact.getFirstName())
                .lasttName(contact.getLasttName())
                .email(contact.getEmail())
                .iban(contact.getIban())
                .user(
                        User.builder()
                                .id(contact.getId())
                                .build()
                )
                .build();
    }
}
