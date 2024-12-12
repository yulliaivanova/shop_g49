package ait.cohort49.shop_g49.model.entity;

import java.util.Objects;

public class Customer {
    private Long id;
    private String name;
    private boolean active;

    @Override
    public String toString() {
        return String.format("Customer: id -%d, name - %s, active - %s",
                id, name, active ? "yes" : "no");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer customer)) return false;
        return active == customer.active && Objects.equals(id, customer.id) && Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, active);
    }
}
