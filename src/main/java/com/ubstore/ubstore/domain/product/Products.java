package com.ubstore.ubstore.domain.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;

    private String imgUrl;

    @NonNull
    private String title;

    @NonNull
    private int price;

    @NonNull
    @Column(length = 2000)
    private String content;

    @NonNull
    private int count;

    @NonNull
    private boolean sellStatus;

    @NonNull
    private Date createdDate;

    private Date modifiedDate;
}
