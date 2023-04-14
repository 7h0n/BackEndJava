package com.ejemplo.SpringBoot.model;

 import lombok.Getter;
 import lombok.Setter;

@Getter @Setter
public class Persona{
    
    private Long id;
    private String nombre;
    private String apellido;
    
    public Persona(){
        }
    public Persona(Long id, String nombre, String apellido){
            
    this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
 }
}