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
public class Africa extends Exception implements iTraduc{

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nombreMoneda
     */
    public String getNombreMoneda() {
        return nombreMoneda;
    }

    /**
     * @param nombreMoneda the nombreMoneda to set
     */
    public void setNombreMoneda(String nombreMoneda) {
        this.nombreMoneda = nombreMoneda;
    }

    /**
     * @return the capital
     */
    public String getCapital() {
        return capital;
    }

    /**
     * @param capital the capital to set
     */
    public void setCapital(String capital) {
        this.capital = capital;
    }

    /**
     * @return the gentil
     */
    public String getGentil() {
        return gentil;
    }

    /**
     * @param gentil the gentil to set
     */
    public void setGentil(String gentil) {
        this.gentil = gentil;
    }

    /**
     * @return the idioma
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * @param idioma the idioma to set
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    /**
     * @return the precMomeda
     */
    public double getPrecMomeda() {
        return precMoneda;
    }

    /**
     * @param precMoneda
     */
    public void setPrecMomeda(double precMoneda) {
        this.precMoneda = precMoneda;
    }

    /**
     * @return the Palab
     */
    public String getPalab() {
        return Palab;
    }

    /**
     * @param Palab the Palab to set
     */
    public void setPalab(String Palab) {
        this.Palab = Palab;
    }
    private String nombre;
    private String nombreMoneda;
    private String capital;
    private String gentil;
    private String idioma;
    private double precMoneda;
    private String Palab;

    @Override
    public double convertidor(double precioMoneda, double cantidad) {
       return 0;
    }

    @Override
    public String traductor(String palabra) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
