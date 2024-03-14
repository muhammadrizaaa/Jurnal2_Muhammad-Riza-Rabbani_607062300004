public class kelas {
    private String matkul;
    private String tugas;
    private String deadline;

    public kelas(String matkul, String tugas, String deadline){
        this.matkul = matkul;
        this.tugas = tugas;
        this.deadline = deadline;
    }
    public String getMatkul(){
        return matkul;
    }

    @Override
    public String toString(){
        return "Matkul : "+matkul+ " | Tugas : "+tugas+" | Deadline : "+deadline;
    }
}