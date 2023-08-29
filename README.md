# Leon's Lengthy Learner Lab
* **Objective**
	* to implement a `Classroom` class which _mediates_ a _composite_ `Students` and `Instructors` _singleton_ reference.
* **Purpose**
	* to demonstrate the use of:
		* [interfaces](https://stackoverflow.com/questions/1321122/what-is-an-interface-in-java)
		* [abstract classes](https://stackoverflow.com/questions/1320745/abstract-class-in-java)
		* [concrete classes](https://stackoverflow.com/questions/43224901/what-is-the-concrete-class-in-java)
		* [enums](https://stackoverflow.com/questions/4709175/what-are-enums-and-why-are-they-useful)
		* [generics](https://stackoverflow.com/questions/7815528/what-are-generics-in-java/7815579)
* **Description**
	* To implement a system which abides by the UML displayed below. * Click [here](./README.md) to view the most up-to-date README.md

<img src="./docs/complete-uml2.png">


### Part 1.0, 1.1 - Create `Person` Class
* Click [here](./docs/README-person.md) to view instructions on how to create and test `Person` class.

<hr><hr>


### Part 2.0, 3.0, 3.1 - Create `Student` class
* Click [here](./docs/README-student.md) to view instructions on how to create and test `Student` class.

### Part 4.0, 5.0, 5.1 - Create `Instructor` class
* Click [here](./docs/README-instructor.md) to view instructions on how to create and test `Instructor` class.



### Part 6.0, 6.1 - Create `People` class
* Click [here](./docs/README-people.md) to view instructions on how to create and test `People` class.



### Part 7.0, Part 7.1 - Create `Students` singleton
* Click [here](./docs/README-students.md) to view instructions on how to create and test `Students` class.




### Part 8.0 - Create and Test `Instructors` singleton
* Click [here](./docs/README-instructors.md) to view instructions on how to create and test `Instructors` class.



### Part 9.0, 9.1 - Create `Classroom` Class
* Click [here](./docs/README-classroom.md) to view instructions on how to create and test `Classroom` class.










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


### Part 10.0 - Test refactored classes.
* Ensure that the `TestStudents`, `TestInstructors`, `TestPeople`, `TestClassroom` classes were not affected by the refactor.







# Notice the Design Flaw - Non-Intuitive Orientation
* You may have noticed that `findById` makes it difficult to intuitively identify _which_ `Person` object is being returned. To remedy this issue, we can make use of an `enum` which manipulates a composite `instructor` object.


### Part 11.1 - Create `Educator` enum
* Create an enum named `Educator`.
	* The enum should implement `Teacher`.
	* The enum should have an enumeration for each of the instructors represented in the `Instructors` class.
	* Upon construction each enumeration of the enum should instantiate a respective `Instructor` and assign it to a final `instructor` field upon construction. The `instructor` should be added to the `Instructors` singleton.
	* Calls to the `teach` and `lecture` method should be deferred to the composite `instructor` reference.
	* The enum should have a `double timeWorked` field which keeps track of the hours that the `Educator` has taught.


### Part 11.0 - Test `Educator`
* Use `Part 5` as a reference.



### Part 12.0 - Test `Classroom`
* Ensure the `hostLecture` method can handle objects of type `Educator`.
