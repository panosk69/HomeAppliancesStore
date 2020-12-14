    public class Oven extends Device {

    private int mikos;
    private int ypsos;
    private int vathos;
    private String kataskevastis;
    private String onoma_syskevis;
    private String typos_syskevis;
    private int katanalosi_energias;
    private int xoritikotita_fournou;
    private int eyros_thermokrasias;
    private int tropoi_psisimatos;
    private int esties;
    private boolean xronometro;
    static int counter=0;

/*constructors(afti i methodos kalite kata tin dimiourgia tou antikimenou,kai arxikopiei tis times sta pedia tou antikimenou
,exei idio onoma me tin klash,den epistrefi pote kapia timi)*/
       public Oven(){}
       public Oven(
               int mikos,
               int ypsos,
               int vathos,
               String kataskevastis,
               String onoma_syskevis,
               String typos_syskevis,
               int katanalosi_energias,
               int xoritikotita_fournou,
               int eyros_thermokrasias,
               int tropoi_psisimatos,
               int esties,
               boolean xronometro

       )
       {
           this.mikos=mikos;
           this.ypsos=ypsos;
           this.vathos=vathos;
           this.kataskevastis=kataskevastis;
           this.onoma_syskevis=onoma_syskevis;
           this.typos_syskevis=typos_syskevis;
           this.katanalosi_energias=katanalosi_energias;
           this.xoritikotita_fournou=xoritikotita_fournou;
           this.eyros_thermokrasias=eyros_thermokrasias;
           this.tropoi_psisimatos=tropoi_psisimatos;
           this.esties=esties;
           this.xronometro=xronometro;
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

        public  void setXoritikotita_fournou (int xoritikotita_fournou){
            this.xoritikotita_fournou = xoritikotita_fournou;
        }
        public  void setEyros_thermokrasias (int eyros_thermokrasias){
            this.eyros_thermokrasias = eyros_thermokrasias;
        }
        public  void setTropoi_psisimatos (int tropoi_psisimatos){
            this.tropoi_psisimatos = tropoi_psisimatos;
        }
        public  void setEsties (int esties){
            this.esties = esties;
        }
        public  void setRoloi (boolean xronometro){
            this.xronometro = xronometro;
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
        public  int getXoritikotita_fournou () {
            return xoritikotita_fournou;
        }
        public  int getEyros_thermokrasias () {
            return eyros_thermokrasias;
        }
        public  int getTropoi_psisimatos () {
            return tropoi_psisimatos;
        }
        public  int getEsties () {
            return esties;
        }
        public  boolean getXronometro () {
            return xronometro;

        }
        public int getCounter(){
           return counter;
        }
        public void printoven(){
           System.out.println("OVEN: ");
           System.out.println("mikos: "+this.mikos+" ek");
           System.out.println("ypsos: "+this.ypsos+" ek");
           System.out.println("vathos: "+this.vathos+" ek");
           System.out.println("kataskevastis: "+this.kataskevastis);
           System.out.println("onoma syskevis: "+this.onoma_syskevis);
           System.out.println("typos syskevis: "+this.typos_syskevis);
           System.out.println("etisia katanalosi energias : "+this.katanalosi_energias+" kWh");
           System.out.println("xoritikotita fournou: "+this.xoritikotita_fournou+" lt");
           System.out.println("eyros thermokrasias: "+this.eyros_thermokrasias+" vathmoi");
           System.out.println("tropoi psisimatos: "+this.tropoi_psisimatos);
           System.out.println("esties : "+this.esties);
           System.out.println("exei xronometro : "+this.xronometro);
            System.out.println(" ");

        }


}
