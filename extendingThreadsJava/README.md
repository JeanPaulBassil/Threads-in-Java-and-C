### Explanation of Java Thread Creation by Extending the `Thread` Class

#### Overview
The provided code snippets demonstrate the creation and execution of a thread in Java by extending the `Thread` class. This approach involves defining a new class (`MyThread`) that extends the `Thread` class and then creating an instance of this new class in the `Main` class to execute the thread.

#### `MyThread.java`
- **Class Definition**: `MyThread` is a custom class that extends the built-in `Thread` class in Java.
- **Method Override**: It overrides the `run()` method from the `Thread` class. The `run()` method contains the code that will execute when the thread starts.
- **Thread Behavior**: Inside the `run()` method, a message "My Thread is running!!" is printed. This indicates the action the thread will perform.

#### `Main.java`
- **Thread Instantiation and Execution**:
  - **Instantiation**: An instance of `MyThread` is created (`t1`).
  - **Starting the Thread**: 
    - The `start()` method is called on `t1`. This method is inherited from the `Thread` class and is responsible for starting the execution of the thread. It internally calls the `run()` method of `MyThread`.
    - Alternatively, calling `t1.run()` directly would not start a new thread but would execute the `run()` method in the main thread, which is not the typical use of threads.
  - **Output**: The main method also prints "Running Thread from main" to indicate that the main thread is running concurrently with the `MyThread` instance.

#### Conclusion
This example showcases a basic way to create and run a thread in Java. By extending the `Thread` class and overriding the `run()` method, users can define custom behavior for their threads. The `start()` method is crucial for launching a new thread, as opposed to `run()`, which simply executes the method in the current thread. This approach is straightforward and is commonly used in Java for simple threading requirements.