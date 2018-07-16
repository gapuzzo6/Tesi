/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;



/**
 *
 * @author giuseppeapuzzo
 */
public class Estrazione {
    public static void main(String[] args) throws IOException {
      //Caricamento del file esistente
      PDDocument document;
      File file = new File("new.pdf");
      try{
        document = PDDocument.load(file);
        //instanziare lo stripper per estrapolare il testo
        PDFTextStripper pdfStripper = new PDFTextStripper();
        //prendere il testo dal pdf e passarlo in una stringa
        String text = pdfStripper.getText(document);
        //Stampa a video
        System.out.println(text);
        //Chiusura documento
        document.close();
        }catch(IOException e){
          
        }
    }
    
}
