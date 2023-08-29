### Part 4.0 - Create `Teacher` Interface
* Create a `Teacher` interface.
	* `Teacher` should declare a `teach` method signature:
		* Method name: `teach`
		* Method parameters:
			* `Learner learner`
			* `double numberOfHours`
		* Method return-type: `void` 

	* `Teacher` should declare a `lecture` method signature:
		* Method name: `lecture`
		* Method parameters:
			* `Learner[] learners`
			* `double numberOfHours`
		* Method return-type: `void`

		

### Part 5.1 - Create `Instructor` Class
* Create an `Instructor` class such that:
	* `Instructor` is a subclass of `Person`
	* `Instructor` implements the `Teacher` interface
	* `Instructor` should have a concrete implementation of the `teach` method which invokes the `learn` method on the specified `Learner` object.
	* `Instructor` should have a concrete implementation of the `lecture` method which invokes the `learn` method on each of the elements in the specified array of `Learner` objects.
		* `numberOfHours` should be evenly split amongst the learners.
			* `double numberOfHoursPerLearner = numberOfHours / learners.length;`


<video width="device-width" height="480" style="border:1px solid green" controls>
  <source type="video/mp4" src="./tutorials/3.1_tutorial.mp4">
</video>


### Part 5.0 - Test `Instructor`
* Create a `TestInstructor` class.
	* Create a `testImplementation` method that asserts that an `Instructor` is an `instanceof` a `Teacher`.
	* Create a `testInheritance` method that asserts that a `Instructor` is an `instanceof` a `Person`.
	* Create a `testTeach` method that ensures when an `Instructor` invokes the `teach` method, a respective student's `totalStudyTime` instance variable is incremented by the specified `numberOfHours`.
	* Create a `testLecture` method that ensures when an `Instructor` invokes the `lecture` method, a respective array of students' `totalStudyTime` instance variables is incremented by `numberOfHours/students.length`.




<video width="device-width" height="480" style="border:1px solid green" controls>
  <source type="video/mp4" src="./tutorials/3.2_tutorial.mp4">
</video>