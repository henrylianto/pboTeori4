import java.util.Scanner;

public class hadiah4 
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);
        String nama;
        char grade ;
        final double tgs1 ,tgs2,tgs3, mid , akhir,tottugas,totakhir;
        System.out.println("===== Menghitung Nilai Mahasiswa=====\n");
        System.out.print("Masukan Nama : ");
        nama = input.nextLine();
        System.out.print("Nilai tugas 1 : ");
        tgs1 = input.nextInt();
        System.out.print("Nilai tugas 2 : ");
        tgs2 = input.nextInt();
        System.out.print("Nilai tugas 3 : ");
        tgs3 = input.nextInt();
        System.out.print("Nilai mid : ");
        mid = input.nextInt();
        System.out.print("Nilai final : ");
        akhir = input.nextInt();
        tottugas = (tgs1+tgs2+tgs3)/3;
        totakhir = (tottugas * 0.30 )+( mid*0.30)+( akhir * 0.40);
        if (totakhir >= 80 && totakhir <=100){
            grade = 'A';
        }
        else if (totakhir > 60 && totakhir < 79){
            grade = 'B';
        }
        else if (totakhir > 50 && totakhir < 59){
            grade = 'C';
        }
        else if (totakhir > 40 && totakhir < 49){
            grade = 'D';
        }
        else {
            grade = 'E';
        }
        
           System.out.println("\n"+nama+" memiliki nilai akhir "+totakhir+" = "+grade);
                    
    }
}
