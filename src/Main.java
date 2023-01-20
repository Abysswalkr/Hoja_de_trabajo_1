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

        Scanner texto = new Scanner(System.in);
        Scanner numero = new Scanner(System.in);

        int opcion = 0;

        while (opcion!=8) {
            System.out.println(" ");
            System.out.println("1. select frequency");
            System.out.println("2. Change station (forward)");
            System.out.println("3. Change station (back)");
            System.out.println("4. current station");
            System.out.println("5. Save station in slot");
            System.out.println("6. get slot number");
            System.out.println("7. turn the radio on or off");
            System.out.println("8. Bye ");
            System.out.println(" ");

            System.out.println("Enter an option");
            opcion = numero.nextInt();

            if (opcion ==1 && miradio.isOnOff()== true) {
                try {
                    System.out.println("Enter AM or FM");
                    String freq = texto.nextLine();
                    miradio.setFreq(freq);
                    System.out.println("The radio has been put on the frequency" + miradio.getFreq());
                    if (miradio.getFreq().equals("FM")) {
                        miradio.setFMActualStation(87.9);
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }else if(opcion == 1 && miradio.isOnOff() == false){
                System.out.println("The radio is turned off");
            }

            if (opcion ==2 && miradio.isOnOff()==true) {
                miradio.Change();
                if(miradio.getFreq().equals("AM")){
                    System.out.println("It has been changed to the station: " + miradio.ActualStationAM());
                }else{
                    System.out.println("It has been changed to the station" + miradio.ActualStationFM());
                }
            }else if(opcion == 2 && miradio.isOnOff()==false){
                System.out.println("The radio is turned off");
            }

            if (opcion == 3 && miradio.isOnOff()==true) {
                miradio.Back();
                if (miradio.getFreq().equals("AM")) {
                    System.out.println("It has been changed to the station " + miradio.ActualStationAM());
                }else{
                    System.out.println("It has been changed to the station " + miradio.ActualStationFM());
                }
            }else if(opcion == 3 && miradio.isOnOff()==false){
                System.out.println("The radio is turned off");
            }
            if (opcion == 4 && miradio.isOnOff()== true) {
                if (miradio.getFreq().equals("AM")) {
                    System.out.println("You are on the AM frequency and the current station is: " + miradio.ActualStationAM());
                }else{
                    System.out.println("You are on the FM frequency and the current station is: " + miradio.ActualStationFM());
                }
            }else if(opcion == 4 && miradio.isOnOff()==false){
                System.out.println("The radio is turned off");
            }
            if (opcion == 5 && miradio.isOnOff()==true) {
                if (miradio.getFreq().equals("AM")) {
                    System.out.println("Enter the station to save");
                    int estacion = numero.nextInt();
                    System.out.println("Enter the space");
                    int slot = numero.nextInt();
                    miradio.saveStationAM(estacion, slot);
                    System.out.println("The space has been successfully saved");
                }else{
                    System.out.println("Enter the station to save");
                    double estacion = numero.nextDouble();
                    System.out.println("Enter the space");
                    int slot = numero.nextInt();
                    miradio.saveStationFM(estacion, slot);
                    System.out.println("The station has been saved successfully");
                }
            }else if(opcion == 5 && miradio.isOnOff()==false){
                System.out.println("The radio is turned off");
            }

            if (opcion ==6 && miradio.isOnOff()==true) {
                System.out.println("Enter the space you want to see");
                int slot = numero.nextInt();
                if (miradio.getFreq().equals("AM")) {
                    System.out.println("The station in space " + slot + " is: "+miradio.getAMButton(slot)+ " AM");
                }else{
                    System.out.println("The station in space " + slot + " es: "+miradio.getFMButton(slot)+ " FM");
                }
            }else if(opcion == 6 && miradio.isOnOff()==false){
                System.out.println("The radio is turned off");
            }

            if (opcion ==7) {
                System.out.println("1. Turn off the radio");
                System.out.println("2. Turn on the radio");

                int boton = numero.nextInt();
                if (boton == 1) {
                    miradio.TurnOff();
                    System.out.println("you have turned off the radio");
                }else{
                    miradio.TurnOn();
                    System.out.println("you have turned on the radio");
                }
            }
        }
        System.out.println(" Exit");
    }

}