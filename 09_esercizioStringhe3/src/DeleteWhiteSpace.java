/*
(Occorre la classe StringBuffer, che vediamo oggi a lezione)
Si acquisica una stringa di caratteri in input contenente anche degli spazi.
Scrivere un programma che, ogni volta che viene trovato uno spazio,
vengano soppressi eventuali altri spazi contigui (due o piu').
Ad esempio, se l'utente inserisce la stringa
"Oggi è una ; bella giornata... di pioggia!!!"
la stringa risultante sarà " 
Oggi è una bella giornata... di pioggia!!!"
Suggerimento: Si usi StringBuffer ed il metodo deleteCharAt(int i) 
*/

import java.util.Scanner;

public class DeleteWhiteSpace {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    System.out.println("Inserisci la frase:");
    String str = input.nextLine();
    input.close();
    System.out.println(elimina(str));
    }

    public static StringBuffer elimina(String str) {
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        int inizio = 0;
        while((inizio = sb.indexOf(" ", inizio)) != -1) {
            if(inizio+1 < sb.length() && sb.charAt(inizio+1) == ' ')  //controllo sia l'out of bound che se il prossimo è uno spazio, in caso affermativo non incremento per eliminare successivamente anche un ipotetico contiguo
                sb.deleteCharAt(inizio+1);
            else
                inizio++;
        }
        return sb;
    }
}


