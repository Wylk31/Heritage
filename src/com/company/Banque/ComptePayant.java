package com.company.Banque;

public class ComptePayant extends Compte {

    public ComptePayant(int id, float solde) {
        super(id, solde);
    }

    @Override
    public void retirer(float montant) {
        if (montant + 1 <= this.solde) {
        super.retirer(montant + 1);
        }
    }

    @Override
    public void verser(float montant) {
            super.verser(montant -1);
        }


}
