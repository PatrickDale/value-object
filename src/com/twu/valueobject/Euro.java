package com.twu.valueobject;

/**
 * Created by pdale on 8/20/15.
 */
public class Euro {
    private int value;

    public Euro(Integer value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o.getClass() == Dollar.class) {
            return o.equals(this);
        }
        if (getClass() != o.getClass()) return false;

        Euro euro = (Euro) o;

        return value == euro.value;
    }

    @Override
    public int hashCode() {
        return value;
    }

    public Euro add(Euro euro) {
        return new Euro(value + euro.value);
    }
}
