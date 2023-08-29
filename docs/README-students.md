<video width="device-width" height="480" style="border:1px solid green" controls>
  <source type="video/mp4" src="./docs/tutorial/5.1_tutorial.mp4">
</video>


<video width="device-width" height="480" style="border:1px solid green" controls>
  <source type="video/mp4" src="./docs/tutorial/5.2_tutorial.mp4">
</video>

### Part 7.1 - Create `Students` singleton
* **Note:** The creation of this class will demonstrate an implementation of [singleton design pattern](https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples#eager-initialization).
* Create a `Students` class.
	* The class should be an _unextendable_ subclass of the `People` class.
	* The class should _statically instantiate_ a `final` field named `INSTANCE` of type `Students`.
	* The class should define a _private nullary constructor_ which populates the `INSTANCE` field with respective `Student` representations of your colleagues.
		* Each student should have a _relatively_ unique `id` field.
	* The class should define a `getInstance` method which returns the `INSTANCE` field.
	
	

### Part 7.0 - Test `Students` singleton
* Create a `TestStudents` class.
	* Create a `test` method which ensures that each of the students in your current cohort are in your `Students` singleton.



<video width="device-width" height="480" style="border:1px solid green" controls>
  <source type="video/mp4" src="./docs/tutorial/6_tutorial.mp4">
</video>
