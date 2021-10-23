package com.company;

import java.time.LocalDate;

public class kund {
    public final static String filePath = "src/com/company/customers.txt";
    public final static String inloggning_PT="src/com/company/loginfile.txt";
    public final static LocalDate valid_date=LocalDate.now().minusYears(1);
    private String name;
    private String personNum;
    private LocalDate bet_av_årsavgift;



    public String getName() {
        return name;
    }

    public String getPersonNum() {
        return personNum;
    }

    public LocalDate getBet_av_årsavgift() {
        return bet_av_årsavgift;
    }





    public kund(String name, String personNum, LocalDate bet_av_årsavgift) {
        this.name = name;
        this.personNum = personNum;
        this.bet_av_årsavgift = bet_av_årsavgift;
    }


    @Override
    public String toString() {
        return "kund{" +
                "name='" + name + '\'' +
                ", personNum='" + personNum + '\'' +
                ", bet_av_årsavgift=" + bet_av_årsavgift +
                '}';
    }
}
