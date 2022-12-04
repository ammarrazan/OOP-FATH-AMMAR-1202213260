public class Laptop extends Perangkat{
    protected boolean webcam;
    public Laptop(String drive, int ram, float processor, boolean
    webcam){
        super(drive, ram, processor);
        this.webcam = webcam;
    }
    
    // method overriding
    @Override
    public void informasi(){
        System.out.println("Laptop ini memiliki driver tipe "+drive+" dengan ram sebesar " +ram+" GB dan processor secepat " + processor +"0 Ghz. Selain itu laptop ini juga "+ (webcam == false ?" TIDAK Memiliki Webcam":" memiliki Webcam"));
    }
    public void bukaGame(String nama_game){
            System.out.println("laptop berhasil membuka game " + nama_game);
    }
    //overloading
    public void kirimEmail(String email){
        System.out.println("Laptop berhasil mengirim Email ke " + email);
    }
    public void kirimEmail(String email1,String email2){
        System.out.println("Laptop berhasil mengirim Email ke " + email1 +" dan ke " + email2);
    }
}
