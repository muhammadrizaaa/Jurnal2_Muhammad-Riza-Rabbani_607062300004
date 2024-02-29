public class Bag {
    String kode;
    String jenis;
    String nama;
    int stok;

    public Bag(String kode, String jenis, String nama, int stok){
        this.kode = kode;
        this.jenis = jenis;
        this.nama = nama;
        this.stok = stok;
    }
    public String getKode(){
        return kode;
    }
    public String getjenis(){
        return jenis;
    }
    public String getnama(){
        return nama;
    }
    public int getstok(){
        return stok;
    }

    @Override
    public String toString(){
        return kode+" "+nama+" "+stok+" |";
    }
}
