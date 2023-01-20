public class Carro implements IRadio {
    /*
     * @author Erick Barrera
     * @author Sergio Palacios
     * @author Jose Gramajo
     * @author Pablo Noack

     * @date 19- 01 - 2023
     * Clase principal para poder interactuar con la radio
     */

    // attributes

    private boolean turnOn;
    private String frequence;
    private double FMstation;
    private int AMstation;
    private double[] saveFMstation;
    private int[] saveAMstation;

    // metods

    public Carro(){
        // enciende la radio
        this.turnOn = true;
        // frecuencia por defecto al enceder la radio
        this.frequence = "FM";
        // estacion por defecto al encender la radio
        this.FMstation =  87.9;

        // listas de FM y AM para guardar las emisoras
        this.saveFMstation = new double [12];
        this.saveAMstation = new int [12];

    }

    @Override
    public void tron(){
        this.turnOn = true;
    }

    @Override
    public void troff(){
        this.turnOn = false;
    }

    /**
     * @return  boolean
     */
    @Override
    public boolean on(){
        if (turnOn){
            return turnOn;
        }else {
            return false;
        }
    }
}
