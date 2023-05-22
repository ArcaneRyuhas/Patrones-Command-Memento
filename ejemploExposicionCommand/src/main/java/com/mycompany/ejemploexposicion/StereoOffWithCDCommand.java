/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploexposicion;

/**
 *
 * @author marte
 */
public class StereoOffWithCDCommand implements Command {
    
    private Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    
    
    
    @Override
    public void execute() {
        stereo.off();
    }
    
}
