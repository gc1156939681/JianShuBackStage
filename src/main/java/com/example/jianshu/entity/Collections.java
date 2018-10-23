package com.example.jianshu.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;

/**
 * Created by guocui on 2018/10/22.
 */
@Entity
@Data
@Builder
public class Collections {
    private Integer collectionId;

}
