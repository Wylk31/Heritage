package com.company.monProjet;

public class Personne {

    public String name;
    public int age;

    public Personne (String name) {
        this.name = name;
    }

    public Personne (String name, int age) {
        this(name);
        this.age = age;
    }

    public void infoDetails() {
        System.out.println("Bonjour je m'appelle " + this.name + " et j'ai " + this.age + " ans.");
    }

    public void compareAge(Personne personne) {
        if (this.age > personne.age) {
            System.out.println(this.name+ " est plus vieux " + personne.name);
        } else if (this.age < personne.age) {
            System.out.println(this.name+ " est plus jeune " + personne.name);
        } else {
            System.out.println(this.name+ " a le même âge que " + personne.name);
        }
    }

    @Override
    public String toString() {
        return "Personne{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

