public class bangun {
   
        protected double panjang;
        protected double tinggi;
        protected double lebar;
        protected double alas;
        protected String name;
        protected double luas;
        protected double keliling;
        public double getPanjang() {
            return this.panjang;
        }

        public double getTinggi() {
            return this.tinggi;
        }

        public double getLebar() {
            return this.lebar;
        }

        public double getAlas() {
            return this.alas;
        }

        public double getLuas() {
            return this.luas;
        }

        public double getKeliling() {
            return this.keliling;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name ;
        }

        public void getInfo() {
            System.out.println("Name :" + this.name);
            //System.out.println("Panjang :" + this.panjang);
            //System.out.println("Tinggi :" + this.tinggi);
            //System.out.println("Lebar :" + this.lebar);
            //System.out.println("Alas :" + this.alas);
            System.out.println("Luas :" + this.luas);
            System.out.println("Keliling :" + this.keliling);
        }
    
    
}
