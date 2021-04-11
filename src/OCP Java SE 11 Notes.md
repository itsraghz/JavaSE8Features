# OCP Java SE 11 Notes

## `instanceof`

 * A check on `instanceof` on a Class level happens at compile time
   whereas on an Interface is deferred until runtime, because of the
   fact/hope that there could be a subclass / class implementing this
   Interface later.
 > The compilation check only applies when instanceof is called on a class. When checking whether an object is an instanceof an interface, Java waits until runtime to do the
   check. The reason is that a subclass could implement that interface and the compiler
   wouldn’t know it.

## `equals()` method

 * A check on `equals(null)` should return `false` and 
    it should not throw any `NullPointerException`.
 * API - `java.lang.String` class overrides the `equals()` method
    whereas the `java.lang.StringBuffer` class does not override it 
   meaningfully, instead it just invokes the `equals()` method of the 
   `java.lang.Object` class - that just checks the 
   `reference equals, ==`.