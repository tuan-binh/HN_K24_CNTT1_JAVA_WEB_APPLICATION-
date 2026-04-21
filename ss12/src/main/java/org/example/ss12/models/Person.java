package org.example.ss12.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// Lombok
// Constructors Không tham số
@NoArgsConstructor
// Constructor đầy đủ tham số
@AllArgsConstructor
@Data // Gồm cả getter và setter ...
@Builder // Đây là khởi tạo đối tượng giống Stream API
public class Person {
    private Long id;
    private String fullName;
    private Integer age;
}
