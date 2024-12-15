package ait.cohort49.shop_g49.model.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

// данный класс является сущностью
@Entity
// определяет таблицу в базе данных
@Table(name = "product")
public class Product {
//    указывает, что поле является первичным ключом
    @Id
//    связывает поля класса с соответст колонкой в БД
    @Column (name = "id")
//    эта аннотация указывает, что id будет генериться БД
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name ="title")
    private String title;
    @Column (name = "price")
    private BigDecimal price;
    @Column (name = "aktive")
    private boolean active;

    @Override
    public String toString() {
        return String.format("Product: id - %d, title - %s, price- %s, active - %s",
                id, title, price, active ? "yes" : "no");
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return active == product.active && Objects.equals(id, product.id) && Objects.equals(title, product.title) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, price, active);
    }
}

