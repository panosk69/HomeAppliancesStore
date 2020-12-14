import java.awt.*;
import java.awt.print.Printable;

public class HomeAppliancesStore {

    static String onomaEterias;
    static String diefthinsi;
    static int plithosYpalilwn;

    public static void setOnomaEterias(String onoma){
        onomaEterias=onoma;
    }
    public static void setDiefthinsi(String dief){
        diefthinsi=dief;
    }
    public static void setPlithosYpalilwn(int plithos) {
        plithosYpalilwn = plithos;
    }

    public static String getOnomaEterias(){
        return onomaEterias;
    }


    public static String getDiefthinsi(){
        return diefthinsi;
    }


    public static int getPlithosYpalilwn(){
        return plithosYpalilwn;
    }



    public static void main(String [] args) {


        try {
            setOnomaEterias(args[0]);
            setDiefthinsi(args[1]);
            try{
                setPlithosYpalilwn(Integer.parseInt(args[2]));
            }catch(Exception e){System.out.println("dose akereo");}
       }catch(Exception e){System.out.println("den yparxei orisma isodou");}

        if (onomaEterias  == null) {
                System.out.println("lathos stixia");
            } else { }
        if (diefthinsi  == null) {
            System.out.println("lathos stixia");
        } else { }


        System.out.println (getOnomaEterias()+", "+getDiefthinsi()+", "+getPlithosYpalilwn());

        /*dilosi timwn(to new + onoma klasis arxikopoiei tis times kai kalei ton constructor */

        Oven oven2= new Oven(50,50,50,"bosch","bosch a123","fournos",600,70,220,12,4,true);
        AirCondition AC=new AirCondition(80,30,20,"Carrier ","Carrier b88 ","klimatistiko",700,10000,9000,false,false,50);
        WashineMachine WM=new WashineMachine(60,80,50,"lg","lg c44","plintirio",550,8,1400,14,65,10);
        Fridge fridge2=new Fridge(50,180,50,"morris","Morris d55","psigio ",200,190,70,"symvatikos",4,false);

        /*prospelasi melwn klasis  */

        oven2.printoven();
        AC.printAC();
        WM.printWM();
        fridge2.printFridge();

        oven2.powerOff();
        AC.powerOn();
        fridge2.powerOn();
        WM.powerOff();

        deviceStatus(AC);

        /*ektiposi sinolikon proionton(h metavliti sinolo pernei tin timi tis metavlitis counter
         ,h counter yparxei se kathe klasi kai metraei ton arithmo twn siskevwn pou dimiourgounte )*/
        int sinolo = oven2.getCounter()+ AC.getCounter()+ WM.getCounter()+ fridge2.getCounter();
        System.out.println("sinolika proionta: "+sinolo);




    }

    public static void deviceStatus(Device d) {
        System.out.println("i siskevi litourgei?: " + d.status());
        System.out.println("idos siskevis: ");

        if (d instanceof Oven)
            System.out.println("Fournos");

        if (d instanceof AirCondition)
            System.out.println("klimatistiko");

        if (d instanceof WashineMachine)
            System.out.println("plintirio");

        if (d instanceof Fridge)
            System.out.println("psigio");


    }

}

