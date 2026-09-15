import java.util.Scanner;

public class KartuMahasiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIK (16 digit)  : ");
        long nik = input.nextLong();

        System.out.print("Masukkan umur            : ");
        int umur = input.nextInt();

        System.out.print("Masukkan tinggi (cm)     : ");
        double tinggiBadan = input.nextDouble();

        System.out.print("Masukkan golongan darah  : ");
        char golonganDarah = input.next().charAt(0);

        System.out.print("Sudah menikah (true/false): ");
        boolean sudahMenikah = input.nextBoolean();

        System.out.print("Masukkan nama lengkap    : ");
        String namaLengkap = input.nextLine();

        System.out.println();
        System.out.println("===== KARTU MAHASISWA =====");
        System.out.println("Nama      : " + namaLengkap);
        System.out.println("NIK       : " + nik);
        System.out.println("Umur      : " + umur + " tahun");
        System.out.println("Tinggi    : " + tinggiBadan + " cm");
        System.out.println("Gol darah : " + golonganDarah);
        System.out.println("Menikah   : " + sudahMenikah);

        input.close();
    }
}