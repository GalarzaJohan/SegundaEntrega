/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author arqtoshi
 */
public class Usuario {
  private int Codigo;
    private String Nombres;
    private String Contraseña;

    public Usuario() {
    }

    public Usuario(int Codigo, String Nombres, String Contraseña) {
        this.Codigo = Codigo;
        this.Nombres = Nombres;
        this.Contraseña = Contraseña;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
  
}
