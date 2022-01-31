import java.util.Scanner;

public class TelefonMeucci {

    //Variable que es sumara per cada cop que trobi una opcio
    private static int opcions;


    public static void main(String[] args) {

        //Declarem l'Scanner
        Scanner sc = new Scanner(System.in);

        //Mostrem per pantalla
        System.out.println("Posa un numero de telefon MAX 20 caracters");

        //Demanem que posi un num telefon
        String telefon = sc.nextLine();

        //Cridem la funcio i la guardem a la variable resultat
        int resultat = comprova(telefon, opcions);

        //Mostrem el resultat
        System.out.println(resultat);
    }


    //Funcio a on contara el numero de opcions que pot tenir el mobil
    public static int comprova(String telefon, int opcions){

        //Si es igual a algun entrarai sumara 1 al contador
        if (telefon.contains("X")) {
            opcions ++; //Sumem en 1 el contador
        }
        if (telefon.contains("I")) {
            opcions ++;
        }
        if (telefon.contains("II")) {
            opcions ++;
        }
        if (telefon.contains("III")) {
            opcions ++;
        }
        if (telefon.contains("IV")) {
            opcions ++;
        }
        if (telefon.contains("V")) {
            opcions ++;
        }
        if (telefon.contains("VI")) {
            opcions ++;
        }
        if (telefon.contains("VII")) {
            opcions ++;
        }
        if (telefon.contains("VIII")) {
            opcions ++;
        }
        if (telefon.contains("IX")) {
            opcions ++;
        }

        return opcions;
    }

}
