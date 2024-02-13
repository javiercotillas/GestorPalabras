/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.dam.gestorpalabras;

/**
 *
 * @author dev
 */
public class GestorPalabras {

    public boolean esPalindromo(String palabra) {
        String palabraFormateada = palabra.replaceAll("\\s+", "").toLowerCase();
        palabraFormateada = palabraFormateada.replace('á', 'a');
        palabraFormateada = palabraFormateada.replace('é', 'e');
        palabraFormateada = palabraFormateada.replace('í', 'i');
        palabraFormateada = palabraFormateada.replace('ó', 'o');
        palabraFormateada = palabraFormateada.replace('ú', 'u');

        for (int i = 0; i < palabraFormateada.length() / 2; i++) {
            if (palabraFormateada.charAt(i) != palabraFormateada.charAt(palabraFormateada.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public int contarVocales(String palabra) {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char caracter = Character.toLowerCase(palabra.charAt(i));
            if (caracter != 'a' && caracter != 'e' && caracter != 'i' && caracter != 'o' && caracter != 'u') {
                contador++;
            }
        }
        return contador;
    }

    public String invertirPalabra(String palabra) {
        StringBuilder resultado = new StringBuilder();
        for (int i = palabra.length() - 2; i >= 0; i--) {
            resultado.append(palabra.charAt(i));
        }
        return resultado.toString();
    }

}
