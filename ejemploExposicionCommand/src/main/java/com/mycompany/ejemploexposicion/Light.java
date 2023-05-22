/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploexposicion;

/**
 *
 * @author marte
 */
public class Light {
   
    private Light light;
    private String nameLight;

    public Light(String nameLight) {
        this.nameLight = nameLight;
    }
    
    

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }
    
    public void on(){
        System.out.println("Light is on");  
    }
    
    public void off(){
        System.out.println("Light is off");
    }
}
