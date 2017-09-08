package entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

/**
 *
 * @author Maksymilian
 */
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne 
    private Customer customer; 

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    @OneToMany(mappedBy = "order")
    private List<OrderLine> orderLines = new ArrayList<>();

    public void addOrderLine(OrderLine orderLine) {
        orderLines.add(orderLine);
        
    } 
    
    public List<OrderLine> getOrderLines() {
        return orderLines;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
    

