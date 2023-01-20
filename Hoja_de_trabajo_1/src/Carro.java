public class Carro implements IRadio {
    // atributos
    private boolean encendido;

    private String frequence;

    private double actualFMstation;

    private int actualAMstation;

    private int[] savedAMstations;

    private double[] savedFMstations;

    public  Carro() {
        // por defecto el radio inicia encendido
        this.encendido = true;

        // la radio inicia por defecto en la frecuencia AM
        this.frequence = "AM";

        // la radio inicia por defecto en la estacion 530
        this.actualAMstation = 530;

        // incializamos las listas de estaciones AM y FM, ambas con 12 slots disponibles
        this.savedAMstations = new int[12];
        this.savedFMstations = new double[12];
    }

    @Override
    public void TurnOn(){
        this.encendido = true;
    }

    @Override
    public void TurnOff() {
        this.encendido = false;
    }


    /**
     * @return boolean
     */
    @Override
    public boolean isOnOff() {
        if (encendido) {
            return encendido;
        }else{
            return false;
        }
    }


    /**
     * @param freq
     * @throws Exception
     */
    @Override
    public void setFreq(String freq) throws Exception {
        if (freq.equals("AM") || freq.equals("FM") ) {
            this.frequence = freq;
        }else{
            throw new Exception("La frecuencia ingresada no es valida");
        }
    }


    /**
     * @return String
     */
    @Override
    public String getFreq() {
        return this.frequence;
    }

    @Override
    public void Change() {
        // verificamos en que fracuencia esta el radio
        if (frequence.equals("AM")) {
            // si la frecuencia es AM, es step es de 10
            this.actualAMstation += 10;
            // cuando llega al maximo del rango, se retorna a la primera estacion
            if(this.actualAMstation >=1610){
                this.actualAMstation = 530;
            }
        }else{
            // si la frecuencia es FM, el step es de 0.2
            this.actualFMstation += 0.2;
            // si llegamos al maximo de rango, se retorna a la primera estacion
            if (this.actualFMstation>=107.9) {
                this.actualFMstation = 87.9;
            }
        }
    }

    @Override
    public void Back() {
        // verificamos en que frecuencia esta el radio
        if (frequence.equals("AM")) {
            // si la frecuncia es AM, el step es de 10
            this.actualAMstation -= 10;
            // cuando llegamos al minimo del rango, nos vamos a la ultima estacion
            if (this.actualAMstation<=530) {
                this.actualAMstation = 1610;
            }
        } else {
            // si la frecuencia es FM, el step es de 0.2
            this.actualFMstation -= 0.2;
            // cuando llegamos al minimo del rango, nos vamos a la ultima estacion
            if (this.actualFMstation<=87.9) {
                this.actualFMstation = 107.9;
            }
        }
    }


    /**
     * @return double
     */
    @Override
    public double ActualStationFM() {
        return this.actualFMstation;
    }


    /**
     * @return int
     */
    @Override
    public int ActualStationAM() {
        return this.actualAMstation;
    }


    /**
     * @param actualStation
     */
    @Override
    public void setFMActualStation(double actualStation) {
        this.actualFMstation = actualStation;
    }


    /**
     * @param actualStation
     */
    @Override
    public void setAMActualStation(int actualStation) {
        this.actualAMstation = actualStation;
    }


    /**
     * @param actualStation
     * @param slot
     */
    @Override
    public void saveStationFM(double actualStation, int slot){
        this.savedFMstations[slot] = actualStation;
    }


    /**
     * @param actualStation
     * @param slot
     */
    @Override
    public void saveStationAM(int actualStation, int slot){
        this.savedAMstations[slot] = actualStation;
    }


    /**
     * @param slot
     * @return double
     */
    @Override
    public double getFMButton(int slot){
        return this.savedFMstations[slot];
    }


    /**
     * @param slot
     * @return int
     */
    @Override
    public int getAMButton(int slot){
        return this.savedAMstations[slot];
    }

}
