/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khozi.dao;

import khozi.model.Peminjaman;
import java.util.ArrayList;
import java.util.List;

public class PeminjamanDaoImpl implements PeminjamanDao{
    List<Peminjaman> data = new ArrayList<>();
    
    @Override
    public Peminjaman save(Peminjaman peminjaman){
        data.add(peminjaman);
        return peminjaman;
    }
    
    public Peminjaman update(int index, Peminjaman peminjaman){
        data.set(index, peminjaman);
        return peminjaman;
    }
    
    public Peminjaman delete(int index){
        return data.remove(index);
    }
    
    public Peminjaman getPeminjaman (int index){
        return data.get(index);
    }
    
    public List<Peminjaman> getAllPeminjaman(){
        return data;
    }
}
