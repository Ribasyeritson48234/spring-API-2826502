package org.productos.spring.java.productos2826502.services;

import java.util.List;

import org.productos.spring.java.productos2826502.entities.Product;
import org.productos.spring.java.productos2826502.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    //inyectar la depedencia 
    //al repoository 
    private ProductRepository repository
        = new ProductRepository();

        //operaciones de logica de negocio
        //casos de uso, historia de usuario
        //requerimientos funcionales
        public List<Product> findAllProducts(){
            return repository.findAll();
        }

}
