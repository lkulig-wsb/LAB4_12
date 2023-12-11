package myapp;
public class MyCharacter {
    //Dane składowe klasy MyCharacter.
    public String imie;
    public String klasaPostaci;
    public String rasa;
    public  int sila;

    //Konstruktor klasy MyCharacter.
    public MyCharacter(String imie, String klasaPostaci, String rasa, int sila)
    {
        this.imie = imie;
        this.klasaPostaci = klasaPostaci;
        this.rasa = rasa;
        this.sila = sila;
    }
    /*public void wyswietlinfo()
    {
        System.out.println("Imie: " + imie);
        System.out.println("Klasa Postaci: " + klasaPostaci);
        System.out.println("Rasa: " + rasa);
        System.out.println("Siła: " + sila);
    }*/
}
