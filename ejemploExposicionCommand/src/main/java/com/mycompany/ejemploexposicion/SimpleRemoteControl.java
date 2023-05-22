/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploexposicion;

/**
 *
 * @author marte
 */
public class SimpleRemoteControl {
    
    Command slot;
    
    public SimpleRemoteControl(){}
    
    public void setCommand(Command command){
        slot = command;
    }
    
    public void buttonWasPressed(){
        slot.execute();
    }
}
