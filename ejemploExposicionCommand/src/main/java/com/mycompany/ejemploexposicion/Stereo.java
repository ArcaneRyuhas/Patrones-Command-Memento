/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploexposicion;

/**
 *
 * @author marte
 */
public class Stereo {
    
    private String nameStereo;

    public Stereo(String nameStereo) {
        this.nameStereo = nameStereo;
    }
    
    
    
    public void on(){System.out.println("Estereo encendido");}
    public void off(){System.out.println("Estereo apagado");}
    public void setCd(){System.out.println("Se seteo el CD");}
    public void setDvd(){System.out.println("Se seteo el Dvd");}
    public void setRadio(){System.out.println("Se seteo la radio");}
    public void setVolume(int volume){System.out.println("Se seteo el volumen a " + volume);}

}
