package com.company;

import java.util.List;

interface CompositeBlock extends Block {
    List getBlocks();
    Block block = new Block() {
        @Override
        public String getcolor() {
            return "green";
        }

        @Override
        public String getMaterial() {
            return "steel";
        }

        @Override
        public String color() {
            return "green";
        }

        @Override
        public String material() {
            return "steel";
        }
    };
}
