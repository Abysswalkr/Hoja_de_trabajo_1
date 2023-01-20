public interface IRadio {
    public void TurnOn();

    public void TurnOff();

    public boolean OnOff();

    public void setFrequence(String frequency) throws Exception;

    public String getFrequence();

    public void Change();

    public void Back();

    public int getStationActualAM();

    public double getStationActualFM();

    public void setStationActualAM(double ActualStation);

    void setStationActualAM(int ActualStation);

    public void setStationActualFM(int ActualStation);

    void setStationActualFM(double ActualStation);

    public void saveStationFM(double actualStation, int slot);

    public void saveStationAM(int actualStation, int slot);

    public double getFMSlot(int slot);

    public int getAMSlot(int slot);



}
