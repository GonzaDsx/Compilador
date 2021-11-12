/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 *
 */
public class Principal {

    public static void main(String[] args) throws Exception {
        String ruta1 = "D:/ING EN SISTEMAS/9no Semestre/Lenguajes y automatas II/Compilador1/src/intface/Lexer.flex";
        String ruta2 = "D:/ING EN SISTEMAS/9no Semestre/Lenguajes y automatas II/Compilador1/src/intface/LexerCup.flex";
        String[] rutaS = {"-parser", "Sintax", "D:/ING EN SISTEMAS/9no Semestre/Lenguajes y automatas II/Compilador1/src/intface/Sintax.cup"};
        generar(ruta1, ruta2, rutaS);
    }

    public static void generar(String ruta1, String ruta2, String[] rutaS) throws IOException, Exception {
        File archivo;
        archivo = new File(ruta1);
        JFlex.Main.generate(archivo);
        archivo = new File(ruta2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaS);

        Path rutaSym = Paths.get("D:/ING EN SISTEMAS/9no Semestre/Lenguajes y automatas II/Compilador1/src/intface/sym.java");

        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }

        Files.move(
                Paths.get("D:/ING EN SISTEMAS/9no Semestre/Lenguajes y automatas II/Compilador1/sym.java"),
                Paths.get("D:/ING EN SISTEMAS/9no Semestre/Lenguajes y automatas II/Compilador1/src/intface/sym.java")
        );

        Path rutaSin = Paths.get("D:/ING EN SISTEMAS/9no Semestre/Lenguajes y automatas II/Compilador1/src/intface/Sintax.java");

        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }

        Files.move(
                Paths.get("D:/ING EN SISTEMAS/9no Semestre/Lenguajes y automatas II/Compilador1/Sintax.java"),
                Paths.get("D:/ING EN SISTEMAS/9no Semestre/Lenguajes y automatas II/Compilador1/src/intface/Sintax.java")
        );
    }
}
