package TesterPersona;

import Clases.Persona;

public class TesterPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona(1, "Luis", "Hernandez", "Morales", 20);
        String datos_persona = p1.toString();
        System.out.println("Los datos de P1 son: " + datos_persona);
    }
}
