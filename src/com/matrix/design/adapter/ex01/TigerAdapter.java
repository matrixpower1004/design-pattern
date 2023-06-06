package com.matrix.design.adapter.ex01;

/**
 * author         : Jason Lee
 * date           : 2023-06-06
 * description    :
 */
public class TigerAdapter extends Animal {

    private OuterTiger outerTiger;

    public TigerAdapter(OuterTiger outerTiger) {
        this.outerTiger = outerTiger;
    }

    @Override
    public String getName() {
        return outerTiger.getFullName();
    }
}
