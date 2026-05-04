package pl.edu.vistula.javaprojecttask2.product.support.exception;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(Long id){
        super(String.format("No product with id %d found", id));
    }
}
