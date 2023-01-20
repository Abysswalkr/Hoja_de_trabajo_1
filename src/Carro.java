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
}

