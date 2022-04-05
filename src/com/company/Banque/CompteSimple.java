package com.company.Banque;

public class CompteSimple extends Compte {

    private float decouvert;

    public CompteSimple (int id, float solde, float decouvert) {
        super(id, solde);
        this.decouvert = decouvert;

    }

    public void retirer (float montant) {
        if(montant > decouvert + this.solde) {
            System.out.println("retrait impossible");
        } else {
            this.solde -= montant;
        }
    }

    public float getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(float decouvert) {
        this.decouvert = decouvert;
    }


}
