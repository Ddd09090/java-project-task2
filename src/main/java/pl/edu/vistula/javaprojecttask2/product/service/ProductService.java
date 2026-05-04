package pl.edu.vistula.javaprojecttask2.product.service;
import org.springframework.stereotype.Service;
import pl.edu.vistula.javaprojecttask2.product.domain.Product;
import pl.edu.vistula.javaprojecttask2.product.api.request.ProductRequest;
import pl.edu.vistula.javaprojecttask2.product.api.response.ProductResponse;
import pl.edu.vistula.javaprojecttask2.product.repository.ProductRepository;
import pl.edu.vistula.javaprojecttask2.product.support.ProductMapper;
@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }
    public ProductResponse create(ProductRequest productRequest){
        Product product = productRepository.save(productMapper.toProduct(productRequest));
        return productMapper.toProductResponse(product);
    }
}

