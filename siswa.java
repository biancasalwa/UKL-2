
package ukl_perpus;

import java.util.ArrayList;
public class siswa implements mainData { //tujuan implement untuk menuliskan/mendefinisikan kembali method dengan nama dan isi yang sama 
    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Boolean> statuses = new ArrayList<Boolean>();
    public siswa() {
        namaSiswa.add("fatih");
        alamat.add("Malang");
        telepon.add("085855008901");
        statuses.add(true);
        namaSiswa.add("angel");
        alamat.add("Malang");
        telepon.add("085855008902");
        statuses.add(true);
        namaSiswa.add("dino");
        alamat.add("Malang");
        telepon.add("085855008902");
        statuses.add(true);
    }
    @Override
    public void setNama(String nama) {
        this.namaSiswa.add(nama);
    }
    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }
    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }
    public void setStatus(Boolean status, int index) {
        this.statuses.set(index, status);
    }
    @Override
    public String getNama(int id) {
        return this.namaSiswa.get(id);
    }
    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }
    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
    public boolean getStatus(int id) {
        return statuses.get(id);
    }
}
    

