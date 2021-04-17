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
   
## Enum

 * Enum/Enumeration is a Java type that is used to accommodate a list of well known, static values. 
 * Semicolon is optional if the enum has only the list of values.
 * An Enum is a type and hence it can't be compared with an integer, though
   each enum value has an inbuilt property called `ordinal` that gives an
   incremental set of values.
 * Enum values are case sensitive
 * Enum CANNOT be extended by another enum, unlike Interfaces or Classes.
 * Enum provides an inbuilt method called `values()` that returns an array of 
   all the values in that Enum type, that can be used as yet another array.
 * Enums can have more than just values, they can accommodate `field`s, 
   `method`s and `constructor`s. 
 * An enum can also have an `abstract method`, where each of the enum values are
   expected to provide an implementation of that abstract method. 
 * We can also provide a default implementation of a method, which only a specific
   enum types can override for a purpose, whereas the rest can use this default version.
   
> Recommendation: Try to keep your enum as simple as possible, to keep it easy to read. 
> It is best when it is only handful of lines.

## Nested Class

 * Nested class is a class defined within another class. 
 * A class that is *NOT* static is an `inner` class.
 * Benefits of using a nested classes are :
     * They encapsulate helper classes by restricting them to the containing class.
     * They make it easy to create a class that will be used in only one place.
     * They can make the code easier to read, when used properly.
 * There are four types of nested classes in Java.
    
    | Type | Description |
    | ---- | ----------- |
    | Member Inner Class | A class defined at the same level of an instance variable. It is referred to as an inner class without explicitly stating the type. | 
    | Static Nested Class | A class defined at the same level of a static variable. It should be referred to as an inner class by explicitly saying the type. |
    | Local Inner Classs | A class defined within a method. |
    | Anonymous Inner Class | A class defined within a method but does not have a name. |

### Member Inner Class

 * Declared at the member level of the class (the same level as methods, instance variables and constructors)
 * Can have any modifier - `private`, `public`, `protected` or `default` access
 * Can `extend` any class or `implement` any interface
 * Can be `abstract` or `final`   
 * Can NOT declare `static` fields or methods   
 * Can access members of the outer class including the `private` members

### Local Inner Class

* Declared / Defined within a method
* Do _NOT_ have any modifier or access specifier - `private`, `public`, `protected` or `default` access
* Can _NOT_ `extend` any class or `implement` any interface
* Can _NOT_ be `abstract` or `final`
* Can NOT declare `static` fields or methods
* Can get access to all the fields and methods of the enclosing class
* Can get access to the local variables of the method provided they are final, or `effectively final`
    * Up until Java 7, the local variables were accessible to a local inner class ONLY if they were declared final.
    * Since Java 8, the term `effectively final` was introduced - to mean that the
      code could compile as if the variable can have the `final` added -
      meaning the variable has only one assignment and not more to consider it as effectively final

> If the local variable is final,  Java can handle it by passing it to the constructor
> of the inner class or by storing it in the class file.
> If it weren’t effectively final, these tricks wouldn’t work because the value could change
after the copy was made.

### Anonymous Inner Class

* A class declared inside a method but *without* a name.
* 

### Static Inner Class

## Constructor Definition Rules

1. The first statement of every constructor is a call to another constructor within the class
   using this(), or a call to a constructor in the direct parent class using super().
2. The super() call may not be used after the first statement of the constructor.
3. If no super() call is declared in a constructor, Java will insert a no-argument super()
   as the first statement of the constructor.
4. If the parent doesn’t have a no-argument constructor, and the child doesn’t define any
   constructors, the compiler will throw an error and try to insert a default no-argument
   constructor into the child class.
5. If the parent doesn’t have a no-argument constructor, the compiler requires an explicit
   call to a parent constructor in each child constructor
   
## Overriding Rules

1. The method in the child class must have the same signature as the method in the parent
   class.
2. The method in the child class must be at least as accessible or more accessible than the
   method in the parent class.
3. The method in the child class may not throw a checked exception that is new or
   broader than the class of any exception thrown in the parent class method.
4. If the method returns a value, it must be the same, or a subclass of the method in the
   parent class, known as covariant return types.
   
## Redefining Private methods

* A `public`, `protected` methods in a parent class method would demand the 
  set of rules for Overriding, if it were to be overridden by a child class.
* A `private` method on the other hand, does not demand any such rule, as it
  is not even visible to the child class. This is different as Java allows the
  Child class to *redefine* the private method as its own, fresh copy of the
  Child class, without any relation to the version of Parent class. Hence, no
  overriding rules apply to the private methods.

## Hiding Static Methods

> The first 4 rules are same as for Method overriding (for non-static methods)

1. The method in the child class must have the same signature as the method in the parent
   class.
2. The method in the child class must be at least as accessible or more accessible than the
   method in the parent class.
3. The method in the child class may not throw a checked exception that is new or
   broader than the class of any exception thrown in the parent class method.
4. If the method returns a value, it must be the same, or a subclass of the method in the
   parent class, known as covariant return types.
5. The method defined in the child class must be marked as static if it is marked as
   static in the parent class (method hiding). Likewise, the method must not be marked
   as static in the child class if it is not marked as static in the parent class (method
   overriding).
   
## String Vs StringBuilder

* StringBuilder doesn't override the `equals()` method, because it is a `Builder` object,
  and it is deemed to be a `work in progress` object at anytime and hence it does not
  make sense to compare the contents out of it. 
  > If at all needed, we can use the `.toString()`
  on the StringBuilder object and use the resultant String on the `equals()` method.
  
  > The rules for `StringBuilder` holds good for `StringBuffer` class as well.
  
* StringBuilder also does not override the `hashCode()` method and moreover the
  native JVM implementation returns two different hashcode values for two different
  StringBuilder instances despite they share the same content (equality). 
  > Reason being, if these StringBuilder objects are used as a Key in any `hash` 
  > structures like `HashTable`, or `HashMap` and the value being pointed to by 
  > the StringBuilder object reference might vary over time, the keys will lose
  > its sanity in the Hash Data Structure.