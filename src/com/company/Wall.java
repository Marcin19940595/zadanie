package com.company;

import java.util.List;
import java.util.Optional;

public class Wall implements Structure{
    private List Block;

    public Wall() {
    }

    @Override
    public Optional findBlockByColor(String color) {
            return findBlockByColor(color);
    }

    @Override
    public List findBlockByMaterial(String material) {
        return findBlockByMaterial(material);
    }

    @Override
    public int count() {
        return 0;
    }
}

