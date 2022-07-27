package ukl_perpus;


public interface mainData { 
    public void setNama(String nama);
    public void setAlamat(String alamat);
    public void setTelepon(String telepon);
    public abstract String getNama(int id);
    public abstract String getAlamat(int id);
    public abstract String getTelepon(int id);
    
}
