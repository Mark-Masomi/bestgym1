package com.company;

import java.time.LocalDate;
import java.util.List;

import static com.company.kund.*;

public class PT_login_file {
    public PT_login_file(String name) {
        List<kund> database=trimming
                .readDataFromFile(filePath);
        LocalDate todays_date=LocalDate.now();
        boolean isvalid=false;
        for (kund ö:database) {
            if (name.equalsIgnoreCase(ö.getName().trim())||name.equalsIgnoreCase(ö.getPersonNum())){
                if (ö.getBet_av_årsavgift().isAfter(valid_date)){
                    System.out.println("välkommern " + ö.getName());

                }

            }
        }
    }
}
