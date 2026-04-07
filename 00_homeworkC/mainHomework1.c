#include <string.h>
#include <stdio.h>
#include "homework1.h"

int main () {
    magazzino mag; //magazzino principale
    prodotto temp_p; //struct prodotto temporanea per le funzioni
    int scelta;
    int temp_pos; //richieste all'utente per i parametri delle funzioni
    int pos_n;  //variabile per eliminare il new line dalle stringhe
    int ricerca; //risultato della ricerca del codice nel magazzino
    char temp_codice[MAX_CHAR]; //codice da passare alle funzioni
    do {
        printf("Operazioni possibili:\n");
        printf("1. Inizializza magazzino vuoto\n2. Inizializza magazzino\n3. Inserisci dati di un prodotto\n4. Visualizza dati prodotto\n5. Visualizza Codice di un prodotto\n6. Modifica Codice di un prodotto\n7. Cerca nel magazzino il codice di un prodotto\n8. Inserisci un prodotto nel magazzino\n9. Elimina un prodotto dal magazzino\n10. Visualizza magazzino\n0. Esci dal programma\n");
        printf("Scegli un'opzione:\n");
        scanf("%d" , &scelta);
        flush();
        switch (scelta) {
            case 1:
                inizializza_magazzino_vuoto(&mag);
                break;
            case 2:
                inizializza_magazzino(&mag);
                break;
            case 3:
                inserisci_dati_prodotto(&temp_p);
                break;
            case 4:
                visualizza_dati_prodotto(temp_p);
                break;
            case 5:
                printf("Il codice del prodotto è: %s\n", fornisci_codice(&temp_p));
                break;
            case 6:
                printf("Inserire il codice nuovo da inserire:\n");
                fgets(temp_codice, MAX_CHAR, stdin);
                pos_n = strcspn(temp_codice, "\n");
                temp_codice[pos_n] = '\0';
                modifica_codice(&temp_p, temp_codice);
                break;
            case 7:
                printf("Inserisci il codice da cercare nel magazzino:\n");
                fgets(temp_codice, MAX_CHAR, stdin);
                pos_n = strcspn(temp_codice, "\n");
                temp_codice[pos_n] = '\0';
                ricerca = cerca_codice_prodotto(&mag, temp_codice); 
                if (ricerca != -1) {
                    printf("Codice trovato nel magazzino sul prodotto in posizione %d\n", ricerca);
                }
                else {
                    printf("Codice non trovato nel magazzino\n");
                }
                break;
            case 8:
                printf("In quale posizione vuoi inserire il prodotto?\n");
                scanf("%d", &temp_pos);
                flush();
                inserisci_prodotto(&mag, temp_pos, temp_p);
                break;
            case 9:
                printf("In quale posizione del magazzino vuoi eliminare il prodotto?\n");
                scanf("%d", &temp_pos);
                flush();
                elimina_prodotto(&mag, temp_pos);
                break;
            case 10:
                visualizza_magazzino(&mag);
                break;
            case 0:
                printf("Programma chiuso\n");
                break;
            default:
                printf("Scelta non valida\n");
        }
    } while (scelta != 0);
}