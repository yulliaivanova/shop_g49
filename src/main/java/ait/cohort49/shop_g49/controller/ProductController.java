package ait.cohort49.shop_g49.controller;

import ait.cohort49.shop_g49.model.entity.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// /api/login-для бекенда
// /login - для фронт енда
@RestController
@RequestMapping("/products")
public class ProductController {

//    POST -> /products
//    @RequestBody означает, что надо прочитать тело запроса, в котором будет json,
//    json както сконвертировать и поместить java обьект в product
    @PostMapping
    public Product saveProduct (@RequestBody Product product){
//        TODO обращаеся к сервису для сохранения продукта
        return product;
    }

//    получение ресурса
//    @GetMapping
////    GET -> /products?id=3
////   @RequestParam извлекает  этот параметр с названием id из запроса (3)
////    и помещает в переменную Long id
//    public Product getById(@RequestParam Long id){
////        TODO обращаемся к сервису и запрашиваем продукт по id
//        return null;
//    }
@GetMapping("/{productId}")
    public Product getById(@PathVariable("productId") Long id){
//        TODO обращаемся к сервису и запрашиваем продукт по id
        return null;
    }


//    GET -> /products
@GetMapping
    public List<Product> getAll(){
//        TODO обращаемся к сервису, получаем все продукты
        return List.of();

    }

// update: PUT -> /products
    @PutMapping("/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product product){
//        TODO к сервису для обновления продукта
        return product;
    }

    // Delete: DELETE -> /products/id
    @DeleteMapping("/{id}")
    public Product remove(@PathVariable Long id) {
        // Todo сервис -> удаление продукта
        return null;
    }


}
