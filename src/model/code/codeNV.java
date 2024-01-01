
package model.code;


public class codeNV {
    private String maNV, tenNV, diachiNV, vitri;

    public codeNV() {
    }

    public codeNV(String maNV, String tenNV, String diachiNV, String vitri) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.diachiNV = diachiNV;
        this.vitri = vitri;
    }

    public String getmaNV() {
        return maNV;
    }

    public void setmaNV(String maNV) {
        this.maNV = maNV;
    }

    public String gettenNV() {
        return tenNV;
    }

    public void settenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getdiachiNV() {
        return diachiNV;
    }

    public void setdiachiNV(String diachiNV) {
        this.diachiNV = diachiNV;
    }

    public String getvitri() {
        return vitri;
    }

    public void setvitri(String vitri) {
        this.vitri = vitri;
    }
    
    
}
