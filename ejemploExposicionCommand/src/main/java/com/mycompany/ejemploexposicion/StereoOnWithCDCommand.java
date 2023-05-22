/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploexposicion;

/**
 *
 * @author marte
 */
public class StereoOnWithCDCommand implements Command{
    
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    
    public void execute(){
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
}
