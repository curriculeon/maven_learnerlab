
### Part 6.1 - Create `People` class
* Create a `People` class.
	* The class should instantiate a `List` field of `Person` objects named `personList`.
	* The class should define a method named `add` which adds a `Person` to the `personList`.
	* The class should define a method named `findById` which makes use of a `long id` parameter to return a `Person` object with the respective `id` field.
	* The class should define a named `contains` which makes use of a `Person person` parameter to return `true` if the `personList` contains the respective `Person` object.
	* The class should define a method named `remove` which makes use of a `Person person` parameter to remove a respective `Person` object.
	* The class should define a method named `remove` which makes use of a `long id` parameter to remove a `Person` object with the respective `id` field.
	* The class should define a named `removeAll` which clears our `personList` field.
	* The class should define a method named `count` which returns the size of `personList`.
	* The class should define a method named `toArray` which returns an array representation of the `personList` field.
	* The class should implement `Iterable<E>` and define a method named `iterator` which makes use of the `personList` field to generate a new a `Iterator<E>`.

<video width="device-width" height="480" style="border:1px solid green" controls>
  <source type="video/mp4" src="./docs/tutorial/4.1_tutorial.mp4">
</video>

### Part 6.0 - Test `People`
* Create a `TestPeople` class.
	* Create a `testAdd` method which ensures that our `personList` in our `People` class populated with respective `Person` objects following invokation of the `add` method.
	* Create a `testRemove` method which ensures that the `personList` in a `People` object is **depopulated** with a respective `Person` object following the invokation of the `remove` method.
	* Create a `testFindById` method which ensures that a respective `Person` object with a respective `id` field is returned upon invokation of the `findById` method on a respective `People` object.


<video width="device-width" height="480" style="border:1px solid green" controls>
  <source type="video/mp4" src="./docs/tutorial/4.2_tutorial.mp4">
</video>