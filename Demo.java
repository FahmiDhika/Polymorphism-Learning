package bangun_datar;

public class Demo {
    public static void main(String[] args) {
        
        BangunDatar bangundatar = new BangunDatar();
        Persegi persegi = new Persegi(10);
        Segitiga segitiga = new Segitiga(10, 20, 30);
        Lingkaran lingkaran = new Lingkaran (7);
    
        bangundatar.luas();
        bangundatar.keliling();
        
        System.out.println("=====PERSEGI=====");
        System.out.println("Luas Persegi : " + persegi.luas());
        System.out.println("Keliling Persegi : " + persegi.keliling());
        System.out.println("=====SEGITIGA=====");
        System.out.println("Luas Segitiga : " + segitiga.luas());
        System.out.println("Keliling Segitiga : " + segitiga.keliling());
        System.out.println("=====LINGKARAN=====");
        System.out.println("Luas Lingkaran : " + lingkaran.luas());
        System.out.println("Keliling Lingkaran : " + lingkaran.keliling());
    }   
}
