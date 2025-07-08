package com.jpmc.midascore.entity;

import javax.persistence.*;

@Entity
public class UserRecord {

    @Id
    @GeneratedValue()
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private float balance;

    protected UserRecord() {
    }

    public UserRecord(String name, float balance) {
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("User[id=%d, name='%s', balance='%f'", id, name, balance);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
---begin output ---
Balance {amount=0.0}
Balance {amount=1200.23}
Balance {amount=2215.37}
Balance {amount=2774.14}
Balance {amount=12.34}
Balance {amount=444.55}
Balance {amount=888.9}
Balance {amount=777.6}
Balance {amount=68.7}
Balance {amount=3476.21}
Balance {amount=2121.54}
Balance {amount=779421.3}
Balance {amount=0.0}
---end output ---