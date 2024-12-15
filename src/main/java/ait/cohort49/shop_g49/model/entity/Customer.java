
//Написать интерфейс CustomerService (берём методы из презентации).
//Реализовать CustomerController (используем все методы сервиса).
//Корзину пока нигде не учитываем.
//*** Реализовать класс ProductServiceImpl (при необходимости добавив репозиторий на любой из изученных технологий).

//Сохранить покупателя в базе данных (при сохранении покупатель автоматически считается активным)
//➢ Вернуть всех покупателей из базы данных (активных)
//➢ Вернуть одного покупателя из базы данных по его идентификатору (если он активен)
//➢ Изменить одного покупателя в базе данных по его идентификатору
//➢ Удалить покупателя из базы данных по его идентификатору
//➢ Удалить покупателя из базы данных по его имени
//➢ Восстановить удалённого покупателя в базе данных по его идентификатору
//➢ Вернуть общее количество покупателей в базе данных (активных)
//➢ Вернуть стоимость корзины покупателя по его идентификатору (если он активен)
//➢ Вернуть среднюю стоимость продукта в корзине покупателя по его идентификатору (если он
//активен)
//➢ Добавить товар в корзину покупателя по их идентификаторам (если оба активны)
//➢ Удалить товар из корзины покупателя по их идентификаторам
//➢ Полностью очистить корзину покупателя по его идентификатору (если он активен)
//
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
