/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.dam.gestorpalabras;

import com.dam.Excepciones.TooShortWordException;

/**
 *
 * @author dev
 */
public class GestorPalabras {

    public boolean esPalindromo(String palabra) throws TooShortWordException {
        String palabraFormateada = palabra.replaceAll("\\s+", "").toLowerCase();
        if (palabra.length() <= 2) {
            throw new TooShortWordException("Palabra demasiado corta, por favor introduce una palabra de más longitud");
        } else {
            palabraFormateada = palabraFormateada.replace('á', 'a').replace('é', 'e').replace('í', 'i').replace('ó', 'o').replace('ú', 'u');
            for (int i = 0; i < palabraFormateada.length() / 2; i++) {
                if (palabraFormateada.charAt(i) != palabraFormateada.charAt(palabraFormateada.length() - i - 1)) {
                    return false;
                }
            }
        }
        return true;
    }

    public int contarVocales(String palabra) {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char caracter = Character.toLowerCase(palabra.charAt(i));
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' || caracter == 'á' || caracter == 'é' || caracter == 'í' || caracter == 'ó' || caracter == 'ú') {
                contador++;
            }
        }
        return contador;
    }

    public String invertirPalabra(String palabra) {
        StringBuilder resultado = new StringBuilder();
        for (int i = palabra.length() - 1; i >= 0; i--) {
            resultado.append(palabra.charAt(i));
        }
        return resultado.toString();
    }

}
