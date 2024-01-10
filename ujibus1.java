package OOP.tugasEnkapsulasi;

public class ujibus1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Bus1 busMini=new Bus1();
        busMini.penumpang=5;
        busMini.maxpenumpang=5;
        busMini.cetak();
        
        busMini.penumpang=busMini.penumpang+5;
        busMini.cetak();
        
        busMini.penumpang=busMini.penumpang-2;
        busMini.cetak();
        
        
        busMini.penumpang=busMini.penumpang+8;
        busMini.cetak();
        
          
    }

}
