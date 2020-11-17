public class WashineMachine {
    private  int mikos;
    private  int ypsos;
    private  int vathos;
    private  String kataskevastis;
    private  String onoma_syskevis;
    private  String typos_syskevis;
    private  int katanalosi_energias;
    private  int xoritikotita_plisis;
    private  int strofes;
    private  int programmata;
    private  int varos;
    private  int xronos_plisis_grigorou_programmatos;
    static int counter=0;

    /*constructors(afti i methodos kalite kata tin dimiourgia tou antikimenou,kai arxikopiei tis times sta pedia tou antikimenou
,exei idio onoma me tin klash,den epistrefi pote kapia timi)*/

    public WashineMachine(){}
    public WashineMachine(
            int mikos,
            int ypsos,
            int vathos,
            String kataskevastis,
            String onoma_syskevis,
            String typos_syskevis,
            int katanalosi_energias,
            int xoritikotita_plisis,
            int strofes,
            int programmata,
            int varos,
            int xronos_plisis_grigorou_programmatos
    )
    {
        this.mikos=mikos;
        this.ypsos=ypsos;
        this.vathos=vathos;
        this.kataskevastis=kataskevastis;
        this.onoma_syskevis=onoma_syskevis;
        this.typos_syskevis=typos_syskevis;
        this.katanalosi_energias=katanalosi_energias;
        this.xoritikotita_plisis=xoritikotita_plisis;
        this.strofes=strofes;
        this.programmata=programmata;
        this.varos=varos;
        this.xronos_plisis_grigorou_programmatos=xronos_plisis_grigorou_programmatos;
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

    public  void setXoritikotita_plisis (int xoritikotita_plisis){
        this.xoritikotita_plisis = xoritikotita_plisis;
    }
    public  void setStrofes (int strofes){
        this.strofes = strofes;
    }
    public  void setProgrammata (int programmata){
        this.programmata = programmata;
    }
    public  void setVaros (int varos){
        this.varos = varos;
    }
    public  void setXronos_plisis_grigorou_programmatos (int xronos_plisis_grigorou_programmatos){
        this.xronos_plisis_grigorou_programmatos = xronos_plisis_grigorou_programmatos;
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
    public int getXoritikotita_plisis(){
        return xoritikotita_plisis;
    }
    public int getStrofes(){
        return strofes;
    }
    public int getProgrammata(){
        return programmata;
    }
    public int getVaros(){
        return varos;
    }
    public int getXronos_plisis_grigorou_programmatos(){
        return xronos_plisis_grigorou_programmatos;
    }
    public int getCounter(){
        return counter;
    }


    public void printWM(){
        System.out.println("WASHING MACHINE :");
        System.out.println("mikos: "+this.mikos+" cm");
        System.out.println("ypsos: "+this.ypsos+" cm");
        System.out.println("vathos: "+this.vathos+" cm");
        System.out.println("kataskevastis: "+this.kataskevastis);
        System.out.println("onoma syskevis: "+this.onoma_syskevis);
        System.out.println("typos syskevis: "+this.typos_syskevis);
        System.out.println("etisia katanalosi energias : "+this.katanalosi_energias+" kWh");
        System.out.println("xoritikotita_plisis: "+this.xoritikotita_plisis+" kg");
        System.out.println("strofes : "+this.strofes);
        System.out.println("programmata : "+this.programmata);
        System.out.println("varos : "+this.varos+" kg");
        System.out.println("xronos_plisis_grigorou_programmatos : "+this.xronos_plisis_grigorou_programmatos+" min");
        System.out.println(" ");

    }

    private void periodicMantainance(){}
}
