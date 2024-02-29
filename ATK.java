public class ATK {
    String kode;
    String jenis;
    String nama;
    int stok;

    public ATK(String kode, String jenis, String nama, int stok){
        this.kode = kode;
        this.jenis = jenis;
        this.nama = nama;
        this.stok = stok;
    }
    
    public String getKode(){
        return kode;
    }

    public String getJenis(){
        return jenis;
    }

    public String getNama(){
        return nama;
    }

    public int getStok(){
        return stok;
    }

    @Override
    public String toString(){
        return kode+" "+nama+" "+stok+" |";
    }
    
}
