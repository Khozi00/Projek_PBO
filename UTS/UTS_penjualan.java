
package UTS;

public class UTS_penjualan {

    private String noFaktur;
    private String tanggal;
    private String namaPelanggan;
    private int kodeBarang;
    private int harga;
    private int jumlah;
    private double total;
    private double diskon;
    public UTS_penjualan(String noFaktur, String tanggal, String namaPelangan,int barang,int jumlah,double total,double diskon){ 
    //public UTS_penjualan(String string, String vandi, String string0, String string1, String string2) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getNoFaktur() {
        return noFaktur;
    }

    public String getTanggal() {
        return tanggal;
    }
    
    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public int getKodeBarang() {
        return kodeBarang;
    }

    public int getHarga() {
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getDiskon() {
        return diskon;
    }
    
    public double getTotal() {
        return total;
    }

    public void setNilai(String NoFaktur,String Tanggal, String NamaPelanggan, int KodeBarang, int Harga, int Jumlah, double Diskon, double Total) {
        this.noFaktur = NoFaktur;
        this.tanggal = Tanggal;
        this.namaPelanggan = NamaPelanggan;
        this.kodeBarang = KodeBarang;
        this.harga = Harga;
        this.jumlah = Jumlah ;
        this.diskon = Diskon;
        this.total = Total;
    }

}

