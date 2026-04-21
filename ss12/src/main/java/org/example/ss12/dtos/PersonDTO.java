package org.example.ss12.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PersonDTO {
    @NotBlank(message = "Tên không được để trống")
    private String fullName;
    @NotNull(message = "Tuổi không được để trống")
    @Min(value = 18, message = "Chưa đủ tuổi vị thành niên")
    private Integer age;
}
