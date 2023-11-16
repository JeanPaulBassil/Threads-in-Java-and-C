### Java Multi-Threading with `Runnable` and `join()`

#### `Summation` Class (Summation.java)
- **Purpose**: Implements `Runnable` to calculate the sum of numbers up to a given upper limit.
- **Constructor**: Initializes `upper` with a specified value and `sum` to zero.
- **`run()` Method**: 
  - Prints "Thread Running".
  - Computes the sum of integers from 0 to `upper`.
  - Stores the result in `sum`.
  - Prints "Thread Completed".
- **`getSum()` Method**: Returns the computed sum.

#### `Main` Class (Main.java)
- **Thread Creation and Execution**:
  - Two `Summation` objects (`s1` and `s2`) are created with different upper limits.
  - Two threads (`t1` and `t2`) are created, each associated with one `Summation` object.
- **Sequential Execution using `join()`**:
  - `t1.start()` initiates the first thread.
  - `t1.join()` ensures the main thread waits until `t1` completes.
  - Similar steps are followed for `t2`.
- **Result Output**:
  - After each thread completes, the sum computed by each `Summation` object is printed.
  
#### Key Concepts
- **`Runnable` Interface**: Allows defining a task separately from the thread object.
- **`join()` Method**: Used to ensure that the main thread waits for the completion of child threads before proceeding.
- **Thread Safety**: The example shows basic thread execution but doesn't address thread safety concerns like synchronization.

#### Conclusion
This example demonstrates the use of the `Runnable` interface for defining tasks and the `Thread` class for executing these tasks in separate threads. The use of `join()` ensures orderly completion of threads. This pattern is useful for tasks that need to be executed in sequence or when the main thread requires the result of child threads before continuing.