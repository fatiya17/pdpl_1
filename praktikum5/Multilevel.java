// kelas dasar
class Hewan {
    void makan() {
        System.out.println("Hewan ini makan.");
    }
}

// kelas menengah
class Kucing extends Hewan {
    void suara() {
        System.out.println("Kucing bersuara: Meong");
    }
}

// kelas turunan
class KucingPersia extends Kucing {
    void jenis() {
        System.out.println("Ini adalah Kucing Persia.");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        KucingPersia kp = new KucingPersia();
        kp.makan(); // memanggil metode dari kelas Hewan
        kp.suara(); // memanggil metode dari kelas Kucing
        kp.jenis();  // memanggil metode dari kelas KucingPersia
    }
}

