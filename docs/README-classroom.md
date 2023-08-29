### Part 9.1 - Create `Classroom` Class
* Create a `Classroom` singleton.
	* The class should declare a field that references the instance of `Students` called `students`.
	* The class should declare a field that references the instance of `Instructors` called `instructors`.
	* The class should define a method `hostLecture` which makes use of a `Teacher teacher, double numberOfHours` parameter to host a `lecture` to the composite `personList` field in the `students` reference.
	* The class should define a method `hostLecture` which makes use of a `long id, double numberOfHours` parameter to identify a respective `Instructor` to host a `lecture` to the composite `personList` field in the `cohort` reference.
	* The class should define a method `getStudyMap` which returns a <u>new instance</u> of a _mapping_ from `Student` objects to `Double` objects, representative of each respective student's `totalStudyTime`.

<video width="device-width" height="480" style="border:1px solid green" controls>
  <source type="video/mp4" src="./docs/tutorial/8.1_tutorial.mp4">
</video>

### Part 9.0 - Test `Classroom`
* Create a `Classroom` class.
	* Create a `testHostLecture` method which ensures that each of the `Student`'s `totalStudyTime` instance variable is incremented by the specified `numberOfHours` upon invoking the `hostLecture` method.

<video width="device-width" height="480" style="border:1px solid green" controls>
  <source type="video/mp4" src="./docs/tutorial/8.2_tutorial.mp4">
</video>

