

# Notice the Design Flaw - Odd Casting Issues
* You may have noticed that the `findById`, and `hostLecture` methods require an intermediate [casting trick](https://stackoverflow.com/questions/5289393/casting-variables-in-java).
* To remedy this issue, we can _generify_ the `People` class.


### Part 10.1 - Modify `People` class
* [Parameterize](https://stackoverflow.com/questions/12551674/what-is-meant-by-parameterized-type) the `People` signature to enforce that it is a container for objects of type `E` such that `E` is a subclass of `Person`.
* Modify the class signature to declare this class _abstract_.
	* An [abstract class](http://www.javacoffeebreak.com/faq/faq0084.html) cannot be instantiated; Its concrete implementation is deferred to its subclass.
* Modify `people` field to enforce that is a container of objects of type `E`.
* Modify the `add` method to ensure that it handles object of type `E`.
* Modify the `findById` method to ensure that it returns an object of type `E`.
* Modify the `getArray` method signature by declaring it `abstract` of return tyoe `E`.
	* An abstract method is a subclass's contractual agreement to the deferment of an implementation of a respective method.


### Part 10.2 - Modify `People` subclasses
* Modify the `Students` class signature to ensure that it is a subclass of `People` of parameterized type `Student`.
* Modify the `Instructors` class signature to ensure that it is a subclass of `People` of parameterized type `Instructor`.
* Provide concrete implementations of the `getArray` method in each of these classes.


### Part 10.3 - Refactor `Classroom` class
* Refactor the `hostLecture` method in the `Classroom` class by removing any intermediate _casting trick(s)_.

<video width="device-width" height="480" style="border:1px solid green" controls>
  <source type="video/mp4" src="./docs/tutorial/8.1_tutorial.mp4">
</video>



### Part 10.0 - Test refactored classes.
* Ensure that the `TestStudents`, `TestInstructors`, `TestPeople`, `TestClassroom` classes were not affected by the refactor.


<video width="device-width" height="480" style="border:1px solid green" controls>
  <source type="video/mp4" src="./docs/tutorial/9.2_tutorial.mp4">
</video>