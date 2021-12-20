# emp_OrangeMarshmallows

## Team Orange Marshmallows
* Julia Kozak, Nina Jiang, Diana Akhmedova 
* *Duckies: Flopsy, Miss Alpaca, Ajax*

### Tests Performed 
* The test repeats both Binary Search and Linear Search on arrays of a specified length for a specified number of trials, and for varying targets.
* The specified lengths we chose to test were 1, 10, 100, 1000, 10000, 100000, 1000000, each for 10000 trials.
* Both searches are done the same number of times.
* Both searches are performed on the same array, which consist of increasing consecutive integers starting from 0.
* Each time a trial is run, a new random integer is selected from a range that makes it equally likely to be in the array or outside of it. It is then searched for. This is done consecutively for the Binary Search algorithm for the number of specified trials, and the time that it takes is recorded. The same is repeated for the Linear Search algorithm.
* The total times of the two searches are compared, and results are printed with the time difference, faster time, number of trials, and array length tested on.

### Results
* After running 10000 trials on each tested length, our results were as follows:

| Length of Array | Faster Algorithm | Faster Time, seconds | Time Difference (for 10000 trials), seconds |
| ----------- | ----------- | ----------- | ----------- |
| 1 | Linear | 0.001 | 0.001 |
| 10 | Linear | 0.001 | 0.001 |
| 100 | same time | 0.001 | 0.000 |
| 1000 | Binary | 0.001 | 0.004 |
| 10000 | Binary | 0.001 | 0.038 |
| 100000 | Binary | 0.001 | 0.222 |
| 1000000 | Binary | 0.003 | 4.429 |


### Conclusions
* For smaller searches and random targets, Linear Search is slightly more efficient. But for larger arrays, Binary Search is significantly faster.
