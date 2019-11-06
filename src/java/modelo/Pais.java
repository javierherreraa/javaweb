/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author Sebastian :3
 */
public class Pais  extends Exception{
    
    ArrayList<Traduccion> paises = new ArrayList();
    
    Traduccion angola= new Traduccion("Angola","Luanda","angoleño/a","Kwanza","portugues",10.07);
    Traduccion senagal = new Traduccion("Senagal","Dakal","Senegales/sa","Franco Occidental","Frances",5.56);
    Traduccion  ghana = new Traduccion("Ghana","Accra","Ghanes/a","Cedi","Ingles",630.9);
    Traduccion kenia= new Traduccion();
    Traduccion mali = new Traduccion();
    
    public void cargarPais(){
        //datos kenia
        kenia.setNombre("Kenia");
        kenia.setCapital("Nairobi");
        kenia.setGentil("Keniano/na");
        kenia.setNombreMoneda("Chelin Keniano");
        kenia.setIdioma("Ingles");
        kenia.setPrecMomeda(32.19);
        
        
        //datos mali
        mali.setNombre("Mali");
        mali.setCapital("Banako");
        mali.setGentil("Maliano/na");
        mali.setNombreMoneda("Franco Occidental");
        mali.setIdioma("Frances");
        mali.setPrecMomeda(5.56);
        
    }
    
    public void cargarArray(){
        paises.add(angola);
        paises.add(senagal);
        paises.add(ghana);
        paises.add(kenia);
        paises.add(mali);
    
}
       public void llenarText(){
        try
        {
            FileWriter Archivo = new FileWriter("input.txt");
            PrintWriter pw = new PrintWriter(Archivo);
            
        Iterator it = paises.iterator();
        while (it.hasNext()) {
            Traduccion pais = (Traduccion)it.next();
            pw.println("pais :" + pais.getNombre());
            pw.println("capital :" + pais.getCapital());
            pw.println("gentilicio :" + pais.getGentil());
            pw.println("idioma :" + pais.getIdioma());
            pw.println("nombre de la moneda :" +pais.getNombreMoneda());
            pw.println("precio de la moneda :" + pais.getPrecMomeda());
            
        }
        
                
            pw.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public String buscarNombre(String nombre){
        String a= "";
        Iterator it = paises.iterator();
        while (it.hasNext()) {
            Traduccion pais = (Traduccion)it.next();
            if (nombre.equalsIgnoreCase(pais.getNombre())){
                a=pais.getNombre();
            }
        }
        return a;
    }
    public String buscarCapital(String nombre){
        String a= "";
        Iterator it = paises.iterator();
        while (it.hasNext()) {
            Traduccion pais = (Traduccion)it.next();
            if (nombre.equalsIgnoreCase(pais.getNombre())){
                a=pais.getCapital();
            }
        }
        return a;
    }
    public String buscarIdioma(String nombre){
        String a= "";
        Iterator it = paises.iterator();
        while (it.hasNext()) {
           Traduccion  pais = (Traduccion)it.next();
            if (nombre.equalsIgnoreCase(pais.getNombre())){
                a=pais.getIdioma();
            }
        }
        return a;
    }
    public String buscarGentilico(String nombre){
        String a= "";
        Iterator it = paises.iterator();
        while (it.hasNext()) {
            Traduccion pais = (Traduccion)it.next();
            if (nombre.equalsIgnoreCase(pais.getNombre())){
                a=pais.getGentil();
            }
        }
        return a;
    }
    
    public String buscarMoneda(String nombre){
        String a= "";
        Iterator it = paises.iterator();
        while (it.hasNext()) {
            Traduccion pais = (Traduccion)it.next();
            if (nombre.equalsIgnoreCase(pais.getNombre())){
                a=pais.getNombreMoneda();
            }
        }
        return a;
    }
    
    DecimalFormat o = new DecimalFormat("#.00");
    
    
    public String calcularMoneda(String nombre ,double cantidad){
        double a=0;
        Iterator it = paises.iterator();
        while (it.hasNext()) {
            Traduccion pais = (Traduccion)it.next();
            if (nombre.equalsIgnoreCase(pais.getNombre())){
                a=angola.convertidor(pais.getPrecMomeda(), cantidad);
            }
        }
        return (""+o.format(a));
    }
   public  String traductor(String idioma, String palabra){
      String a="  ";
      Iterator it = paises.iterator();
       while (it.hasNext()) {           
           Traduccion pais = (Traduccion)it.next();
           if (idioma.equalsIgnoreCase(pais.getIdioma())){
               a=angola.traductor(palabra);
           }
       }
       return a;
   }
    

    
   

}
