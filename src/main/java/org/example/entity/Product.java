package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //так показываем что является сущностью в базе данных
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id //указывает что боле является primary key
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    // указываем принцип генерации этого поля. Она работает в паре с аннотацией @Id.
   //strategy = GenerationType.SEQUENCE в аннотации @GeneratedValue указывает,
    // что для генерации значений первичного ключа сущности будет использоваться механизм последовательностей (sequences).
    private Long id;
    private Long name;
    private Long amount;
}
