package controller;

import com.javatechie.sringsecurity.dto.Product;
import com.javatechie.sringsecurity.entity.UserInfo;
import com.javatechie.sringsecurity.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/welcome")
    public String welcome(){
        return "welcome this end point is not secure";
    }
    @PostMapping("/new")
    public String addNewUser(@RequestBody UserInfo userInfo){
        return productService.addUser(userInfo);
    }
    @GetMapping("/all")
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<Product> getAllTheProducts() {
        return productService.getProductList();
    }
    @GetMapping("/{id}")
    //@PreAuthorize("hasAuthority('ROLE_USER')")
    public Product getProductById(@PathVariable int id){
        return productService.getProductById(id);
    }

}
