### Java Thread Communication with Shared Object

#### `Sum` Class (Sum.java)
- **Purpose**: Holds a summation result.
- **Methods**: 
  - `getSum()`: Returns the current sum value.
  - `setSum(int s)`: Sets the sum value.

#### `Summation` Class (Summation.java)
- **Implements**: `Runnable` for thread execution.
- **Fields**:
  - `upper`: Upper limit for summation.
  - `sum`: `Sum` object to store result.
- **Constructor**: Initializes `upper` and `sum`.
- **`run()` Method**:
  - Calculates the sum from 1 to `upper`.
  - Sets the result in the shared `Sum` object.

#### `Main` Class (Main.java)
- **Input Validation**: Checks if an argument is provided and is non-negative.
- **Thread Execution**:
  - Creates a `Sum` object to hold the result.
  - Parses the upper limit from arguments.
  - Starts a thread executing `Summation`.
- **Thread Completion Handling**:
  - Uses `t.join()` to wait for thread completion.
  - Prints the result after thread completion.
- **Error Handling**: Provides error messages for incorrect usage.

#### Key Concepts
- **Shared Object**: Demonstrates thread communication using a shared object (`Sum`).
- **`Runnable` Interface**: Separates task definition from thread execution.
- **Thread Synchronization**: Ensures main thread waits for completion using `join()`.

#### Conclusion
This example illustrates inter-thread communication through a shared object in Java. It demonstrates a clean way to share data between threads and the main thread, ensuring proper synchronization with `join()`. Useful for scenarios where threads need to report back results to the main thread.