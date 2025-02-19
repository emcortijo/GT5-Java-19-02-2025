package com.example.GestionProductos.Service;

import java.util.HashMap;
import java.util.Map;

import com.example.GestionProductos.model.Producto;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
    private Map<Integer, Producto> productos = new HashMap<>();

    public Map<Integer, Producto> getProductos(){
        return productos;
    }

    public void agregarProducto(Producto producto){
        productos.put(producto.getID(), producto);
    }

    public Producto getProductoPorId(int id){
        return productos.get(id);
    }

    public void eliminarProducto(int id){
        Producto p = productos.get(id);
        if(p != null){
            productos.remove(p);
        }
    }

    public void modificarProducto(int id, Producto pActualizado){
        if(id != pActualizado.getID()){
            productos.remove(id);
        }
        productos.put(pActualizado.getID(), pActualizado);
    }
}
