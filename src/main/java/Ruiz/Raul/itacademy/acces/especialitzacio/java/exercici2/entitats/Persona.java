package Ruiz.Raul.itacademy.acces.especialitzacio.java.exercici2.entitats;

public abstract class Persona {

    private String dni;
    private String nom;
    private String cognom1;
    private String cognom2;

    public Persona(String dni, String nom, String cognom1, String cognom2) {
        this.dni = dni;
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom1() {
        return cognom1;
    }

    public void setCognom1(String cognom1) {
        this.cognom1 = cognom1;
    }

    public String getCognom2() {
        return cognom2;
    }

    public void setCognom2(String cognom2) {
        this.cognom2 = cognom2;
    }

    public String getNomComplet() {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(cognom1);
        stringBuilder.append(" ");
        stringBuilder.append(cognom2);
        stringBuilder.append(", ");
        stringBuilder.append(nom);

        return stringBuilder.toString();

    }

}
