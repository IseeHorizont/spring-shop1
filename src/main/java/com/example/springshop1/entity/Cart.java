package com.example.springshop1.entity;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.*;

@Entity
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class Cart {
    @Id
    private UUID id;

    @ManyToOne
    private User user;

    @Type(type = "jsonb")
    private Set<Product> products;

    @ManyToOne
    private Order order;

    public UUID getId() {
        return id;
    }

    public Cart setId(UUID id) {
        this.id = id;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Cart setUser(User user) {
        this.user = user;
        return this;
    }

    public Set<Product> getProductList() {
        return products;
    }

    public Cart setProductList(Set<Product> productList) {
        this.products = productList;
        return this;
    }

    public Cart addToProductList(Set<Product> product) {
        if(this.products == null) {
            this.products = new HashSet<>();
        }

        this.products.addAll(product);

        return this;
    }

    public Order getOrder() {
        return order;
    }

    public Cart setOrder(Order order) {
        this.order = order;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return Objects.equals(id, cart.id) && Objects.equals(user, cart.user) && Objects.equals(products, cart.products) && Objects.equals(order, cart.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, products, order);
    }
}
