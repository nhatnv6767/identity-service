package com.devteria.identity_service.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
// xoa dong message = null
// nghia la field nao null thi khong chen vao Json
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {
    // vi du code = 1000 => thanh cong
    int code = 1000;
    String message;
    // kieu tra ve co the thay doi
    // phu thuoc vao tung api
    T result;


}
