### C Multi-Threading with POSIX Threads

#### `Threads.c`
- **Purpose**: Demonstrates creating and running a POSIX thread to calculate the sum of integers up to a given limit.

#### `main` Function:
- **Thread Initialization**:
  - Declares `pthread_t tid` for the thread identifier.
  - Initializes `pthread_attr_t attr` for thread attributes.
- **Thread Creation**:
  - Sets an integer `n` as the upper limit for summation.
  - Calls `pthread_create()` to create a thread, passing `runner` as the function to be executed.
- **Thread Completion**:
  - Uses `pthread_join()` to wait for the thread to finish execution.
- **Output**: Prints the sum calculated by the thread.

#### `runner` Function:
- **Purpose**: Function executed by the thread.
- **Implementation**:
  - Converts the `param` argument to an integer pointer and dereferences it to get the upper limit for summation.
  - Calculates the sum from 0 to the upper limit.
  - Calls `pthread_exit(0)` to terminate the thread.

#### Key Concepts
- **POSIX Threads**: Uses POSIX thread library (`pthread.h`) for multi-threading in C.
- **Thread Communication**: The `sum` variable is shared between the main function and the thread.
- **Thread Synchronization**: `pthread_join()` ensures that the main function waits for the thread to complete its execution.

#### Conclusion
This example demonstrates basic usage of POSIX threads in C for concurrent execution. It shows thread creation, execution of a specific task in the thread, and synchronization with the main thread. The pattern is useful for performing parallel computations in C programs.