package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Scanner;

import static com.company.kund.*;

public class login {
    MenyMetoder menyMetoder = new MenyMetoder();
    public  login() throws IOException {
        List<kund> customer_list=in_och_utfil
                .readDataFromFile(filePath);

        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv kundens namn eller personnummer!");
        String recception_input=scan.nextLine().trim();
        try {
            menyMetoder.giltigtmedlemskap(menyMetoder.finns_i_listan_(recception_input,customer_list));

        }  catch (NullPointerException e){
            System.out.println("personen finns inte i listan vänlingen registrera kund först");
        }



    }


}
