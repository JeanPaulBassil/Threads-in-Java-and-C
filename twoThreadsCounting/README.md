### Explanation of Java Multi-Threading by Extending the `Thread` Class (Loop Example)

#### Overview
The provided code demonstrates the creation and execution of two separate threads in Java by extending the `Thread` class. This is an example of multi-threading, where two threads (`FirstThread` and `SecondThread`) are executing concurrently.

#### `FirstThread.java` & `SecondThread.java`
- **Class Definitions**: Both `FirstThread` and `SecondThread` are custom classes extending Java's built-in `Thread` class.
- **Method Override**: Each class overrides the `run()` method, which contains the code executed by the thread.
- **Thread Behavior**: 
  - Each thread prints a sequence of numbers (0 to 9) with a message indicating which thread is executing.
  - Between each iteration, the thread pauses for 1000 milliseconds (1 second) using `Thread.sleep(1000)`.
  - An `InterruptedException` is caught and handled, printing a message if the thread is interrupted during sleep.

#### `Main.java`
- **Thread Instantiation and Execution**:
  - **Instantiation**: Instances of `FirstThread` and `SecondThread` are created.
  - **Starting Threads**: Both threads are started using the `start()` method, which triggers their `run()` methods in parallel.
- **Concurrency**: The output demonstrates that the two threads are running concurrently. The messages from both threads are interleaved, showing that they operate independently but simultaneously.

#### Output Analysis
- **Interleaved Execution**: The output from `java Main` shows the messages from both threads appearing in an interleaved fashion. This is a characteristic of concurrent execution in multi-threading.
- **Sequential Per Thread**: Each thread maintains its own sequence of numbers, demonstrating that each thread's internal state is independent.
- **Sleep Effect**: The one-second pause between iterations in each thread is evident in the output, as messages from different threads alternate.

#### Conclusion
This example is a clear demonstration of basic multi-threading in Java. By extending the `Thread` class and overriding the `run()` method, it's possible to define separate behaviors for different threads. The use of `Thread.sleep()` shows how to pause thread execution, and the handling of `InterruptedException` illustrates basic thread interruption handling. This pattern is useful in scenarios where parallel execution of distinct tasks is required.