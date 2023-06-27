package com.matrix.design.iterator;

/**
 * author         : Jason Lee
 * date           : 2023-06-27
 * description    :
 */
public class ArrayIterator implements Iterator {

    private Array array;

    // 배열에서 현재 반활할 수 있는 데이터 항목에 대한 인덱스 값을 위한 필드가 필요하다.
    private int index;

    public ArrayIterator(Array array) {
        // 생성자에서 참조할 Aggregator 객체를 받아와서 필드에 설정하고,
        this.array = array;
        // 현재 가리키는 구성 데이터의 인덱스를 -1로 지정한다.
        this.index = -1;
    }

    @Override
    public boolean next() {
        // 인덱스 값을 1 증가시키고 이 인덱스 값이 배열의 인덱스 값으로 유효한지 여부를 반환한다.
        index++;
        return index < array.getCount();
    }

    @Override
    public Object current() {
        // Aggreagator 객체의 getItem() 메서드를 통해서 현재 인덱스 값에 해당하는 구성 데이터 객체를 반환한다.
        return array.getItem(index);
    }
}
