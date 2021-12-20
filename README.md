# emp_OrangeMarshmallows

## Team Orange Marshmallows
* Julia Kozak, Nina Jiang, Diana Akhmedova 
* *Duckies: Flopsy, Miss Alpaca, Ajax*

### Tests Performed 
* The test repeats both Binary Search and Linear Search on arrays of a specified length for a specified number of trials, and for varying targets.
* The specified lengths we chose to test were 1, 10, 100, 1000, 10000, 100000, 1000000, each for 100000 trials.
* Both searches are done the same number of times.
* Both searches are performed on the same array, which consist of increasing consecutive integers starting from 0.
* We performed three sets of tests.
  * For the first, each time a trial is run, a new random integer is selected from a range that makes it equally likely to be in the array or outside of it. It is then searched for. This is done consecutively for the Binary Search algorithm for the number of specified trials, and the time that it takes is recorded. The same is repeated for the Linear Search algorithm.
  * The second repeats the same process, but the target is fixed to the worst case (last element in the array for each).
  * The third also repeats the same process, but the target is fixed to the best case (middle element for Binary Search, first element for Linear Search).
* The total times of the two searches are compared, and results are printed with the time difference, faster time, number of trials, and array length tested on.

### Results
* After running 100000 trials on each tested length and set of targets, our results were as follows:

#### Random Targets
| Length of Array | Faster Algorithm | Faster Time, seconds | Time Difference (for 100000 trials), seconds |
| ----------- | ----------- | ----------- | ----------- |
| 1 | Linear | 0.003 | 0.011 |
| 10 | Linear | 0.003 | 0.003 |
| 100 | Binary | 0.006 | 0.002 |
| 1000 | Binary | 0.007 | 0.020 |
| 10000 | Binary | 0.011 | 0.288 |
| 100000 | Binary | 0.014 | 2.508 |
| 1000000 | Binary | 0.026 | 25.599 |

#### Worst Target
| Length of Array | Faster Algorithm | Faster Time, seconds | Time Difference (for 100000 trials), seconds |
| ----------- | ----------- | ----------- | ----------- |
| 1 | Linear | 0.001 | 0.002 |
| 10 | Binary | 0.001 | 0.001 |
| 100 | Binary | 0.003 | 0.013 |
| 1000 | Binary | 0.003 | 0.030 |
| 10000 | Binary | 0.003 | 0.440 |
| 100000 | Binary | 0.005 | 1.961 |
| 1000000 | Binary | 0.006 | 20.400 |

#### Best Target
| Length of Array | Faster Algorithm | Faster Time, seconds | Time Difference (for 100000 trials), seconds |
| ----------- | ----------- | ----------- | ----------- |
| 1 | Linear | 0.001 | 0.002 |
| 10 | Linear | 0.000 | 0.001 |
| 100 | Linear | 0.000 | 0.002 |
| 1000 | Linear | 0.001 | 0.003 |
| 10000 | Linear | 0.001 | 0.004 |
| 100000 | Linear | 0.000 | 0.006 |
| 1000000 | Linear | 0.000 | 0.005 |

### Conclusions
* For smaller searches and random targets, Linear Search is slightly more efficient. For larger arrays, Binary Search is significantly faster.
* When given the worst case for a target, Binary Search is more efficient with arrays of larger length.
* When given the best case for a target, Linear Search is slightly more efficient than Binary Search overall.
