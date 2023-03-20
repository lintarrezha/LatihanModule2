import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class latihanModul2 {

    public static void main(String[] args) {
        // Membuat objek Hewan dan menambahkan beberapa elemen
        List<String> Hewan = new ArrayList<>();
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");

        // Membuat objek HapusHewan dan menambahkan beberapa elemen
        List<String> HapusHewan = new ArrayList<>();
        HapusHewan.add("Kelinci");
        HapusHewan.add("Kambing");
        HapusHewan.add("Unta");

        // Menghapus data pada objek Hewan yang sama dengan data warna pada objek DeleteHewan
        Iterator<String> iterator = Hewan.iterator();
        while (iterator.hasNext()) {
            String hewan = iterator.next();
            if (HapusHewan.contains(hewan)) {
                iterator.remove();

                // Menampilkan elemen pada objek Hewan setelah data dihapus
                System.out.println("Objek Hewan setelah penghapusan data: " + Hewan);
            }
        }
    }
}
