package Ruiz.Raul.itacademy.acces.especialitzacio.java.exercici2.entitats;

public class Alumne extends Persona {

    private float notaAcces;

    public Alumne(String dni, String nom, String cognom1, String cognom2, float notaAcces) {
        super(dni, nom, cognom1, cognom2);
        this.notaAcces = notaAcces;
    }

    public float getNotaAcces() {
        return notaAcces;
    }

    public void setNotaAcces(float notaAcces) {
        this.notaAcces = notaAcces;
    }

    @Override
    public String getNomComplet() {
        return super.getNomComplet() + " - Alumne";
    }

    @Override
    public String toString() {
        return "Alumne {" +
                "dni='" + getDni() + '\'' +
                ", nom='" + getNom() + '\'' +
                ", cognom1='" + getCognom1() + '\'' +
                ", cognom2='" + getCognom2() + '\'' +
                ", notaAcces='" + getNotaAcces() + '\'' +
                '}';
    }

}
