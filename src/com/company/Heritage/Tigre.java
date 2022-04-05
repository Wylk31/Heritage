package com.company.Heritage;

public class Tigre extends Animal {

    @Override
    public void manger() {
        System.out.println("Le tigre saute sur une chèvre bien fraiche");
        super.manger();
    }
}

