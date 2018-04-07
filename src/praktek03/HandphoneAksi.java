package praktek03;
public class HandphoneAksi {
    public static void main(String[] args) {
        Handphone s = new Handphone();
            s.setMerk("android");
            s.setWarna("hirang");
            s.setHarga(1000000);
            
            s.cetakInfo();
            
            System.out.print("mereknya \t: ");
            System.out.println(s.getMerk());
            System.out.print("warnanya \t: ");
            System.out.println(s.getWarna());
            System.out.print("harganya \t: ");
            System.out.println(s.getHarga());
            
    }
}
