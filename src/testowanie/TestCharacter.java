package testowanie;
import myapp.MyCharacter;
public class TestCharacter {
    public static void main(String[] args) {
        //Utworzenie obiektu klasy MyCharacter(Osoba) + ustawienie wartości dla pól obiektu.
        MyCharacter ch1 = new MyCharacter("John Rambo","komandos", "człowiek",45);

        //Wyświetlenie informacji o MyCharacter(Osoba) na konsoli.
        System.out.println("--- Info o Postaci ---\n");
        System.out.println("Imie: " + ch1.imie);
        System.out.println("Klasa Postaci: " + ch1.klasaPostaci);
        System.out.println("Rasa: " + ch1.rasa);
        System.out.println("Siła: " + ch1.sila);
        //ch1.wyswietlinfo();
    }
}