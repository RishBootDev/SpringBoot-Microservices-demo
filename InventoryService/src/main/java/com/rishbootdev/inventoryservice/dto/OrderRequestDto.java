package com.rishbootdev.inventoryservice.dto;


import lombok.Data;

import java.util.List;

@Data
public class OrderRequestDto {

    private List<OrderRequestItemDto> items;
}
