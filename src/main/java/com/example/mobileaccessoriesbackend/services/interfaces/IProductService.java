package com.example.mobileaccessoriesbackend.services.interfaces;


import com.example.mobileaccessoriesbackend.dto.request.ProductRequest;
import com.example.mobileaccessoriesbackend.dto.response.ProductResponse;
import com.example.mobileaccessoriesbackend.entity.Product;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IProductService {


    List<ProductResponse> getAllProducts();

    ProductResponse addProduct(ProductRequest productRequest);

    Product findProductById(Long id);

    ProductResponse updateProductDetails(ProductRequest productDetails);

    Boolean deleteProduct(Long id);

    String uploadFile(MultipartFile file);

    byte[] saveFile(String imgUrl);

    List<ProductResponse> search(String keyword);
}
