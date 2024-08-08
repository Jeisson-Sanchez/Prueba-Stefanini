package com.jeisson.Model.DTO;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@ToString
@Builder
public class InventarioDTO {
    private Integer idInventario;
    private Integer Estado;
}
