package org.productos.spring.java.productos2826502.controllers;

import java.util.List;

import org.productos.spring.java.productos2826502.entities.Product;
import org.productos.spring.java.productos2826502.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/products")
public class ProductController {
    //inyectar el servicio
    private ProductService service = new ProductService();


    //primer endpoint
    //endopoint : un metodo en un controlador 

    @GetMapping("/saludo")
    public String saludo(){
        return "Hola ... 2026502";
    }
    //segundo endpoint
    //Get:obtener infomacion sin alterarla
    // (inmutable)
    @GetMapping("/{idproducto}")
    public String findProductById(@PathVariable String idproducto) {
        return "aqui se mostrara el producto cuyo id es:" + idproducto;
    }
    @GetMapping
    public List<Product> findAllProducts() { 
        //utilizo el servivio 
        return service.findAllProducts();

    }
        
    }
    

