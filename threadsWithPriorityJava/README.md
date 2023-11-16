### Java Sequential Thread Execution with `Runnable` and `join()`

#### `MyThread` Class (MyThread.java)
- **Implements**: `Runnable` for thread execution.
- **`run()` Method**: 
  - Prints the current thread's name and ID.
  - Displays the thread's priority and state.
  - Iterates and prints a counter specific to the thread.

#### `Main` Class (Main.java)
- **Thread Creation and Execution**:
  - Creates three instances of `MyThread` (`t1`, `t2`, `t3`).
  - Each `MyThread` instance is associated with a new `Thread` object (`first`, `second`, `third`).
  - Starts each thread sequentially.
- **Sequential Execution Control**:
  - Uses `join()` after starting each thread to ensure the main thread waits for the current thread to complete before starting the next.
- **Exception Handling**:
  - Catches and handles `InterruptedException` without additional action.

#### Key Concepts
- **Sequential Thread Execution**: Demonstrates how to execute threads one after the other using `join()`.
- **Thread Information**: Showcases accessing and printing thread-specific information like ID, priority, and state.
- **Thread Synchronization**: Ensures orderly completion of threads using `join()`.

#### Conclusion
This example illustrates how to execute multiple threads sequentially in Java. By using `Runnable` for task definition and `join()` for synchronization, it provides a clear pattern for managing multiple threads in a controlled sequence, ensuring each thread completes before the next begins. This approach is useful in scenarios where thread execution order matters.