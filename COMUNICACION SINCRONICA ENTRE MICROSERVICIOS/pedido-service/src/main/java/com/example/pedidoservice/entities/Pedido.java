package com.example.pedidoservice.entities;

import com.example.pedidoservice.model.ProductoDTO;

public record Pedido(String id, ProductoDTO producto, int cantidad) {
}
