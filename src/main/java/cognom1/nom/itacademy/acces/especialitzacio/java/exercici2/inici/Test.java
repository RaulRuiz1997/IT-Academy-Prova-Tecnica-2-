package cognom1.nom.itacademy.acces.especialitzacio.java.exercici2.inici;

import Ruiz.Raul.itacademy.acces.especialitzacio.java.exercici2.entitats.Alumne;
import Ruiz.Raul.itacademy.acces.especialitzacio.java.exercici2.entitats.Mentor;
import Ruiz.Raul.itacademy.acces.especialitzacio.java.exercici2.entitats.Persona;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    static ArrayList<Persona> persones = new ArrayList<>();

    public static void main(String[] args) {

        creacioInstancies();

        getAll();

        // DNI inexistente
        System.out.println(getByDni("inexistent"));

        // DNI existente
        System.out.println(getByDni("1111111A"));

    }

    static void creacioInstancies() {

        persones.add(new Alumne("1111111A", "Joan", "Armengol", "Castells", 9.5f));
        persones.add(new Alumne("2222222B", "Anna", "Marti", "Pujol", 10.0f));
        persones.add(new Alumne("3333333C", "Montse", "Llopart", "Lladó", 7.8f));

        persones.add(new Mentor("44444444D", "Marina", "Llucià", "Pedrol", (short) 1530));
        persones.add(new Mentor("55555555E", "Alfons", "Riera", "Manent", (short) 1600));
        persones.add(new Mentor("66666666F", "Eva", "Solsona", "Riba", (short) 890));

    }

    static void getAll() {

        for (Persona persona : persones) {
            System.out.println(persona.toString());
            System.out.println(persona.getNomComplet());
        }

    }

    static Persona getByDni(String dni) {

        for (Persona persona : persones) {

            if (dni.equals(persona.getDni())) {
                return persona;
                //break; -> No se puede usar ya que el return ya para el bucle
            }

        }

        return null;

    }


}
