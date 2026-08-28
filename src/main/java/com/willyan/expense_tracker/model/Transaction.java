package com.willyan.expense_tracker.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "tb_transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    
    private BigDecimal amount;
    
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}