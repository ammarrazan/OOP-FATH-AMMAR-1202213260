public class App {
    public static void main(String[] args) throws Exception {
        kendaraan p = new kendaraan(jumlahKursi, biaya, informasi, berlayar, berlabuh, jangkar, mesin, kecepatan)
        TransportasiAir transportasi = new TransportasiAir( "");
        transportasi.informasi();
        transportasi.berlayar();
        transportasi.berlabuh();
        System.out.println("");

        Sampan sampan = new Sampan( );
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(jangkar);
        System.out.println("");
    }
}
