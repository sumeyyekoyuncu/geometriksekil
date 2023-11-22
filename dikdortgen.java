
public class dikdortgen extends geometrik_sekil{
    private int uzun_kenar;
    private int kisa_kenar;
    public dikdortgen(int uzun_kenar,int kisa_kenar){
        this.uzun_kenar=uzun_kenar;
        this.kisa_kenar=kisa_kenar;
    }
    public void alan_hesapla(){
        int alan;
        alan=uzun_kenar*kisa_kenar;
        System.out.println("dikdortgenin alani:"+alan);
    }
   @Override
    public void cizimyap(){
        System.out.println("dikdortgen ciziliyor...");
    }
    
}
