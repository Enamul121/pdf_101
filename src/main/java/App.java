package main.java;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.*;
import com.itextpdf.layout.property.TextAlignment;

import java.io.FileNotFoundException;

public class App {

    public static final String DEST = "hello.pdf";
    public static void main(String[] args) throws FileNotFoundException {

       // main.java.App
        PdfWriter writer = new PdfWriter(DEST);

        PdfDocument pdf = new PdfDocument(writer);

      pdf.addNewPage();

        Document document = new Document(pdf);
        String line = "Hello! Welcome to iTextPdf"+ " \n" +
                "Hello! Welcome to iTextPdf" + " \n" +
                "Hello! Welcome to iTextPdf";


        String para1 = "Tutorials Point originated from the idea that there exists \n" +
                "      a class of readers who respond better to online content and prefer to learn \n" +
                "      new skills at their own pace from the comforts of their drawing rooms.";

        String para2 = "The journey commenced with a single tutorial on HTML in 2006 \n" +
                "      and elated by the response it generated, we worked our way to adding fresh \n" +
                "      tutorials to our repository which now proudly flaunts a wealth of tutorials \n" +
                "      and allied articles on topics ranging from programming languages to web designing \n" +
                "      to academics and much more.";
        document.add(new Paragraph(line));

        document.add(new Paragraph(para1));
        document.add(new Paragraph(para2));
        List list = new List();

        // Add elements to the list
        list.add("Java");
        list.add("JavaFX");
        list.add("Apache Tika");
        list.add("OpenCV");
        list.add("WebGL");
        list.add("Coffee Script");
        list.add("Java RMI");
        list.add("Apache Pig");

        document.add(list);
          AreaBreak aB = new AreaBreak();
          document.add(aB);


          //   -------------------- TABLE -----------------------------------//

        float [] pointColumnWidths = {150F, 150F, 150F};
        Table table = new Table(pointColumnWidths);

        // Adding cells to the table
        table.addCell(new Cell().add("SL"));
        table.addCell(new Cell().add("Name"));
        table.addCell(new Cell().add("Designation"));
        table.addCell(new Cell().add("1001"));
        table.addCell(new Cell().add("Enamul Haque"));
        table.addCell(new Cell().add("Programmer"));

        table.addCell(new Cell().add("1002"));
        table.addCell(new Cell().add("Enamul Haque2"));
        table.addCell(new Cell().add("Programmer2"));

        document.add(table);

        // --------------------------------------------------------  ///
        document.add(aB);

        // ------------------------------------------------//
        // Formatting Cell Contents
        /***
         *
         *
         *   Formatting Cell Contents
         *
         *
         */

        // Creating a table
        float [] pointColumnWidths2 = {200F, 200F};
        Table table2 = new Table(pointColumnWidths2);

        // Populating row 1 and adding it to the table
        Cell c1 = new Cell();                        // Creating cell 1
        c1.add("Name");                              // Adding name to cell 1
        c1.setBackgroundColor(Color.DARK_GRAY);      // Setting background color
        c1.setBorder(Border.NO_BORDER);              // Setting border
        c1.setTextAlignment(TextAlignment.CENTER);   // Setting text alignment
        table2.addCell(c1);                           // Adding cell 1 to the table

        Cell c2 = new Cell();
        c2.add("Raju");
        c2.setBackgroundColor(Color.GRAY);
        c2.setBorder(Border.NO_BORDER);
        c2.setTextAlignment(TextAlignment.CENTER);
        table2.addCell(c2);

        // Populating row 2 and adding it to the table
        Cell c3 = new Cell();
        c3.add("Id");
        c3.setBackgroundColor(Color.WHITE);
        c3.setBorder(Border.NO_BORDER);
        c3.setTextAlignment(TextAlignment.CENTER);
        table2.addCell(c3);

        Cell c4 = new Cell();
        c4.add("001");
        c4.setBackgroundColor(Color.WHITE);
        c4.setBorder(Border.NO_BORDER);
        c4.setTextAlignment(TextAlignment.CENTER);
        table2.addCell(c4);

        // Populating row 3 and adding it to the table
        Cell c5 = new Cell();
        c5.add("Designation");
        c5.setBackgroundColor(Color.DARK_GRAY);
        c5.setBorder(Border.NO_BORDER);
        c5.setTextAlignment(TextAlignment.CENTER);
        table2.addCell(c5);

        Cell c6 = new Cell();
        c6.add("Programmer");
        c6.setBackgroundColor(Color.GRAY);
        c6.setBorder(Border.NO_BORDER);
        c6.setTextAlignment(TextAlignment.CENTER);
        table2.addCell(c6);

        // Adding Table to document
        document.add(table2);
       // -------------------------  END  Formatting Cell Contents ---------------------- //

        document.close();

        System.out.println("Awesome PDF just got created.");

    }

}
