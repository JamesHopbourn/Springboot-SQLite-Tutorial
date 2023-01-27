package com.example.demo03.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import javax.persistence.*;

@Data
@Table
@Entity
public class User {
    @Id
    @TableId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id", nullable = false, columnDefinition = "integer(20)")
    private Long adminId;

    @Column(name = "user_name", nullable = false, columnDefinition = "text(20)")
    private String userName;
}