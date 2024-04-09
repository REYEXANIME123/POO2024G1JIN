package pe.edu.upeu.poo.enumerators;

enum GENERO{
     Femenino, Masculino
}
enum ESTADO_CIVIL{Soltero, Casado, Divorciado, Viudo}

public class Persona {
    String nombre;
    String dni;
    String genero;
    String estadoc;
    
    public static void main(String[] args){
        Persona p=new Persona();
        System.out.println("Genero:"+p.genero);
        for(ESTADO_CIVIL ec:ESTADO_CIVIL.values()){
            System.out.println("EC:"+ec);}
    }
    
}
