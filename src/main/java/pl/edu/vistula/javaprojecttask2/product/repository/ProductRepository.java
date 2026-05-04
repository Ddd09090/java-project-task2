package pl.edu.vistula.javaprojecttask2.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.vistula.javaprojecttask2.product.api.response.ProductResponse;
import pl.edu.vistula.javaprojecttask2.product.domain.Product;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{}