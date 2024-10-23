// kelas induk
class Hewan {
    void makan() {
        System.out.println("Hewan ini makan.");
    }
}

// kelas turunan
class Kucing extends Hewan {
    void suara() {
        System.out.println("Kucing bersuara: Meong");
    }
}

// kelas utama untuk menjalankan program
public class Single {
    public static void main(String[] args) {
        Kucing kucingku = new Kucing();
        kucingku.makan(); // memanggil metode dari kelas induk
        kucingku.suara(); // memanggil metode dari kelas turunan
    }
}

