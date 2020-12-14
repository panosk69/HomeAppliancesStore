public interface DeviceBasic {

     void setMikos (int mikos);


     void setYpsos (int ypsos);


     void setVathos (int vathos);


      void setKataskevastis (String kataskevastis);


      void setOnoma_syskevis (String onoma_syskevis);


      void setTypos_syskevis (String typos_syskevis);


      void setKatanalosi_energias (int katanalosi_energias);



     int getMikos();

     int getYpsos();

     int getVathos();

     String getKataskevastis();

     String getOnoma_syskevis();

     String getTypos_syskevis();

     int getKatanalosi_energias();





    public void powerOn();
    public void powerOff();
    public int periodicMantainance();
    public boolean status();

}
