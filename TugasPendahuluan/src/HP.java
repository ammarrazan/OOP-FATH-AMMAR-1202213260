public class HP extends Perangkat{
    protected boolean fingerprint;
    public HP (String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }
    //overriding
    @Override
    public void informasi(){
        System.out.println("HP ini memiliki driver tipe "+drive+" dengan ram sebesar " +ram+" GB dan processor secepat " + processor +"0 Ghz. Selain itu handphone ini "+ (fingerprint == false ?" TIDAK Memiliki Fingerprint":" memiliki Fingerprint"));
    }
    public void telfon(int no_hp){
        System.out.println("HP ini berhasil menyambungkan telfon ke "+no_hp);
    }
    //method overloading
    public void kirimSMS(int no_hp){
        System.out.println("HP ini berhasil mengirim SMS ke "+no_hp);
    }
    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("HP ini berhasil mengirim SMS ke "+no_hp1+" dan ke "+ no_hp2);
    }
}

