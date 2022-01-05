package com.company;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class betalandemedlemmar {
    public static List<kund> getallvalidmems(List<kund> allakunder){

        List<kund> onlyvalidmembers = new ArrayList<>();
        final LocalDate one_year_ago=LocalDate.now().minusYears(1);
        for (kund p : allakunder){
            if (p.getBet_av_årsavgift().isAfter(one_year_ago)){
                onlyvalidmembers.add(p);
            }
        }
        return onlyvalidmembers;
    }
}
