# cs331-Project1

This project was completed for my CS331 (Data Structures and Algorithms) class. I was tasked with the goal of defining a class, PairOfDice(), that would be composed of two individual dice objects. I would need to set and recall their values, create a method to roll these dice, and a method to print/output the sum of the two aforementioned dice.

There are 3 classes that are part of this project
  1. public class Die()
  2. public class PairOfDice()
  3. public class RollingDice2()

Let's go over what each of these classes do and how they work together to make the whole project execute.

public class Die():

This part of the code was the first part as it was given to me as a basis to start with. It         establishes the minimum and maximum numbers that the dice can roll (1 and 6). The variable for a die is established, initially set to one as a placeholder and is immediately rewritten to pick at random between 1 and 6. The code then returns the die's new value and allows the value to be recalled as a string.


public class PairOfDice():

This class initially sets the minimum and maximum values for dice1 and dice2. Both dice then receive their randomized values which then get immediately returned to the output. The sum of these values are returned to the output for the user to read.


public class RollingDice2():

This class is pretty basic, as it allows the prior classes to run smoothly and it establishes both of them to run under this class (RollingDice2()).
