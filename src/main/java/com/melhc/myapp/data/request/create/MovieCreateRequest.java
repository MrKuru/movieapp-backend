package com.melhc.myapp.data.request.create;


import com.melhc.myapp.data.entity.enums.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MovieCreateRequest {
    private String name;
    private String about;
    private String releaseDate;
    private Category category;
}
