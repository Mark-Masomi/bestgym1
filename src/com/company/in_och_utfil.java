package com.company;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class in_och_utfil {

    public static List<kund> readDataFromFile(String readFromFile){
        String firstLine;
        String secondLine;
        Path inFilePath;
        List<kund> kundList = new ArrayList<>();

        String[] personDataPartsFirstLine = new String[1];
        List<LocalDate> betdat=new ArrayList<>();
        inFilePath = Paths.get(readFromFile);

        try(Scanner fileScanner = new Scanner(inFilePath)){

            while(fileScanner.hasNext()){
                firstLine = fileScanner.nextLine();
                personDataPartsFirstLine = firstLine.split(",");
                if (fileScanner.hasNext()){
                    secondLine = fileScanner.nextLine();
                    betdat.add(LocalDate.parse(secondLine));


                }

                kund p = new kund(personDataPartsFirstLine[1].trim(),personDataPartsFirstLine[0].trim()
                        , betdat.get(betdat.size()-1));

                kundList.add(p);
            }
        }
        catch (IOException e){
            System.out.println("Fel inträffade vid läsning från fil");
            e.printStackTrace();
            System.exit(0);
        }

        return kundList;

    }

    public static void writeDataToFile(String writeToFile,kund kund){
        Path outFilePath = Paths.get(writeToFile);
        try(PrintWriter w = new PrintWriter(
                Files.newBufferedWriter(outFilePath, StandardOpenOption.APPEND))){

            w.print(kund.getName() +"  "+kund.getPersonNum()+"          "+LocalDate.now()+ "\n");
        }
        catch (FileNotFoundException e){
            System.out.println("Filen kunde inte hittas");
            e.printStackTrace();
            System.exit(0);
        }
        catch (IOException e){
            System.out.println("Det gick inte att skriva till fil");
            e.printStackTrace();
            System.exit(0);
        }
        catch (Exception e){
            System.out.println("Något gick fel");
            e.printStackTrace();
            System.exit(0);
        }
    }
}
