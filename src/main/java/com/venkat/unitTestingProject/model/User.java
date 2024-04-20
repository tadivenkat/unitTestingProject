package com.venkat.unitTestingProject.model;

import org.immutables.value.Value;

@Value.Immutable
public interface User {
    String firstName();
    String lastName();
    String country();
}
