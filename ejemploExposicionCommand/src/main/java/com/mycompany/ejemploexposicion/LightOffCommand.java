/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploexposicion;

/**
 *
 * @author marte
 */
public class LightOffCommand implements Command{

    Light light;
    
    public LightOffCommand(Light light){
        this.light = light;
    }
    
    @Override
    public void execute() {
       light.off();
    }
    
}
