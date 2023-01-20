/**
 * This Class, will execute all program menus.
 * @author: Sergio Palacios, 22808
 * @version: 19/01/2023
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Carro miradio = new Carro();

        System.out.println("Menu");
        // declaramos dos variables scanner
        Scanner texto = new Scanner(System.in);
        Scanner numero = new Scanner(System.in);

        int opcion = 0;
