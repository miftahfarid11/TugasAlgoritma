package NIMgui;

public class Mahasiswa {
    private String nama;
    private String NIM;
    private String TempatLahir;
    private String TanggalLahir;
    private String Jenjang;
    private String TahunMasuk;
    private String Fakultas;
    private String Jurusan;
    private String JenisKelamin;
    private String NomorUrut;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String NIM, String tempatLahir, String tanggalLahir, String jenjang, String tahunMasuk, String fakultas, String jurusan, String jenisKelamin, String nomorUrut) {
        this.nama = nama;
        this.NIM = NIM;
        TempatLahir = tempatLahir;
        TanggalLahir = tanggalLahir;
        Jenjang = jenjang;
        TahunMasuk = tahunMasuk;
        Fakultas = fakultas;
        Jurusan = jurusan;
        JenisKelamin = jenisKelamin;
        NomorUrut = nomorUrut;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getTempatLahir() {
        return TempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        TempatLahir = tempatLahir;
    }

    public String getTanggalLahir() {
        return TanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        TanggalLahir = tanggalLahir;
    }

    public String getJenjang() {
        return Jenjang;
    }

    public void setJenjang(String jenjang) {
        Jenjang = jenjang;
    }

    public String getTahunMasuk() {
        return TahunMasuk;
    }

    public void setTahunMasuk(String tahunMasuk) {
        TahunMasuk = tahunMasuk;
    }

    public String getFakultas() {
        return Fakultas;
    }

    public void setFakultas(String fakultas) {
        Fakultas = fakultas;
    }

    public String getJurusan() {
        return Jurusan;
    }

    public void setJurusan(String jurusan) {
        Jurusan = jurusan;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        JenisKelamin = jenisKelamin;
    }

    public String getNomorUrut() {
        return NomorUrut;
    }

    public void setNomorUrut(String nomorUrut) {
        NomorUrut = nomorUrut;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' +
                ", NIM='" + NIM + '\'' +
                ", TempatLahir='" + TempatLahir + '\'' +
                ", TanggalLahir='" + TanggalLahir + '\'' +
                ", Jenjang='" + Jenjang + '\'' +
                ", TahunMasuk='" + TahunMasuk + '\'' +
                ", Fakultas='" + Fakultas + '\'' +
                ", Jurusan='" + Jurusan + '\'' +
                ", JenisKelamin='" + JenisKelamin + '\'' +
                ", NomorUrut='" + NomorUrut + '\'' +
                '}';
    }
}
