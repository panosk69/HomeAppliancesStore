public class AirCondition extends Device {
    private  int mikos;
    private  int ypsos;
    private  int vathos;
    private  String kataskevastis;
    private  String onoma_syskevis;
    private  String typos_syskevis;
    private  int katanalosi_energias;
    private  int thermansi;
    private  int psiksi;
    private  boolean diathesimotita_afigrantira ;
    private  boolean diathesimotita_ionisti;
    private  int thorivos;
    static int counter=0;

    /*constructors(afti i methodos kalite kata tin dimiourgia tou antikimenou,kai arxikopiei tis times sta pedia tou antikimenou
    ,exei idio onoma me tin klash,den epistrefi pote kapia timi)*/

public AirCondition(){}
public AirCondition(
        int mikos,
        int ypsos,
        int vathos,
        String kataskevastis,
        String onoma_syskevis,
        String typos_syskevis,
        int katanalosi_energias,
        int thermansi,
        int psiksi,
        boolean diathesimotita_afigrantira,
        boolean diathesimotita_ionisti,
        int thorivos
)
{
    this.mikos=mikos;
    this.ypsos=ypsos;
    this.vathos=vathos;
    this.kataskevastis=kataskevastis;
    this.onoma_syskevis=onoma_syskevis;
    this.typos_syskevis=typos_syskevis;
    this.katanalosi_energias=katanalosi_energias;
    this.thermansi=thermansi;
    this.psiksi=psiksi;
    this.diathesimotita_afigrantira=diathesimotita_afigrantira;
    this.diathesimotita_ionisti=diathesimotita_ionisti;
    this.thorivos=thorivos;
    counter++;
}

//setters

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

    public  void setThermansi (int thermansi){
        this.thermansi = thermansi;
    }
    public  void setPsiksi (int psiksi){
        this.psiksi = psiksi;
    }
    public  void setDiathesimotita_afigrantira (boolean diathesimotita_afigrantira){
        this.diathesimotita_afigrantira = diathesimotita_afigrantira;
    }
    public  void setDiathesimotita_ionisti (boolean diathesimotita_ionisti){
        this.diathesimotita_ionisti = diathesimotita_ionisti;
    }
    public  void setThorivos (int thorivos){
        this.thorivos = thorivos;
    }
//getters

    public int getMikos(){
        return mikos;
    }
    public int getYpsos(){
        return ypsos;
    }
    public int getVathos(){
        return vathos;
    }
    public String getKataskevastis(){
        return kataskevastis;
    }
    public String getOnoma_syskevis(){
        return onoma_syskevis;
    }
    public String getTypos_syskevis(){
        return typos_syskevis;
    }
    public int getKatanalosi_energias(){
        return katanalosi_energias;
    }
    public int getThermansi(){
        return thermansi;
    }
    public int getPsiksi(){
        return psiksi;
    }
    public boolean getDiathesimotita_afigrantira(){
        return diathesimotita_afigrantira;
    }
    public boolean getDiathesimotita_ionisti(){
        return diathesimotita_ionisti;
    }
    public int getThorivos(){
        return thorivos;
    }
    public int getCounter(){
        return counter;
    }

    public void printAC(){
        System.out.println("AC :");
        System.out.println("mikos: "+this.mikos+" ek");
        System.out.println("ypsos: "+this.ypsos+" ek");
        System.out.println("vathos: "+this.vathos+" ek");
        System.out.println("kataskevastis: "+this.kataskevastis);
        System.out.println("onoma syskevis: "+this.onoma_syskevis);
        System.out.println("typos syskevis: "+this.typos_syskevis);
        System.out.println("etisisa katanalosi energias: "+this.katanalosi_energias+" kWh");
        System.out.println("thermiki apodosi: "+" Btu/h:"+this.thermansi);
        System.out.println("psiktiki apodosi : "+" Btu/h:"+this.psiksi);
        System.out.println("diathetei afigrantira? : "+this.diathesimotita_afigrantira);
        System.out.println("diathetei ionisti? : "+this.diathesimotita_ionisti);
        System.out.println("thorivos : "+this.thorivos+" db");
        System.out.println(" ");

    }


}

