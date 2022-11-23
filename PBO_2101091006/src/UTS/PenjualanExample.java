
package UTS;
import java.util.logging.Level;

public class PenjualanExample {
     public static void main( String[] args ){
         
         UTS_penjualan PenjualanExample = new UTS_penjualan();

         PenjualanExample.setFaktur("02HTRJ");
         PenjualanExample.setPelanggan("Khozi");
         PenjualanExample.setKode("2101091006");
         PenjualanExample.setHarga(200000);
         PenjualanExample.setJumlah(5);
         
         
         System.out.println("No Faktur = "+PenjualanExample.getFaktur());
         System.out.println("Nama Pelanggan = "+PenjualanExample.getPelanggan());
         System.out.println("Kode Penjualan = "+PenjualanExample.getKode());
         System.out.println("Harga = "+PenjualanExample.getHarga());
         System.out.println("Jumlah Barang = "+PenjualanExample.getJumlah());
         System.out.println("Total Harga = "+PenjualanExample.getTotal());
         System.out.println("Diskon = "+PenjualanExample.getDiskon());
         System.out.println("Total Bayar = "+PenjualanExample.getBayar());
         
     }
    
}

