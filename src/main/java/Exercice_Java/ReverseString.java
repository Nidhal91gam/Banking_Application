package Exercice_Java;

public class ReverseString {

    private String revString ( String str){
        int i ;
        String revers = "";
        for(i=str.length()-1 ;  i>=0 ; i-- ){

            revers = revers + str.charAt(i);
        }
        return  revers;
    }
}
