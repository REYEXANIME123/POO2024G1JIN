/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.poo.encapinterface;

/**
 *
 * @author Datos
 */
public class Loro implements Animal {

    @Override
    public void emitirSonido() {
        System.out.println("Esto es implementación " + "...no te olvides!!");
        
    }

    @Override
    public void dormir() {
        System.out.println("Zzz...zzz");
        
    } 
    @Override
    public void habla(){
        System.out.println("Hola manito no seas flojo pues");
       
        
    }
    
}
