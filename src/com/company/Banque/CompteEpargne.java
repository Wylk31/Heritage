package com.company.Banque;

public class CompteEpargne extends Compte {

    private float taux;

    public CompteEpargne(int id, float solde, float taux) {
        super(id, solde);
        this.taux = taux;
    }

    public float calculInterets() {
        float interets = this.solde * (taux/100);
        this.solde += interets;
        return interets;
    }

    public float getTaux() {
        return taux;
    }

    public void setTaux(float taux) {
        this.taux = taux;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CompteEpargne{");
        sb.append("solde=").append(solde);
        sb.append(", taux=").append(taux);
        sb.append('}');
        return sb.toString();
    }
}
