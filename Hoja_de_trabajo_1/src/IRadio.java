public interface IRadio {
    public void TurnOn();

    public void TurnOff();

    public boolean isOnOff();

    public void setFreq(String freq) throws Exception;
    public String getFreq();

    public void Change();

    public void Back();

    public double ActualStationFM();

    public int ActualStationAM();

    public void setFMActualStation(double actualStation);

    public void setAMActualStation(int actualStation);

    public void saveStationFM(double actualStation, int slot);

    public void saveStationAM(int actualStation, int slot);

    public double getFMButton(int slot);

    public int getAMButton(int slot);



}
