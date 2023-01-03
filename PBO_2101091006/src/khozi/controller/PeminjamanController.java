/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khozi.controller;

import khozi.dao.PeminjamanDao;
import khozi.dao.PeminjamanDaoImpl;
import khozi.model.Peminjaman;
import khozi.view.FormPeminjaman;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PeminjamanController {
    private FormPeminjaman formPeminjaman;
    private PeminjamanDao peminjamanDao;
    private Peminjaman peminjaman;
    
    public PeminjamanController(FormPeminjaman formPeminjaman){
        this.formPeminjaman = formPeminjaman;
        peminjamanDao = new PeminjamanDaoImpl();
    }
    
    public void bersihForm(){
        formPeminjaman.getTxtNoBp().setText("");
        formPeminjaman.getTxtKodeBuku().setText("");
        formPeminjaman.getTxtTanggalPinjam().setText("");
        formPeminjaman.getTxtTanggalKembali().setText("");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = (DefaultTableModel) formPeminjaman.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Peminjaman> listPeminjaman = peminjamanDao.getAllPeminjaman();
        for(Peminjaman peminjaman : listPeminjaman){
            Object[] data={
                peminjaman.getNoBp(),
                peminjaman.getKodeBuku(),
                peminjaman.getTanggalPinjam(),
                peminjaman.getTanggalKembali()
            };
            tabelModel.addRow(data);
        }
    }
    
    public void getPeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if(peminjaman != null){
            formPeminjaman.getTxtNoBp().setText(peminjaman.getNoBp());
            formPeminjaman.getTxtKodeBuku().setText(peminjaman.getKodeBuku());
            formPeminjaman.getTxtTanggalPinjam().setText(peminjaman.getTanggalPinjam());
            formPeminjaman.getTxtTanggalKembali().setText(peminjaman.getTanggalKembali());
        }
    }
    
    public void savePeminjaman(){
        peminjaman = new Peminjaman();
        peminjaman.setNoBp(formPeminjaman.getTxtNoBp().getText());
        peminjaman.setKodeBuku(formPeminjaman.getTxtKodeBuku().getText());
        peminjaman.setTanggalPinjam(formPeminjaman.getTxtTanggalPinjam().getText());
        peminjaman.setTanggalKembali(formPeminjaman.getTxtTanggalKembali().getText());
        peminjamanDao.save(peminjaman);
        JOptionPane.showMessageDialog(formPeminjaman, "Entri Data Ok!");
    }    
    
    public void deletePeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjamanDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Delete Ok!");
    }
    
    public void UpdatePeminjaman() {
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman.setNoBp(formPeminjaman.getTxtNoBp().getText());
        peminjaman.setKodeBuku(formPeminjaman.getTxtKodeBuku().getText());
        peminjaman.setTanggalPinjam(formPeminjaman.getTxtTanggalPinjam().getText());
        peminjaman.setTanggalKembali(formPeminjaman.getTxtTanggalKembali().getText());
        peminjamanDao.update(index, peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Update Ok!");
    }
}
