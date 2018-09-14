/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.controllerimpl.ProductoCtrlImpl;
import com.mycompany.dao.ProductoDAO;
import com.mycompany.model.Producto;
import java.util.ArrayList;

/**
 *
 * @author windows 10
 */
public class ProductoCtrl {
    
    private Producto selected;
    private boolean est;
    ProductoDAO prodao;
    private ArrayList<Producto> list = new ArrayList<>();
    
    public ProductoCtrl() {
        this.selected = new Producto();
        this.prodao = new ProductoCtrlImpl();
    }
    
    public void createProducto(){
        if(prodao.createProducto(selected)){
            System.out.println("insertado");
        }else{
            System.out.println("error al momento de insertar");
        }
    }
    
    
    public ArrayList<Producto> getList(){
    //cldao = new ProductoCtrlImpl();
    list = prodao.readProducto();
    return list;
            
    }

    public Producto getSelected() {
        return selected;
    }

    public void setSelected(Producto selected) {
        this.selected = selected;
    }
    
    
    
}
