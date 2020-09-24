package zadatak2;
//Napraviti klasu za citanje excel tabele koja poseduje metodu koja kreira potreban tok podataka kojoj
//se prosledjuje putanja do fajla i metodu kojoj se prosledjuju dva cela broja (jedan za red, drugi za kolonu u tabeli).
//Koristeci istu klasu, pristupiti tabeli i citati podatke koji se nalaze u zadatom redu i koloni.
//
//Dodatak: Nadograditi klasu da omogucava i unos podataka u zadati red i kolonu.

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestPage {

    public static FileInputStream tokPodataka(String putanja) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(putanja);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fis;
    }


    public static void citanjePodataka(String putanja, int row, int cell) throws IOException {
        XSSFWorkbook wb = new XSSFWorkbook(tokPodataka(putanja));
        Sheet sheet = wb.getSheetAt(0);
        Row r = sheet.getRow(row);
        Cell c = r.getCell(cell);
        System.out.println(c.toString());

    }

    public static void unosPodataka(String putanja, String podatak, int row, int cell) throws IOException {
        XSSFWorkbook wb = new XSSFWorkbook(tokPodataka(putanja));
        Sheet sheet = wb.getSheetAt(0);
        Row r = sheet.createRow(row);
        Cell c = r.createCell(cell);
        c.setCellValue(podatak);

        FileOutputStream fos;
        try {
            fos = new FileOutputStream(putanja);
            wb.write(fos);
            //wb.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {


        citanjePodataka("Data.xlsx", 1, 0);
        unosPodataka("Data.xlsx", "Milan", 3, 0);
    }


}
