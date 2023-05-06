package Ruiz.Raul.itacademy.acces.especialitzacio.java.exercici2.entitats;

public class Mentor extends Persona {

    private short horesDedicacioAnual;

    public Mentor(String dni, String nom, String cognom1, String cognom2, short horesDedicacioAnual) {
        super(dni, nom, cognom1, cognom2);

        if (horesDedicacioAnual < 0) {
            this.horesDedicacioAnual = 0;
        } else if (horesDedicacioAnual > 1600) {
            this.horesDedicacioAnual = 1600;
        } else {
            this.horesDedicacioAnual = horesDedicacioAnual;
        }

    }

    public short getHoresDedicacioAnual() {
        return horesDedicacioAnual;
    }

    public void setHoresDedicacioAnual(short horesDedicacioAnual) {
        this.horesDedicacioAnual = horesDedicacioAnual;
    }

    @Override
    public String getNomComplet() {
        return super.getNomComplet() + " - Mentor";
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "dni='" + getDni() + '\'' +
                ", nom='" + getNom() + '\'' +
                ", cognom1='" + getCognom1() + '\'' +
                ", cognom2='" + getCognom2() + '\'' +
                ", horesDedicacioAnual=" + horesDedicacioAnual +
                '}';
    }

}
