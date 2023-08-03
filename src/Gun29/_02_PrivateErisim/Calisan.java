package Gun29._02_PrivateErisim;

public class Calisan {
    int id;        // default
    String name;    // default
    String surname; //default
    private String password; //private

    public void sifreAta(String sifre){
       if (sifre.length() < 8)
           System.out.println("Zayıf şifre");
       else
       {
           this.password=sifre;
           System.out.println("Şifre başarıyla atandı");
       }
    }

    public void sifreGoster()
    {
        System.out.println("****"+this.password.substring(4));
    }

}
