# SortAlgorithms
These are java implementations of most common sorting algorithms such as:

  * Intercambio
  * SelectionSort
  * InsertionSort
  * ShellSort
  * QuickSort

The main application consists of a strategy pattern applied to the **Algorithm** class so we can write algorithms without touching the
existing code created at [*lab code*](https://github.com/Sierra-034/SortAlgorithms/commit/8588f83a1fe6f0e33e73f8b8bb5cdefa1cac7b17). The
purpose of **Filler** class is to provide the necessary data that is going to be sorted into the arrays. Then we pass the array as an
argument when creating new **Algorithm** instances.
