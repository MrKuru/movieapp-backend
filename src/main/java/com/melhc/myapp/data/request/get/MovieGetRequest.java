package com.melhc.myapp.data.request.get;


import com.melhc.myapp.data.entity.enums.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MovieGetRequest {
    private String name;
    private Category category;
}
