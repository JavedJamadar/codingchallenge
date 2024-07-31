Note On The Solution: Both counting charater in a word and counting 1s in a binary number can be addressed with similar parsing logic.
That why I have implemented single core fuction with two wrappers around it to cater to two different requests. 
Please download the code and run the test class it will run all the reuired tests.
Two Files: 
CharacterCounter.java: Implementation of the logic. 
  getMaxWord Funtion implements required logic. 
  findWordWithMostCharacters  and getStartingPos are wrapper function to cater to both problem needs.
CharacterCounterTest ==> Test for verifying all the given test cases and additional tests.
