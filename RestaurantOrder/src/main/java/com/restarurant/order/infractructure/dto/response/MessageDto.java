package com.restarurant.order.infractructure.dto.response;


import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageDto implements Serializable {

   private String ingrediente_id;
   private int cantidad;
}
