


### Part 2.0 - Create `Learner` Interface
* Create a `Learner` interface.
	* `Learner` should declare method signature:
		* Method name: `learn`
		* Method parameters: `double numberOfHours`
		* Method return-type: `void`
	* `Learner` should declare method signature:
		* Method name: `getTotalStudyTime`
		* Method return-type: `Double`


### Part 3.1 - Create `Student` Class
* Create a `Student` class such that:
	* `Student` is a subclass of `Person`
	* `Student` implements the `Learner` interface
	* `Student` should have an instance variable `totalStudyTime` of type `double`
	* `Student` should have a concrete implementation of the `learn` method which increments the `totalStudyTime` variable by the specified `numberOfHours` argument.
	* `Student` should have a `getTotalStudyTime()` method which returns the `totalStudyTime` instance variable.

<video width="device-width" height="480" style="border:1px solid green" controls>
  <source type="video/mp4" src="./tutorials/3.1_tutorial.mp4">
</video>


### Part 3.0 - Test `Student`
* Create a `TestStudent` class.
	* Create a `testImplementation` method that asserts that a `Student` is an `instanceof` a `Learner`.
	* Create a `testInheritance` method that asserts that a `Student` is an `instanceof` a `Person`.
	* Create a `testLearn` method that ensures a `Student`'s `totalStudyTime` instance variable is incremented by the specified `numberOfHours` by invoking the `.learn` method.


<video width="device-width" height="480" style="border:1px solid green" controls>
  <source type="video/mp4" src="./tutorials/3.2_tutorial.mp4">
</video>