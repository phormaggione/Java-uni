#ifndef HOMEWORK_H
#define HOMEWORK_H

#define MAX_CHAR 100
#define MAX_DIM 100

typedef struct {
    char codice[MAX_CHAR];
    char genere[MAX_CHAR];
    int qta;
} prodotto;

typedef struct {
    prodotto elementi[MAX_DIM];
    int dim;
} magazzino;

void flush();
void inserisci_dati_prodotto(prodotto *p);
void modifica_codice(prodotto* p, const char nuovo_codice[]); //const perchè non va modificato ma solo copiato
char* fornisci_codice(prodotto *p);
void visualizza_dati_prodotto(prodotto p); 
void inizializza_magazzino_vuoto(magazzino *m);
void inizializza_magazzino(magazzino *m);
int cerca_codice_prodotto(magazzino *m, const char codice[]);
void elimina_prodotto(magazzino *m, int pos);
void inserisci_prodotto(magazzino *m, int pos, prodotto nuovo_p);
void visualizza_magazzino(magazzino *m);


#endif