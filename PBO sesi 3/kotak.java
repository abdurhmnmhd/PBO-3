public class kotak extends bangun{
    public kotak(double panjang, double lebar, double sisi) {
        super.setName("kotak");
        this.hitungLuas(panjang, lebar);
        this.hitungKeliling(sisi);
    }

    public void hitungLuas(double panjang, double lebar){
        super.luas = panjang * lebar;
    }

    public void hitungKeliling(double sisi){
        super.keliling = 4 * sisi ;
    
}
}
