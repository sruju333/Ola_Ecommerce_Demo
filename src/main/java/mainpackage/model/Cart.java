package mainpackage.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.Id;

@Document("cart")
public class Cart {
    @Id
    private long id;
    private String productType;
    @Column(length = 30)
    private String productDescription;
    private Integer productQuantity;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductType() {
        return productType;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }


}
