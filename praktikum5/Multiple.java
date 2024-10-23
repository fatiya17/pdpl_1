// Kelas pertama
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Kelas kedua
class Mammal {
    void walk() {
        System.out.println("Mammal is walking");
    }
}

// Kelas utama menggunakan komposisi dari kedua kelas
class Dog {
    // Membuat objek dari kelas lain untuk menggunakan metode mereka
    private Animal animal = new Animal();
    private Mammal mammal = new Mammal();
    
    // Metode untuk memanggil metode kelas lain
    void eat() {
        animal.eat();
    }
    
    void walk() {
        mammal.walk();
    }
}

public class Multiple {
    public static void main(String[] args) {
        Dog dog = new Dog();
        
        // Memanggil metode dari objek yang digunakan dalam komposisi
        dog.eat();
        dog.walk();
    }
}
