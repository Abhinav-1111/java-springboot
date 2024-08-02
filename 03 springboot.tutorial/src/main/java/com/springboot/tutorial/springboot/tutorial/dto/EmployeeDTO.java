package com.springboot.tutorial.springboot.tutorial.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.springboot.tutorial.springboot.tutorial.annotations.EmployeeRoleValidation;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    private Long id;
    @NotBlank(message = "name of the employee cannot be blank")
    @Size(min = 3, max = 10, message = "number of character of the name should be in the range of 3 to 10")
    private String name;

    @NotBlank(message = "Email of employee can not be blank")
    @Email(message = "Email should be a valid email")
    private String email;

    @NotNull(message = "Age of employee can not be null")
    @Max(value = 80, message = "age of employee should be more than 80")
    @Min(value = 18, message = "age of employee should be less than 18")
    private Integer age;

    @NotBlank(message = "Role of employee can not be blank")
//    @Pattern(regexp = "^(USER|ADMIN)$", message = "role of Employees can either be USER or ADMIN")
    @EmployeeRoleValidation
    private String role; // USER, ADMIN

    @NotNull(message = "Employee salary should be not null]")
    @Positive(message = "Employee salary should be positive]")
    @Digits(integer = 6, fraction = 2, message = "the salary can be in the XXXXX.YY")
    @DecimalMax(value = "9999.99")
    @DecimalMin(value = "999.99")
    private Double salary;

    @PastOrPresent(message = "dateOfJoining  field of employee be int he future")
    private LocalDate dateOfJoining;

    @AssertTrue(message = "isActive has to be true")
    @JsonProperty("isActive")
    private Boolean isActive;

}