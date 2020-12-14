public class Fridge extends Device{
    private  int mikos;
    private  int ypsos;
    private  int vathos;
    private  String kataskevastis;
    private  String onoma_syskevis;
    private  String typos_syskevis;
    private  int katanalosi_energias;
    private  int xoritikotita_sintirisis;
    private  int xoritikotita_katapsiksis;
    private  String typos_psiksis;
    private  int rafia;
    private  boolean pagomixani;
    static int counter=0;
    /*constructors(afti i methodos kalite kata tin dimiourgia tou antikimenou,kai arxikopiei tis times sta pedia tou antikimenou
,exei idio onoma me tin klash,den epistrefi pote kapia timi)*/

    public Fridge(){}
    public Fridge(
            int mikos,
            int ypsos,
            int vathos,
            String kataskevastis,
            String onoma_syskevis,
            String typos_syskevis,
            int katanalosi_energias,
            int xoritikotita_sintirisis,
            int xoritikotita_katapsiksis,
            String typos_psiksis,
            int rafia,
            boolean pagomixani

    )
    {
        this.mikos=mikos;
        this.ypsos=ypsos;
        this.vathos=vathos;
        this.kataskevastis=kataskevastis;
        this.onoma_syskevis=onoma_syskevis;
        this.typos_syskevis=typos_syskevis;
        this.katanalosi_energias=katanalosi_energias;
        this.xoritikotita_sintirisis=xoritikotita_sintirisis;
        this.xoritikotita_katapsiksis=xoritikotita_katapsiksis;
        this.typos_psiksis=typos_psiksis;
        this.rafia=rafia;
        this.pagomixani=pagomixani;
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

    public  void setXoritikotita_sintirisis (int xoritikotita_sintirisis){
        this.xoritikotita_sintirisis = xoritikotita_sintirisis;
    }
    public  void setXoritikotita_katapsiksis (int xoritikotita_katapsiksis){
        this.xoritikotita_katapsiksis = xoritikotita_katapsiksis;
    }
    public  void setTypos_psiksis (String typos_psiksis){
        this.typos_psiksis = typos_psiksis;
    }
    public  void setRafia (int rafia){
        this.rafia = rafia;
    }
    public  void setPagomixani (boolean pagomixani){
        this.pagomixani = pagomixani;
    }

//getters

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
    public  int getXoritikotita_sintirisis () {
        return xoritikotita_sintirisis;
    }
    public  int getXoritikotita_katapsiksis () {
        return xoritikotita_katapsiksis;
    }
    public  String getTypos_psiksis () {
        return typos_psiksis;
    }
    public  int getRafia () {
        return rafia;
    }
    public  boolean getPagomixani () {
        return pagomixani;

    }
    public int getCounter(){
        return counter;
    }


    public void printFridge(){
        System.out.println("FRIDGE :");
        System.out.println("mikos: "+this.mikos+" cm");
        System.out.println("ypsos: "+this.ypsos+" cm");
        System.out.println("vathos: "+this.vathos+" cm");
        System.out.println("kataskevastis: "+this.kataskevastis);
        System.out.println("onoma syskevis: "+this.onoma_syskevis);
        System.out.println("typos syskevis: "+this.typos_syskevis);
        System.out.println("etisia katanalosi energias : "+this.katanalosi_energias+" kWh");
        System.out.println("xoritikotita sintirisis : "+this.xoritikotita_sintirisis+" lt");
        System.out.println("xoritikotita katapsiksis : "+this.xoritikotita_katapsiksis+" lt");
        System.out.println("typos psiksis: "+this.typos_psiksis);
        System.out.println("rafia : "+this.rafia);
        System.out.println("exei pagomixani : "+this.pagomixani);
        System.out.println(" ");

    }




}

