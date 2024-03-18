package com.parasoft.interfaces2;

public interface ICalculator {
    default int minus(int a, int b) {
        return a - b;
    }
}
