
import com.mycompany.controllerimpl.ProductoCtrlImpl;
import com.mycompany.dao.ProductoDAO;
import com.mycompany.model.Producto;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author windows 10
 */
public class Test_producto {

    static ArrayList<Producto> list = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
          
       ProductoDAO prodao;
        prodao = new ProductoCtrlImpl();
       
        Producto pro=new Producto();
       
        pro.setId_categoria("1");
        pro.setId_unimed("2");
        pro.setNombre("leche");
        pro.setDescripcion("deslactosada");
        pro.setCodigo("0001");
       if(prodao.createProducto(pro)){
           System.out.println("insertado");
       }else{
           System.out.println("error al momento de insertar");
       }
    }  
        
        
    }
    

