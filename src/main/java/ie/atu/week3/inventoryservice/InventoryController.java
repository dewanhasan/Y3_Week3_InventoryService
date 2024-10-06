package ie.atu.week3.inventoryservice;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {
    @PostMapping("/product")
    public String inventoryInfo(@RequestBody InventoryDetails inventoryDetails) {
        String inventoryMessage = String.format("Product id is %s, This product is located in Galway.   ", inventoryDetails.getId());

        return inventoryMessage;
    }
}
