package first;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class main {



    public static void main(String[] args) {

        TeslaCompany company = new TeslaCompany();

        company.addTesla(new tesla(7,5,"red",2999));
        company.addTesla(new tesla(7,5,"blue",6700));
        company.addTesla(new tesla(7,5,"orange",3030));
        company.addTesla(new tesla(7,5,"pink",3080));


        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(9);
        list.add(3);
        list.add(4);


        Collections.sort(company.getTeslas());

        for (tesla tesla : company.getTeslas()) {
            System.out.println(tesla);
        }

    }
}
