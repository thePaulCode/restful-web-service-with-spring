package dev.thepaulcode.restfulservice.model;

// Define a record class named Greeting
public record Greeting(long id, String content) {
    // This record class represents a simple data structure for a Greeting.
    // It includes a unique 'id' and a 'content' (message) associated with it.
    // The 'record' keyword in Java simplifies the creation of data classes by
    // automatically generating constructors, accessors, equals, hashCode, and toString methods.
}
