package pertemuanke7;

import java.util.Scanner;

public class StudiKasus2_28 {

    public static void main(String[] args) {
        Scanner fauzi = new Scanner(System.in);
        String namaMhs, jnsKegiatan, status;
        int jmlDokumen, peringkat, statusPendanaan, dokumenKurang;

        System.out.print("Nama mahasiswa: ");
        namaMhs = fauzi.nextLine();
        System.out.print("Jenis kegiatan: ");
        jnsKegiatan = fauzi.nextLine();
        System.out.print("Jumlah Dokumen: ");
        jmlDokumen = fauzi.nextInt();

        if (jnsKegiatan.equalsIgnoreCase("BELMAWA") || jnsKegiatan.equalsIgnoreCase("BAKORMA") || jnsKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Peringkat juara: ");
            peringkat = fauzi.nextInt();
            if (peringkat == 1 || peringkat == 2 || peringkat == 3) {
                if (jmlDokumen == 4) {
                    status = "Selamat! Dana penghargaan diberikan.";
                    System.out.println("Nama Mahasiswa: " + namaMhs);
                    System.out.println("Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): " + jnsKegiatan);
                    System.out.println("Peringkat juara: " + peringkat);
                    System.out.println("Jumlah dokumen: " + jmlDokumen);
                    System.out.println("Status anda: " + status);
                } else {
                    dokumenKurang = 4 - jmlDokumen;
                    System.out.println("Alasan: dokumen anda kurang " + dokumenKurang + " dokumen.");
                    status = "Dana penghargaan tidak diberikan.";
                    System.out.println("Status anda" + status);
                }
            } else {
                System.out.println("Anda tidak berhak mendapatkan dana penghargaan");
            }
        } else if (jnsKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Status pendanaan (Angka 1 = lolos, 0 = tidak lolos) : ");
            statusPendanaan = fauzi.nextInt();
            if (statusPendanaan == 1) {
                status = "Anda berhak untukmendapatkan  dana penghargaan.";
                if (jmlDokumen == 4) {
                    System.out.println("Nama Mahasiswa: " + namaMhs);
                    System.out.println("Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): " + jnsKegiatan);
                    System.out.println("Status pendanaan: " + status);
                    System.out.println("Jumlah dokumen: " + jmlDokumen);
                } else {
                    status = "Anda tidak berhak mendapatkan dana pendanaan.";
                    dokumenKurang = 4 - jmlDokumen;
                    System.out.println("Nama Mahasiswa: " + namaMhs);
                    System.out.println("Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): " + jnsKegiatan);
                    System.out.println("Alasan: dokumen anda kurang " + dokumenKurang + " dokumen.");
                    System.out.println("Status pendanaan: " + status);
                }
            } else {
                System.out.println("Tidak memperoleh dana penghargaan (PKM tidak tidak lolos pendanaan)");
            }
        } else {
            System.out.println("Kegiatan di luar ketentuan. Dana penghargaan tidak diberikan.");
        }
        fauzi.close();
    }
}
