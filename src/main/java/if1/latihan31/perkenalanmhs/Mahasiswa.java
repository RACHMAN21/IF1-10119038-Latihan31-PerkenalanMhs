package if1.latihan31.perkenalanmhs;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : program ini berisi untuk menampilkan biodata seorang
 *                     mahasiswa.
 */

public class Mahasiswa {
    public String nim;
    public String nama;
    
    public static void main(String[] args) {
        // Menampilkan data orang 1
        perkenalanDiri("10119038","Rachman Aldiansyah");
        System.out.println();
        // Menampilkan data orang 2
        perkenalanDiri("10110270","Indra Tiola");
        System.out.println();
        // Menampilkan data orang 3
        perkenalanDiri("10110271","Robi Tanzil Ganefi");
        System.out.println();
        // Menampilkan data orang 4
        perkenalanDiri("10110269","Muhammad Nur Awaludin");
    }
    
    public static void perkenalanDiri(String nim, String nama) {
        System.out.println("Hallo Everyone");
        System.out.println("My NIM is " + nim);
        System.out.println("My Name is " + nama);
    }
}