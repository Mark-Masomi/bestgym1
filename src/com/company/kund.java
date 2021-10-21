package com.company;

import java.time.LocalDate;

public class kund {
    @Override
    public String toString() {
        return "kund{" +
                "name='" + name + '\'' +
                ", personNum='" + personNum + '\'' +
                ", bet_av_årsavgift=" + bet_av_årsavgift +
                '}';
    }

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
}
