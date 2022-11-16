
package UTS;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
public class PenjualanExample {
        public static void main(String[] args) {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            UTSPenjualan record = new UTSPenjualan();
            String noFaktur = "";
            String tanggal = "";
            String namaPelanggan = "";
            String namaBarang = "";
            int hargaBarang = 0;
            int jumlahBarang = 0;
            double diskon = 0;
            double pajak = 0;
            double totalBayar = 0;

            System.out.print("No Faktur = ");
            try {
                noFaktur = input.readLine();
                System.out.print("Tanggal = ");
                tanggal = input.readLine();
                System.out.print("Nama Pelanggan = ");
                namaPelanggan = input.readLine();
                System.out.print("Nama Barang =  ");
                namaBarang = input.readLine();
                System.out.print("Harga Barang = ");
                hargaBarang = Integer.parseInt(input.readLine());
                System.out.print("Jumlah Barang = ");
                jumlahBarang = Integer.parseInt(input.readLine());
                if (jumlahBarang > 10) {
                    diskon = hargaBarang * 0.01;
                }
                if (jumlahBarang > 30) {
                    diskon = hargaBarang * 0.02;
                }
                if (jumlahBarang > 60) {
                    diskon = hargaBarang * 0.03;
                } else {
                    System.out.println("\n");
                    System.out.println("Tidak mendapat diskon");
                }
                totalBayar = (jumlahBarang * hargaBarang) - diskon;
                pajak = 0.1 * totalBayar;
                record.setNilai(noFaktur, tanggal, namaPelanggan, namaBarang, hargaBarang, jumlahBarang, diskon, pajak, totalBayar);
                System.out.println("\n");
                System.out.println("========Berkas Transaksi================");
                System.out.println("No Faktur : " + record.getNoFaktur());
                System.out.println("Tanggal : " + record.getTanggal());
                System.out.println("Nama Pelanggan : " + record.getNamaPelanggan());
                System.out.println("Nama Barang : " + record.getNamaBarang());
                System.out.println("Harga Barang : " + record.getHargaBarang());
                System.out.println("Jumlah Barang : " + record.getJumlahBarang());
                System.out.println("Diskon : " + record.getDiskon());
                System.out.println("Pajak : " + record.getPajak());
                System.out.println("Total : " + record.getTotalBayar());
                System.out.println("========================================");
            } catch (IOException ex) {
                UTSLogger.getLogger(Penjualan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

