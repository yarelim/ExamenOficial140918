/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controllerimpl;

import com.mycompany.configbd.Conexionbd;
import com.mycompany.dao.ProductoDAO;
import com.mycompany.model.Producto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author windows 10
 */
public class ProductoCtrlImpl implements ProductoDAO{
    
    Conexionbd cx;
    String sql;
    ResultSet rs;
    ArrayList<Producto> listDatos;

    public ProductoCtrlImpl() {
        cx = new Conexionbd();
    }

   
    @Override
    public boolean createProducto(Producto pro) {
        sql="INSERT INTO public.producto( id_categoria, id_unimed, nombre, descripcion, codigo)" 
                + "VALUES('"+pro.getId_categoria()+"','"+pro.getId_unimed()+"','"+pro.getNombre()+"','"+pro.getDescripcion()+"','"+pro.getCodigo()+"')";
        
        
    return cx.executeInsertUpdate(sql);   
    }

    @Override
    public ArrayList<Producto> readProducto() {
        listDatos =new ArrayList<>();

        sql = "SELECT id_producto, id_categoria, id_unimed, nombre, descripcion, codigo"
                + "    FROM public.producto";
        rs = cx.executeQuery(sql);
        try {
            while (rs.next()) {
                listDatos.add(new Producto(rs.getString("id_producto"),rs.getString("id_categoria"),rs.getString("id_unimed"),rs.getString("nombre"),rs.getString("descripcion"),rs.getString("codigo")));    
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductoCtrlImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listDatos;
    }

    @Override
    public boolean updateProducto(Producto pro) {
         sql="UPDATE public.producto SET"
                +" nombre='"+pro.getId_producto()+"', descripcion='"+pro.getDescripcion()+"' "
                + " WHERE id_producto="+pro.getId_producto()+" ";      
    return false;    
    }

    @Override
    public boolean deleteProducto(String id) {
        sql="DELETE FROM public.producto"
                + "WHERE id_producto="+id+"";
    return cx.executeInsertUpdate(sql);    
    }

    public void createProducto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
