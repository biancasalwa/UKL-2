package ukl_perpus;

import java.util.ArrayList;
public class petugas implements mainData {
    
     public petugas() {
        this.nama.add("cici");
        this.alamat.add("jakarta");
        this.telepon.add("085888901234");
        this.nama.add("cici");
        this.alamat.add("jakarta");
        this.telepon.add("085888901234");
    }
     
      private ArrayList<String> nama = new ArrayList<String>();
      private ArrayList<String> alamat = new ArrayList<String>();
      private ArrayList<String> telepon = new ArrayList<String>();
      
    @Override
    public void setNama(String nama) {
        this.nama.add(nama);
    }
    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }
    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }
    @Override
    public String getNama(int id) {
        return nama.get(id);
    }
    @Override
    public String getAlamat(int id) {
        return alamat.get(id);
    }
    @Override
    public String getTelepon(int id) {
        return telepon.get(id);
    }

    
}
