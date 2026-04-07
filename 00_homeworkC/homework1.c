#include <stdio.h>
#include <string.h>
#include "homework1.h"

void flush() {
	int c;
	while((c = getchar()) != '\n' && c != EOF);
}

void inserisci_dati_prodotto(prodotto *p) {
    printf("Inserisci il codice del prodotto:\n");
    fgets(p->codice, MAX_CHAR, stdin);
    int pos_n = strcspn(p->codice, "\n");
    p->codice[pos_n] = '\0';

    printf("Inserisci il genere del prodotto:\n");
    fgets(p->genere, MAX_CHAR, stdin);
    pos_n = strcspn(p->genere, "\n");
    p->genere[pos_n] = '\0';

    printf("Inserisci la quantita del prodotto:\n");
    scanf("%d" , &p->qta);
    flush();
}

void modifica_codice(prodotto* p, const char nuovo_codice[]) {
    strcpy(p->codice, nuovo_codice);
}

char* fornisci_codice(prodotto *p) {
    return p->codice;
}

void visualizza_dati_prodotto(prodotto p) {
    printf("Codice\tGenere\t\tQuantita\n");
    printf("%s \t %s \t %d\n", p.codice, p.genere, p.qta);
}

void inizializza_magazzino_vuoto(magazzino *m) {
    m->dim = 0;
}

void inizializza_magazzino(magazzino *m){
    m->dim = 0;
    int n_prodotti;
    int inseriti = 0;
    printf("Inserire il numero di prodotti: \n");
    scanf("%d", &n_prodotti);
    flush();
    prodotto temp;
    while (inseriti < n_prodotti) {
        printf("Prodotto n %d\n", m->dim+1);
        inserisci_dati_prodotto(&temp);
        if(cerca_codice_prodotto(m, temp.codice) == -1) {
            m->elementi[m->dim] = temp;
            m->dim++;
            inseriti++;
        }
        else {
            printf("Codice già presente nel magazzino, non verrà inserito!\n");
        }
    }
}

int cerca_codice_prodotto(magazzino *m, const char codice[]) {
    for(int i = 0; i<m->dim; i++) {
        if (strcmp(m->elementi[i].codice, codice) == 0) {
            return i;
        }
    }
    return -1;
}

void elimina_prodotto(magazzino *m, int pos) {
    if (pos > m->dim-1 || pos < 0) {
        printf("Posizione non valida\n");
    }
    else {
        for (int i = pos; i < m->dim-1; i++) {
            m->elementi[i] = m->elementi[i+1];
        }
        m->dim--;
    }
}

void inserisci_prodotto(magazzino *m, int pos, prodotto nuovo_p) {
    
    if (m->dim >= MAX_DIM) {
        printf("Magazzino pieno!\n");
    }
    
    else if (pos > m->dim || pos < 0) {
        printf("Posizione non valida\n");
    }

    else {
        if (cerca_codice_prodotto(m, nuovo_p.codice) != -1) {
            printf("Prodotto già presente!\n");
        }
        else {
            for(int i = m->dim-1; i >= pos; i--) {
                m->elementi[i+1] = m->elementi[i];
            }
        m->elementi[pos] = nuovo_p;
        m->dim++;
        }
    }
}

void visualizza_magazzino(magazzino *m) {
    for (int i = 0; i<m->dim; i++) {
        visualizza_dati_prodotto(m->elementi[i]);
    }
}