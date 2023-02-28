package com.Gam.Banking.dto;

import com.Gam.Banking.models.Adress;
import com.Gam.Banking.models.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AdressDto {
    private Integer id;

    private String street;

    private Integer houseNumber;

    private Integer zipCode;

    private String city;

    private String country ;

    private Integer userId;

    public static AdressDto adressToadressDto (Adress adress){

        return AdressDto.builder()
                .id(adress.getId())
                .street(adress.getStreet())
                .houseNumber(adress.getHouseNumber())
                .zipCode(adress.getZipCode())
                .city(adress.getCity())
                .country(adress.getCountry())
                .userId(adress.getUser().getId())

                .build();
    }

    public static Adress adressDtoToadress (AdressDto adress){

        return Adress.builder()
                .id(adress.getId())
                .street(adress.getStreet())
                .houseNumber(adress.getHouseNumber())
                .zipCode(adress.getZipCode())
                .city(adress.getCity())
                .country(adress.getCountry())
                .user(
                        User.builder()
                                .id(adress.getId())
                                .build()
                )

                .build();
    }
}
