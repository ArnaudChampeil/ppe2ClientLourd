package fr.arnaud;

public class VerifyLogin {

    public void verify(String id, String password){
        if (id.equals("Arnaud") && password.equals("Arnaud")){
            System.out.println("Connexion accepté !");
        }else {
            System.out.println("Connexion refusée !");

        }
    }
}
