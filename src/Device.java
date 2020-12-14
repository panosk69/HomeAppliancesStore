public abstract class Device implements DeviceBasic {

    private  int mikos;
    private  int ypsos;
    private  int vathos;
    private  String kataskevastis;
    private  String onoma_syskevis;
    private  String typos_syskevis;
    private  int katanalosi_energias;
    private boolean status;

    public void setMikos (int mikos){
        this.mikos = mikos;
    }
    public void setYpsos (int ypsos){
        this.ypsos = ypsos;
    }
    public void setVathos (int vathos){
        this.vathos = vathos;
    }
    public  void setKataskevastis (String kataskevastis){
        this.kataskevastis = kataskevastis;
    }
    public  void setOnoma_syskevis (String onoma_syskevis){
        this.onoma_syskevis = onoma_syskevis;
    }
    public  void setTypos_syskevis (String typos_syskevis){
        this.typos_syskevis = typos_syskevis;
    }
    public  void setKatanalosi_energias (int katanalosi_energias){
        this.katanalosi_energias = katanalosi_energias;
    }



    public  int getMikos () {
        return mikos;
    }
    public  int getYpsos () {
        return ypsos;
    }
    public  int getVathos () {
        return vathos;
    }
    public  String getKataskevastis () {
        return kataskevastis;
    }
    public  String getOnoma_syskevis () {
        return onoma_syskevis;
    }
    public  String getTypos_syskevis () {
        return typos_syskevis;
    }
    public  int getKatanalosi_energias () {
        return katanalosi_energias;
    }

    @Override
    public void powerOn() {
    status=true;
    }

    @Override
    public void powerOff() {
    status=false;
    }

    @Override
    public int periodicMantainance() {
        return 0;
    }

    @Override
    public boolean status() {
        return status;
    }
}
