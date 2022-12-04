public class App {
    public static void main(String[] args) throws Exception {
        Perangkat p = new Perangkat("lenovo",2,1.80F);
        p.informasi();
        System.out.print("\n");

        Laptop legion = new Laptop("MSI",8,2.40F,true);
        legion.informasi();
        legion.bukaGame("Valorant");
        legion.kirimEmail("rumahgemingk@gmail.com");
        legion.kirimEmail("gedunggeming@gmail.com","batugemingc@gmail.com");

        System.out.print("\n");
        HP handphone = new HP("Samsung",3,2.20F,false); 
        handphone.informasi();
        handphone.telfon(62212480);
        handphone.kirimSMS(62127043);
        handphone.kirimSMS(62982442,62780890);
    }
}