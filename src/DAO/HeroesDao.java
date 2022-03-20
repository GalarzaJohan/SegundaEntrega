/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import Modelo.Heroes;
import javafx.collections.ObservableList;

/**
 *
 * @author arqtoshi
 */
public interface HeroesDao {
    public int create(Heroes heroes);
    public int update(Heroes heroes);
    public int delete(int codigo);
    public ObservableList<Heroes> readAll();
    public Heroes  read(int codigo);

}
