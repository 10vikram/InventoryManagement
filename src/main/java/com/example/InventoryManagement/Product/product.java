package com.example.InventoryManagement.Product;

import javax.persistence.*;

@Entity
@Table
public class product {

    @Id
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private long id;
    private String name;
    private String time;

    public product() {
    }

    public product(String name, String time) {
        this.name = name;
        this.time = time;
    }

    public product(long id, String name, String time) {
        this.id = id;
        this.name = name;
        this.time = time;
    }

    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
