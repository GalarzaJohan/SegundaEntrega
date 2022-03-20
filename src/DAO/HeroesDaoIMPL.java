/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexion.Conexion;
import Modelo.Heroes;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author arqtoshi
 */
public class HeroesDaoIMPL implements HeroesDao {

   @Override
    public int create(Heroes heroes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    
//                
//        INSERT INTO public.carrito(
//	id_carrito, cantidad, id_usuario, id_producto)
//	VALUES (?, ?, ?, ?);
    }

    @Override
    public int update(Heroes heroes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int codigo) {
            int filas = 0;
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            st = conn.createStatement();

            String sql = "delete heroes where idheroes = "+codigo;
            filas = st.executeUpdate(sql);
            

        } catch (SQLException ex) {
            Logger.getLogger(HeroesDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                
                if(st != null){
                    st.close();
                }
                if(rs != null){
                    rs.close();
                }

            } catch (SQLException ex) {
                Logger.getLogger(HeroesDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return filas;
    }

    @Override
    public ObservableList<Heroes> readAll() {
        ObservableList<Heroes> heroesList = FXCollections.observableArrayList();
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {   
            conn = Conexion.getConnection();
            st = conn.createStatement();
            String sql = "select * from heroes order by idheroes";
            rs = st.executeQuery(sql);
            while(rs.next()){
                Heroes heroes = new Heroes();
                heroes.setCodigo(rs.getInt("idheroes"));  
                heroes.setNombre(rs.getString("nombre"));
                heroes.setDescripcion(rs.getString("descripcion"));
                
               
                heroesList.add(heroes);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HeroesDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                
                if(rs != null){
                    rs.close();
                }
                
                if(st != null){
                    st.close();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(HeroesDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return heroesList;
    }

    @Override
    public Heroes read(int codigo) {
        

        Heroes heroes = null;
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            st = conn.createStatement();
            String sql = "select * from heroes where codigo ="+String.valueOf(codigo);
            rs = st.executeQuery(sql);
            if(rs.next()){
                
                heroes = new Heroes();
                heroes.setCodigo(rs.getInt("idheroes"));  
                heroes.setNombre(rs.getString("nombre"));
                heroes.setDescripcion(rs.getString("descripcion"));
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(HeroesDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                
                if(rs != null){
                    rs.close();
                }
                
                if(st != null){
                    st.close();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(HeroesDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return heroes;
    }
}
