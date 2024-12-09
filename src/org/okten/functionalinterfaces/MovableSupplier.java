package org.okten.functionalinterfaces;

import org.okten.Movable;

public interface MovableSupplier<T extends Movable> {

    T get();
}
