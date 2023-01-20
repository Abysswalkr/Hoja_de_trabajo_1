public interface IRadio {
    public void TurnOn();

    public void TurnOff();

    public boolean OnOff();

    public void setFrequence(String frequency) throws Exception;

    public String getFrequence();

    public void Change();

    public void Back();

    public int getStationActualAM();

    public int getStationActualFM();

    public void getStationActualAM(double ActualStation);

    public void getStationActualFM(int ActualStation);

    public void saveStationFM(double actualStation, int slot);

    public void saveStationAM(int actualStation, int slot);

    public double getFMSlot(int slot);

    public int getAMSlot(int slot);



}
