
public class daire extends geometrik_sekil{
    private int yaricap;
    public daire(int yaricap){
        this.yaricap=yaricap;
}
    public void alanhesapla(){
        double alan;
        alan=(Math.PI)*yaricap*yaricap;
        System.out.println("dairenin alani: "+alan);
    }
   @Override
    public void cizimyap(){
        System.out.println("daire ciziliyor");
        
    }
}
