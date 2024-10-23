// kelas induk
class Hewan {
    void makan() {
        System.out.println("Hewan ini makan.");
    }
}

// kelas turunan 1
class Kucing extends Hewan {
    void suara() {
        System.out.println("Kucing bersuara: Meong");
    }
}

// kelas turunan 2
class Anjing extends Hewan {
    void suara() {
        System.out.println("Anjing bersuara: Guk guk");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Kucing kucingku = new Kucing();
        Anjing anjingku = new Anjing();

        kucingku.makan(); // memanggil metode dari kelas induk
        kucingku.suara(); // memanggil metode dari kelas Kucing

        anjingku.makan(); // memanggil metode dari kelas induk
        anjingku.suara(); // memanggil metode dari kelas Anjing
    }
}
