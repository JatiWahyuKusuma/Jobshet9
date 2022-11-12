public class MainTugas {
    public static void main(String[] args) throws Exception {
        Segitiga sgt = new Segitiga();

        System.out.println("=========================================");
        System.out.println("|       DATA PERHITUNGAN SEGITIGA       |");
        System.out.println("=========================================");
        System.out.println("Total sudut Segitiga pertama       ="+sgt.totalSudut(60));
        System.out.println("Total Sudut Segitiga kedua         ="+sgt.totalSudut(90, 60));
        System.out.println("Total Keliling Segitiga pertama    ="+sgt.keliling(20, 15, 10));
        System.out.println("Total keliling Segitiga kedua      ="+sgt.keliling(6, 8));
        System.out.println("=========================================");
    }
}
