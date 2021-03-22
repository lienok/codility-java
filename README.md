# Java Codility Solutions

Solutions and tests in Java for the lessons at https://codility.com/programmers/lessons/

## Test cases

* my own test cases I used during the task implementation.  I did first all of my solution in Eclipse IDE 
* After I alway passed to the codility platform to Submit and to verify.

## Other notes

* I realized that if my solution passed 100% first when I submitted that again it doesn't need to pass 100%. It is becouse the codility platform has some random array for the 'maximal' test so you might be lucky with the not the fastest solution :).
* the "Open reading material", currently at the top of each lesson, is worth reading before attempting the exercises as they are short and focus exactly on what you'll need to solve the following puzzles
* if you use the browser to actually build your solution - every edit and run is recorded and presented to the client
* before submitting your solution, there is no feedback regarding it's efficiency; but it does affect your score and report
* Understanding the O factors reveals the nature of the optimal solution:
   * O(1) there is a formulaic solution 
   * O(n) the solution has no nested loops and all happens in a single pass
   * O(n+m) the solution has no nested loops, and passes over n and m only once
   * O(n+n) the solution has no nested loops, but you can pass over the sequence twice
   * O(n*n) the solution has a loop through n nested inside a loop through n

## Lessons
Lesson 2 Arrays
- **OddOccurrencesInArray** [Solution](https://github.com/lienok/codility-java/blob/master/src/main/java/codilitysolutions/arrays/OddOccurencesInArray.java)
/ [Tests](https://github.com/lienok/codility-java/blob/master/src/test/java/codilitysolutions/arrays/OddOccurencesInArrayTest.java)
- **CyclicRotation** [Solution](https://github.com/lienok/codility-java/blob/master/src/main/java/codilitysolutions/arrays/CyclicRotation.java)
/ [Tests](https://github.com/lienok/codility-java/blob/master/src/test/java/codilitysolutions/arrays/CyclicRotationTest.java)
/ [CodilityReport](https://app.codility.com/demo/results/training3GP53Q-2PN/)

Lesson 3 Time Complexity
- **TapeEquilibrium** [Solution](https://github.com/lienok/codility-java/blob/master/src/main/java/codilitysolutions/timecomplexity/TapeEquilibrium.java) 
/ [Tests](https://github.com/lienok/codility-java/blob/master/src/test/java/codilitysolutions/timecomplexity/TapeEquilibriumTest.java) 
