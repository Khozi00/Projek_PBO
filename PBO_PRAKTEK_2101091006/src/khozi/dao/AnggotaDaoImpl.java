/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khozi.DAO;
import khozi.model.Anggota;
import java.util.ArrayList;
import java.util.List;

public class AnggotaDaoImpl implements AnggotaDao{
    List<Anggota> data = new ArrayList<>();
    
    @Override
    public Anggota save(Anggota anggota){
        data.add(anggota);
        return anggota;
    }
    
    public Anggota update(int index, Anggota anggota){
        data.set(index, anggota);
        return anggota;
    }
    
    public Anggota delete(int index){
        return data.remove(index);
    }
    
    public Anggota getAnggota (int index){
        return data.get(index);
    }
    
    public List<Anggota> getAllAnggota(){
        return data;
    }
}
