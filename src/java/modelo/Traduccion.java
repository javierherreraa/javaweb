/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 * 
 * @author Sebastian :3
 */
public class Traduccion  extends Africa implements iTraduc {
    public Traduccion(){
        
    }
    public Traduccion(String nombre,String capital,String gentil,String nombreMoneda,String idioma, double precMoneda){
        this.setNombre(nombre);
        this.setCapital(capital);
        this.setGentil(gentil);
        this.setNombreMoneda(nombreMoneda);
        this.setIdioma(idioma);
        
    }
       public String traductor(String palabra) {
        String traduccion = "nose encontro la palabra";
        try {
            
        switch(palabra){
            case "hola":
                if ("ingles".equalsIgnoreCase(getIdioma())){
                    traduccion = "hello"; 
                } else {
                    if ("portugues".equalsIgnoreCase(getIdioma())) {
                        traduccion="ola";
                    } else {
                        if ("frace".equalsIgnoreCase(getIdioma())){
                            traduccion="salut";
                        }
                    }
                }
            return traduccion;
            case "buenas":
                if ("ingles".equalsIgnoreCase(getIdioma())){
                    traduccion = "good"; 
                } else {
                    if ("portugues".equalsIgnoreCase(getIdioma())) {
                        traduccion="bom";
                    } else {
                        if ("frace".equalsIgnoreCase(getIdioma())){
                            traduccion="bon";
                        }
                    }
                }
            return  traduccion;
            case "foto":
                if ("ingles".equalsIgnoreCase(getIdioma())){
                    traduccion = "photo"; 
                } else {
                    if ("portugues".equalsIgnoreCase(getIdioma())) {
                        traduccion="imagen";
                    } else {
                        if ("frace".equalsIgnoreCase(getIdioma())){
                            traduccion="photo";
                        }
                    }
                }
            return  traduccion;
            case "computadora":
                if ("ingles".equalsIgnoreCase(getIdioma())){
                    traduccion = "compute"; 
                } else {
                    if ("portugues".equalsIgnoreCase(getIdioma())) {
                        traduccion="computador";
                    } else {
                        if ("frace".equalsIgnoreCase(getIdioma())){
                            traduccion="ordinateur";
                        }
                    }
                }
            return traduccion;
            case "lapiz":
                if ("ingles".equalsIgnoreCase(getIdioma())){
                    traduccion = "pencil"; 
                } else {
                    if ("portugues".equalsIgnoreCase(getIdioma())) {
                        traduccion="lapis";
                    } else {
                        if ("frace".equalsIgnoreCase(getIdioma())){
                            traduccion="crayon";
                        }
                    }
                }
            return traduccion;
        }
        
        
        } catch (NumberFormatException  e) {
            
            System.out.println("se deve ingresar un nuero."+e.getMessage());
        }
        return traduccion;
    }

    @Override
    public double convertidor(double precioMoneda, double cantidad) {
        double valor=0;
        try {
            valor = cantidad / precioMoneda;
               
        } catch (Exception e) {
            System.out.println("se deve ingresar un nuero."+e.getMessage());
        }
        return valor; 
    }
    
    
    

}
