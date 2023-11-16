### Explanation of Java Thread Creation by Implementing `Runnable` Interface

#### Overview
The provided code snippets demonstrate an alternative method of creating a thread in Java by implementing the `Runnable` interface. This method involves creating a class (`MyThread`) that implements the `Runnable` interface and then using an instance of this class to create a `Thread` object in the `Main` class.

#### `MyThread.java`
- **Interface Implementation**: `MyThread` is a custom class that implements the `Runnable` interface.
- **Method Implementation**: It implements the `run()` method from the `Runnable` interface. The `run()` method contains the code that will execute when the thread starts.
- **Thread Behavior**: Inside the `run()` method, a message "Thread is running..." is printed. This indicates the action the thread will perform.

#### `Main.java`
- **Thread Instantiation and Execution**:
  - **Instantiation**: 
    - An instance of `MyThread` is created (`t1`).
    - A `Thread` object (`thread`) is then created by passing `t1` as a parameter to the `Thread` constructor. This step associates the `Runnable` implementation (`MyThread`) with the `Thread` object.
  - **Starting the Thread**: The `start()` method is called on `thread`. This method starts the execution of the thread which in turn calls the `run()` method of `MyThread`.

#### Advantages of Using `Runnable` Interface
- **Separation of Task and Thread**: The `Runnable` interface allows the separation of the task (defined in `run()`) from the thread management (handled by `Thread` class). This separation enhances the design and makes the code more flexible.
- **Multiple Inheritance**: Since Java doesn't support multiple inheritance in classes, using the `Runnable` interface allows a class to extend another class while still being able to implement multithreading by implementing `Runnable`.
- **Resource Sharing**: It's easier to share resources between multiple threads when using `Runnable`, as different threads can operate on the same instance.

#### Conclusion
This approach to thread creation in Java is particularly useful in scenarios where you want to separate the thread's task from the thread's lifecycle management. Implementing `Runnable` provides more flexibility in thread management and allows for more sophisticated concurrency designs. This pattern is commonly used in Java applications where multiple threads need to share the same resources or when the class is already extending another class.