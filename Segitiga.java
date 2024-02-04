package bangun_datar;

public class Segitiga extends BangunDatar {
    int alas, tinggi, miring;
    
    public Segitiga(int alas, int tinggi, int miring){
        this.alas = alas;
        this.tinggi = tinggi;
        this.miring = miring;
    }
    
    @Override
    public double luas(){
        return this.alas * this.tinggi * 1/2;
    }
    
    @Override
    public double keliling(){
        return this.alas + this.tinggi + this.miring;
    }
}
