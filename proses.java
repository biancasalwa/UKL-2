package ukl_perpus;

import java.util.ArrayList;
import java.util.Scanner;
public class proses {
    private ArrayList<Integer> idBuku = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    private ArrayList<Integer> idSiswa = new ArrayList<Integer>();
    private ArrayList<String> Buku = new ArrayList<String>();
    private ArrayList<Integer> banyakDipinjam = new ArrayList<Integer>();
    public String getbuku(int IdBuku) {
        return this.Buku.get(IdBuku);
    }
    public int getBanyak(int IdBuku) {
        return this.banyakDipinjam.get(IdBuku);
    }
    public void setBuku(String namaBuku) {
        this.Buku.add(namaBuku);
    }
    public void setBanyak(int banyak) {
        this.banyakDipinjam.add(banyak);
    }
    proses() {
        this.idSiswa.add(0);
        this.idBuku.add(0);
        this.banyak.add(2);
        this.idSiswa.add(0);
        this.idBuku.add(1);
        this.banyak.add(3);
        this.idSiswa.add(1);
        this.idBuku.add(0);
        this.banyak.add(1);
        this.idSiswa.add(1);
        this.idBuku.add(2);
        this.banyak.add(2);
    }
    void prosesPinjam(siswa siswa, buku buku, proses proses) {
        
            Scanner input = new Scanner(System.in);
            System.out.println("Silahkan meminjam buku");
            int temp;
            int i = 0;
            do {
                int jumlah;
                int pinjam;
                System.out.println("Masukkan id Siswa: ");
                int idSiswa = input.nextInt();
                System.out.println("Wellcome " + siswa.getNama(idSiswa));
                System.out.println("Menampilkan status siswa ");
                System.out.println("Status siswa = " + siswa.getStatus(idSiswa));
                System.out.println("Masukkan pilihan proses:\n 1. Peminjaman \n 2. pengembalian \n 99. exit");
                Scanner options = new Scanner(System.in);
                temp = options.nextInt();
                if (siswa.getStatus(idSiswa) && temp == 1) {
                    siswa.setStatus(false, idSiswa);
                    System.out.println("Silahkan memilih buku untuk dipinjam: \n 1. " + buku.getNamaBuku(0) + "  \n 2. " + buku.getNamaBuku(1) + " \n 3. " + buku.getNamaBuku(2));
                    pinjam = options.nextInt();
                    proses.setBuku(buku.getNamaBuku((pinjam - 1)));
                    System.out.println("Masukkan jumlah. peminjaman maksimal sebanyak " + (buku.getStok((pinjam - 1))));
                    jumlah = options.nextInt();
                    proses.setBanyak(jumlah);
                    buku.setStok((buku.getStok(pinjam - 1) - jumlah), pinjam - 1);
                    char[] animationChar = new char[]{'|', '/', '-', '\\'};
                    for (int j = 0; j <= 100; j++) {
                        System.out.print("Processing: " + j + "% " + animationChar[j % 4] + "\r");
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("buku dipinjam = " + buku.getNamaBuku(pinjam - 1) + ", Sejumlah = " + jumlah);
                    System.out.println("Sisa buku sebanyak " + buku.getStok(pinjam - 1));
                    i++;
                    System.out.println("Nomor urut untuk pengembalian = " + i);
                } else if (!siswa.getStatus(idSiswa) && temp == 1) {
                    System.out.println("siswa sudah meminjam dan tidak bisa melakukan proses peminjaman. kembalikan buku terlebih dahulu atau keluar dari proses");
                } else if (!siswa.getStatus(idSiswa) && temp == 2) {
                    System.out.println("Masukkan nomor antrian pengembalian");
                    Scanner in = new Scanner(System.in);
                    int inputQueueNumber = in.nextInt();
                    System.out.println("Buku yang dipinjam = " + proses.getbuku((inputQueueNumber - 1)) + " Sejumlah: " + proses.getBanyak((inputQueueNumber - 1)));
                    System.out.println("Buku akan otomatis dikembalikan semua");
                    System.out.println("Siswa bisa kembali untuk meminjam buku");
                    siswa.setStatus(false, idSiswa);
                    System.out.println("Masukkan Nomor buku \n 1. " + buku.getNamaBuku(0) + "  \n 2. " + buku.getNamaBuku(1) + " \n 3. " + buku.getNamaBuku(2));
                    Integer inputNomorBuku = in.nextInt();
                    buku.setStok((buku.getStok((inputNomorBuku - 1)) + proses.getBanyak((inputQueueNumber - 1))), (inputNomorBuku - 1));
                    System.out.println("Buku dikembalikan, Terimakasih");
                    System.out.println("Nama buku = " + buku.getNamaBuku((inputNomorBuku - 1)) + " Sisa stok buku = " + buku.getStok((inputNomorBuku - 1)));
                }
            } while (temp != 99);
            char[] animationChar = new char[]{'|', '/', '-', '\\'};
            for (int j = 0; j <= 100; j++) {
                System.out.print("Processing: " + j + "% " + animationChar[j % 4] + "\r");
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("System has paused");
            System.out.println("Exited from system");

        } 
        }
    
        

