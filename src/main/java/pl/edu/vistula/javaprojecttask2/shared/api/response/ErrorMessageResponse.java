package pl.edu.vistula.javaprojecttask2.shared.api.response;

import pl.edu.vistula.javaprojecttask2.product.api.request.UpdateProductRequest;
import pl.edu.vistula.javaprojecttask2.product.api.response.ProductResponse;
import pl.edu.vistula.javaprojecttask2.product.domain.Product;
import pl.edu.vistula.javaprojecttask2.product.support.ProductExceptionSupplier;
import pl.edu.vistula.javaprojecttask2.product.support.ProductMapper;

public class ErrorMessageResponse {
    private final String message;

    public ErrorMessageResponse(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

}
