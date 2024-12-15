package ait.cohort49.shop_g49.controller;

import ait.cohort49.shop_g49.model.entity.Product;
import ait.cohort49.shop_g49.service.interfaces.ProductService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;


// /api/login-для бекенда
// /login - для фронт енда
@RestController
@RequestMapping("/products")
public class ProductController  {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    //    POST -> /products
//    @RequestBody означает, что надо прочитать тело запроса, в котором будет json,
//    json както сконвертировать и поместить java обьект в product
    @PostMapping
    public Product saveProduct (@RequestBody Product product){
//         обращаеся к сервису для сохранения продукта
        return productService.saveProduct(product);
    }



//    получение ресурса
//    @GetMapping
////    GET -> /products?id=3
////   @RequestParam извлекает  этот параметр с названием id из запроса (3)
////    и помещает в переменную Long id
//    public Product getById(@RequestParam Long id){

////        обращаемся к сервису и запрашиваем продукт по id
//        return null;
//    }
@GetMapping("/{productId}")
    public Product getById(@PathVariable("productId") Long id){
//         обращаемся к сервису и запрашиваем продукт по id
        return productService.getProductById(id);

    }


//    GET -> /products
@GetMapping
    public List<Product> getAll(){
//         обращаемся к сервису, получаем все продукты
        return productService.getAllActiveProducts();

    }

// update: PUT -> /products
    @PutMapping("/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product product){
//         к сервису для обновления продукта
        return productService.updateProduct(id, product);

    }

    // Delete: DELETE -> /products/id
    @DeleteMapping("/{id}")
    public Product remove(@PathVariable Long id) {
        // сервис -> удаление продукта
        return productService.deleteProduct(id);
    }
@DeleteMapping("/by-title")
    public Product deleteProductByTitle(@RequestParam String title) {
        return productService.deleteProductByTitle(title);
    }

@PutMapping("/restore/{id}")
    public Product restoreProductById(@PathVariable Long id) {
        return productService.restoreProductById(id);
    }

@GetMapping("/count")
    public long getProductsCount() {
        return productService.getProductsCount();
    }

@GetMapping("/total-price")
    public BigDecimal getTotalPrice() {
        return productService.getTotalPrice();
    }

@GetMapping("/average-price")
    public BigDecimal getAveragePrice() {
        return productService.getAveragePrice();
    }


}
