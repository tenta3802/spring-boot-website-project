package com.ubstore.ubstore.domain.user;

import com.ubstore.ubstore.domain.order.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    @NonNull
    private String password;

    @NonNull
    private String name;

    @NonNull
    private String email;

    @NonNull
    private String address;

    @NonNull
    private String phone;

    @NonNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDay;

    @OneToMany(mappedBy = "user")
    private List<Order> orderList = new ArrayList<>();
}