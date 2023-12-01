package testowanie;
import myapp.MyCharacter;
public class TestCharacter {
    public static void main(String[] args) {
        MyCharacter ch1 = new MyCharacter("John","komandos", "człowiek",45);

        System.out.println("--- Info o Postaci ---\n");

        System.out.println("Imie: " + ch1.imie);
        System.out.println("Klasa Postaci: " + ch1.klasaPostaci);
        System.out.println("Rasa: " + ch1.klasaPostaci);
        System.out.println("Siła: " + ch1.sila);
        //ch1.wyswietlinfo();

    }
}