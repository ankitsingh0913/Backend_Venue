package com.XCLONE.Backend_Venue.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@NoArgsConstructor
public class ProductDTO {

    @NotEmpty(message = "The name is required")
    private String name;

    @NotEmpty(message = "The brand is required")
    private String brand;

    @NotEmpty(message = "The category is required")
    private String category;

    @Min(value = 0, message = "The price must be at least 0")
    private double price;

    @Size(min = 10, message = "The description should be at least 10 characters")
    @Size(max = 200, message = "The description cannot exceed 200 characters")
    private String description;

    @JsonIgnore
    private MultipartFile imageFile;
}
