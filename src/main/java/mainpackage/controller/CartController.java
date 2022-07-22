package mainpackage.controller;

import mainpackage.model.Cart;
import mainpackage.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CartController {

    @Autowired
    CartRepository cartRepository;

    @PostMapping(value = "/additem", consumes = "application/json")
    public String saveItem(@RequestBody Cart cart){
        cartRepository.save(cart);
        return "Item added to cart successfully!";
    }

    @GetMapping(value = "/cart")
    public List<Cart> getAll(){
        return cartRepository.findAll();
    }

    @ResponseBody
    @GetMapping(value = "/cart/{id}")
    public Cart getItem(@PathVariable long id){
        Cart cartResponse = cartRepository.findById(id);
        return cartResponse;
    }
}
