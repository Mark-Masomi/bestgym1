package com.company;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class gymkaos {

    public gymkaos() {

        String filePath = "src/com/company/customers.txt";
        String outFilePathString = "src/com/company/gymutfil.txt";

        List <kund> kundlist = trimming
                .readDataFromFile(filePath);

        List <kund> onlyvalidmembers = betalandemedlemmar
                .getallvalidmems(kundlist);

        trimming.writeDataToFile(outFilePathString,
                onlyvalidmembers);

    }


}
