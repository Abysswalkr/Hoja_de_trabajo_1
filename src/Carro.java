public class Carro implements IRadio {
    // atributes
    private boolean switchedOn;

    private String Band;

    private double optionFM;

    private int optionAM;

    private int[] saveStationAM;

    private double[] saveStationFM;

    // metods
    public Carro() {
        // the radio is already turned on
        this.switchedOn = true;

        // the radio is on FM when is turned on
        this.Band = "AM";

        // the radio is on 87.9 when is turned on
        this.optionFM = 87.9;

        // the list for the saved stations
        this.saveStationAM = new int[6];
        this.saveStationFM = new double[6];
    }

    @Override
    public void TurnOn(){
        this.switchedOn = true;
    }

    @Override
    public void TurnOff() {
        this.switchedOn = false;
    }



    @Override
    public boolean isOnOff() {
        if (switchedOn) {
            return switchedOn;
        }else{
            return false;
        }
    }



    @Override
    public void setFreq(String freq) throws Exception {
        if (freq.equals("AM") || freq.equals("FM") ) {
            this.Band = freq;
        }else{
            throw new Exception("La frecuencia ingresada no es valida");
        }
    }



    @Override
    public String getFreq() {
        return this.Band;
    }

    @Override
    public void Change() {
        // to verify the frecuency of the radio
        if (Band.equals("AM")) {
            // the frecuency is 10 by 10
            this.optionAM += 10;
            // return when it gets to the end
            if(this.optionAM >=1610){
                this.optionAM = 530;
            }
        }else{
            // FM frecuency is 0.2
            this.optionFM += 0.2;
            // return when it gets to the end
            if (this.optionFM>=107.9) {
                this.optionFM = 87.9;
            }
        }
    }


    public void Back() {
        // to see the frecuency of the radio
        if (Band.equals("AM")) {
            // the frecuency is 10 by 10
            this.optionAM -= 10;
            // return when it gets to the end
            if (this.optionAM<=530) {
                this.optionAM = 1610;
            }
        } else {
            // FM frecuency is 0.2
            this.optionFM -= 0.2;
            // return when it gets to the end
            if (this.optionFM<=87.9) {
                this.optionFM = 107.9;
            }
        }
    }



    @Override
    public double ActualStationFM() {
        return this.optionFM;
    }



    @Override
    public int ActualStationAM() {
        return this.optionAM;
    }



    @Override
    public void setFMActualStation(double actualStation) {
        this.optionFM = actualStation;
    }



    @Override
    public void setAMActualStation(int actualStation) {
        this.optionAM = actualStation;
    }



    @Override
    public void saveStationFM(double actualStation, int slot){
        this.saveStationFM[slot] = actualStation;
    }



    @Override
    public void saveStationAM(int actualStation, int slot){
        this.saveStationAM[slot] = actualStation;
    }



    @Override
    public double getFMButton(int slot){
        return this.saveStationFM   [slot];
    }



    @Override
    public int getAMButton(int slot){
        return this.saveStationAM[slot];
    }

}


