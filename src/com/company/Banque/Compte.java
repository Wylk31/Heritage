package com.company.Banque;

public abstract class Compte {

    private int id;
    protected float solde;
    private static int countComptes;

    public Compte (int id, float solde) {
        this.id = ++countComptes;
        this.solde = solde;

    }

    public void verser(float montant) {
        System.out.println("Le compte a été crédité de: " + montant);
        this.solde += montant;
        System.out.println("le solde du compte est de: " + this.solde);
    }

    public void retirer (float montant) {
        if(montant > solde) {
            System.out.println("Fonds insuffisants");
        } else {
        System.out.println("Le compte a été débité de: " + montant);
        this.solde -= montant;
        System.out.println("le solde du compte est de: " + this.solde);
        }


    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Compte{");
        sb.append("id=").append(id);
        sb.append(", solde=").append(solde);
        sb.append('}');
        return sb.toString();
    }
}
