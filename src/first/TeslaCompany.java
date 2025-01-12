package first;

import java.util.ArrayList;

public class TeslaCompany {
    private ArrayList<tesla> teslas = new ArrayList<>();

    public TeslaCompany(ArrayList<tesla> teslas) {
        this.teslas = teslas;
    }
    public TeslaCompany() {
        this.teslas = new ArrayList<>();
    }


    public ArrayList<tesla> getTeslas() {
        return teslas;
    }

    public void setTeslas(ArrayList<tesla> teslas) {
        this.teslas = teslas;
    }

    public void addTesla(tesla tesla) {
        teslas.add(tesla);
    }

    @Override
    public String toString() {

        return "TeslaCompany{" +
                "teslas=" + teslas +
                '}';
    }
}
