public interface IRadio {
    public void TurnOn();

    public void TurnOff();

    public boolean OnOff();

    public void setFrequence(String frequency) throws Exception;

    public String getFrequence();

    public void Change();

    public void Back();

    public double getStationActualAM();

    public double getStationActualFM();

    public double getStationActualAM(double ActualStation);

    public double getStationActualFM(int ActualStation);

    public void saveStationFM(double actualStation, int slot);

    public void saveStationAM(int actualStation, int slot);

    public double getFMSlot(int slot);

    public int getAMSlot(int slot);



}
