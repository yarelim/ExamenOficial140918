/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.model.Detalle_venta;

import java.util.ArrayList;

/**
 *
 * @author windows 10
 */
public interface Detalle_ventaDAO {
    
    public boolean createDetalle_venta(Detalle_venta dv);
    public ArrayList<Detalle_ventaDAO> readDetalle_venta();
    public boolean updateDetalle_venta(Detalle_venta dv);
    public boolean deleteDetale_venta(String id);
    
}
