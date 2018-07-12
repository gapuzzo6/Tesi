/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.text.PDFTextStripper;

/**
 *
 * @author giuseppeapuzzo
 */
public class Estrazione {
    public static void main(String[] args) throws IOException {
        PDDocument doc = null;
        File f = new File("out.pdf");
        FileWriter w = new FileWriter("prova.txt");
        BufferedWriter b = new BufferedWriter(w);
        b.write("ciaoerr\n");
        b.flush();
        String x = null;
        try{
            doc = PDDocument.load(f);
            PDFTextStripper stripper = new PDFTextStripper();
            stripper.setStartPage(0);
            stripper.setEndPage(0);
            x = stripper.getText(doc);
        } catch (IOException e) {   
            e.printStackTrace();    
        }
        System.out.println("letto:"+ x);
        
        
    }
    
}
