# M1 Exception and Method Overriding Solution

You are need implement 2 and 3 cases:

* Case 1: If SuperClass does not declare an exception, then the SubClass can only declare unchecked exceptions, but not
  the checked exceptions.
* Case 2: If SuperClass declares an exception, then the SubClass can only declare the same or child exceptions of the
  exception declared by the SuperClass and any new Runtime Exceptions, just not any new checked exceptions at the same
  level or higher.
* Case 3: If SuperClass declares an exception, then the SubClass can declare without exception.

NOTE: case 2 should be throw ArithmeticException. Case 3 should be throw IOException