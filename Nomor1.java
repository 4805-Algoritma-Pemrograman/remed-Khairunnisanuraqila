public class Nomor1{
     
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       System.out.println("masukan total kilometer (km):");
       int totalKm = input.nextInt();

       System.out.println("masukan total jam lembur:");
       int jamLembur = input.nextInt();


       int biayaTaksi;

       if (jamLembur >3) {
        biayaTaksi = 20000 + ((totalKm - 3) > 0 ? (totalKm - 3) * 10000 : 0);
       } else {
        biayaTaksi = 20000;
       }
       System.err.println("total km: + totalKm");
       System.err.println("kehormatan taksi: " + biayaTaksi + "0");
    }
}
