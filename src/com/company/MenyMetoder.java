package com.company;

import java.time.LocalDate;
import java.util.List;

import static com.company.kund.inloggning_PT;

public class MenyMetoder {
    public boolean giltigtmedlemskap(kund kund){
        if(kund.getBet_av_årsavgift().isAfter(LocalDate.now().minusYears(1))){
            System.out.println("hej " +kund.getName()+ " välkommen tillbaka!");
            in_och_utfil.writeDataToFile(inloggning_PT,kund);
            return true;
        }
        System.out.println("hej kundens medlemskap har gått ut");
        return  false;

    }
    public kund finns_i_listan_ (String kund_namn_persnr, List<kund> customer_list){
        for (kund kund:customer_list) {
            if (kund.getPersonNum().equalsIgnoreCase(kund_namn_persnr.trim())
                    ||kund.getName().equalsIgnoreCase(kund_namn_persnr.trim())){
                return kund;
            }
        }

        return null;
    }
}
