public class Dog {
    //instance Variabel
    String name;
    String breed;
    int age;
    String color;

    //Constructor Declaration of Class
    public Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    //Method 1
    public String getName() {
        return name;
    }

    //Method 2
    public String getBreed() {
        return breed;
    }

    //Method 3
    public int getAge() {
        return age;
    } 

    //Method 4 
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return("Hay nama anjing saya: " + this.getName() +
            ".\nMemiliki Ras: " + this.getBreed() +
            ".\nUmur: " + this.getAge() +
            ".\nWarna:" + this.getColor());
}

    public static void main(String[] args) {
        Dog popi = new Dog("popi", "Buldog", 3, "Hitam Pekat");

        System.out.println(popi.toString());
}

}

