package com.example.entity;

import javax.persistence.*;

/**
 * @Author: yifeng G
 * @Date: Create in 15:28 2018/4/9 2018
 * @Description:
 * @Modified By:
 * @Vsersion:
 */
@Entity
@Table(name = "t_company")
public class Tcompany {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
