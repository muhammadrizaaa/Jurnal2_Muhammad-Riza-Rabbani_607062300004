import java.util.Scanner;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        genArrayList<ATK> ATKList = new genArrayList<>(5);
        genArrayList<Bag> BagList = new genArrayList<>(5);
        
        ATKList.addData(new ATK("A0001", "Pensil", "Joyko 2B", 25));
        ATKList.addData(new ATK("A0002", "Pensil", "Faber Castle 2B", 40));
        ATKList.addData(new ATK("A0003", "Pulpen", "Debozz Hitam", 15));
        ATKList.addData(new ATK("B0001", "Kertas", "HVS", 300));
        ATKList.addData(new ATK("B0002", "Kertas", "Karton", 75));

        BagList.addData(new Bag("C0001", "Seragam", "SMA Putih biru", 30));
        BagList.addData(new Bag("C0002", "Seragam", "SMP Putih biru", 30));
        BagList.addData(new Bag("C0003", "Seragam", "SD Putih Merah", 50));
        BagList.addData(new Bag("C0004", "Topi", "Topi SD Merah", 50));
        BagList.addData(new Bag("C0005", "Kaos Kaki", "Kaos Kaki Hitam Putih", 100));
        
        ATKList.display();
        BagList.display();

    }
}
