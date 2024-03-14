import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkList<kelas> linklist = new linkList<>();
        boolean lanjut = true;
        String matkul, tugas, deadline = "";
        int pilih1 = 0;
        while(lanjut){
            System.out.println("1. Tambah data dari depan ");
            System.out.println("2. Hapus data ");
            System.out.println("3. Cetak data ");
            System.out.println("4. Done");

            
            int pilih = sc.nextInt();
            String skiper = sc.nextLine();

            switch(pilih){
                case 1 :
                    System.out.println("Masukkan Nama Matkul ");
                    matkul = sc.nextLine();
                    System.out.println("Masukkan Nama Tugas ");
                    tugas = sc.nextLine();
                    System.out.println("Masukkan Deadline ");
                    deadline = sc.nextLine();
                    linklist.insertAtFront(new kelas(matkul, tugas, deadline));
                    break;

                case 2:
                System.out.println("1. hapus dari belakang ");
                System.out.println("2. hapus dari depan ");
                pilih1 = sc.nextInt();
                switch(pilih1){
                    case 1:
                    linklist.removeFromBack();
                    break;
                    case 2:
                    linklist.removeFromFront();
                    break;
                }
                break;
                
                case 3:
                System.out.println("1. Print dari belakang");
                System.out.println("2. Print dari depan");
                pilih1 = sc.nextInt();
                switch(pilih1){
                    case 1:
                    linklist.printBack();
                    break;
                    case 2:
                    linklist.printFront();
                    break;
                }
                break;

                case 4:
                lanjut = false;
            }
        }
    }
}
