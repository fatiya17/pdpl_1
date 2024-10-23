// Kelas dasar pertama
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Kelas dasar kedua
class Mammal {
    void walk() {
        System.out.println("Mammal is walking");
    }
}

// Kelas yang mewarisi dari Animal dan menggunakan komposisi dari Mammal
class Dog extends Animal {
    // Komposisi - Dog memiliki objek dari Mammal
    private Mammal mammal = new Mammal();
    
    void bark() {
        System.out.println("Dog is barking");
    }
    
    // Memanggil metode dari kelas Mammal
    void walk() {
        mammal.walk();
    }
}

public class Hybrid {
    public static void main(String[] args) {
        Dog dog = new Dog();
        
        // Memanggil metode dari kelas Dog, Animal, dan Mammal
        dog.eat();  // Dari kelas Animal
        dog.bark(); // Dari kelas Dog
        dog.walk(); // Dari kelas Mammal melalui komposisi
    }
}
