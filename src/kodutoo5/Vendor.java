package kodutoo5;

public class Vendor {
    private String compName;
    private String address;
    private String repName;
    private int phoneNr;

    public Vendor(String compName, String address, String repName, int phoneNr) {
        this.compName = compName;
        this.address = address;
        this.repName = repName;
        this.phoneNr = phoneNr;
    }
    public Vendor() {

    }
    @Override
    public String toString() {
        return "Vendor{" +
                "compName='" + compName + '\'' +
                ", address='" + address + '\'' +
                ", repName='" + repName + '\'' +
                ", phoneNr=" + phoneNr +
                '}';
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRepName() {
        return repName;
    }

    public void setRepName(String repName) {
        this.repName = repName;
    }

    public int getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(int phoneNr) {
        this.phoneNr = phoneNr;
    }
}
