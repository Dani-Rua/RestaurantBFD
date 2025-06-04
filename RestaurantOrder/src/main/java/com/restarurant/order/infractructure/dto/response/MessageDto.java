package com.restarurant.order.infractructure.dto.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageDto implements Serializable {

   @JsonProperty("ingrediente_id")
   private String ingrediente_id;
   @JsonProperty("cantidad")
   private int cantidad;
}
