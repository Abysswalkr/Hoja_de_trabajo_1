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

    private boolean switchedOn;
    private String bands;
    private double optionFMstation;
    private int optionAMstation;
    private double[] saveFMstation;
    private int[] saveAMstation;

    // metods

    public Carro() {
        // enciende la radio
        this.switchedOn = true;
        // frecuencia por defecto al enceder la radio
        this.bands = "FM";
        // estacion por defecto al encender la radio
        this.optionFMstation = 87.9;

        // listas de FM y AM para guardar las emisoras
        this.saveFMstation = new double[6];
        this.saveAMstation = new int[6];

    }


    /**
     *
     */
    @Override
    public void TurnOn() {

    }

    /**
     *
     */
    @Override
    public void TurnOff() {

    }

    /**
     * @return
     */
    @Override
    public boolean OnOff() {
        return false;
    }

    /**
     * @param frequency
     * @throws Exception
     */
    @Override
    public void setFrequence(String frequency) throws Exception {

    }

    /**
     * @return
     */
    @Override
    public String getFrequence() {
        return null;
    }

    /**
     *
     */
    @Override
    public void Change() {

    }

    /**
     *
     */
    @Override
    public void Back() {

    }

    /**
     * @return
     */
    @Override
    public int getStationActualAM() {
        return 0;
    }

    /**
     * @return
     */
    @Override
    public double getStationActualFM() {
        return 0;
    }

    /**
     * @param ActualStation
     */
    @Override
    public void setStationActualAM(double ActualStation) {

    }

    /**
     * @param ActualStation
     */
    @Override
    public void setStationActualAM(int ActualStation) {

    }

    /**
     * @param ActualStation
     */
    @Override
    public void setStationActualFM(int ActualStation) {

    }

    /**
     * @param ActualStation
     */
    @Override
    public void setStationActualFM(double ActualStation) {

    }

    /**
     * @param actualStation
     * @param slot
     */
    @Override
    public void saveStationFM(double actualStation, int slot) {

    }

    /**
     * @param actualStation
     * @param slot
     */
    @Override
    public void saveStationAM(int actualStation, int slot) {

    }

    /**
     * @param slot
     * @return
     */
    @Override
    public double getFMSlot(int slot) {
        return 0;
    }

    /**
     * @param slot
     * @return
     */
    @Override
    public int getAMSlot(int slot) {
        return 0;
    }
}

