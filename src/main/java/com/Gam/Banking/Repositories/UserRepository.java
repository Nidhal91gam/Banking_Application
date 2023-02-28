package com.Gam.Banking.Repositories;

import com.Gam.Banking.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {

    // Select * from User where firstName ="Nidhal"
    List<User> findAllByFirstName(String firstName);

    // Select * froù user where firstName like "Nidhal"
    List<User> findAllByFirstNameContainingIgnoreCase(String firstName);

     // Select * from user u inner join account a on u.id = a.id_user and a.iban ='De12345674'
    List<User> findAllByAccountIban (String iban);

     // Select * from user where firstName = '%Nidhal%' and email='gamnidhal91@gmail.com'
    User findByFirstNameContainingIgnoreCaseAndEmail(String firstName , String email);

     // requet query avec jpql
    @Query("from User where firstName=:fn")
    List<User> searchByFirstName(@Param("fn")String firstName);


    @Query("from User where firstName='%:firstName%'")
    List<User> searchByFirstNameContaining(String firstName);

    @Query("from User u inner join Account a on u.id = a.user.id where a.iban =:iban")
    List<User> searchByIban(String iban);

    // Requet query avec SQL native
    @Query(value = "select * from User u inner join Account a on u.id=a.user.id where a.iban=:iban",nativeQuery = true)
    List<User> serachByIbanNative(String iban);




}
