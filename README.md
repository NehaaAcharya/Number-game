# Number-game
This code implements a simple guessing game where the user tries to guess a random number between 1 and 100 generated by the program. 
The program provides hints to the user whether their guess is higher or lower than the actual number. The game continues until the user guesses the correct number.

This Java code creates a simple number guessing game.  It begins by importing the Scanner class, which allows the program to take user input from the console.  Inside the main method, an integer variable number is created to store a randomly generated number between 1 and 100. Another integer variable, user_num, is initialized to 0 to hold the user's guess.

The core gameplay logic is implemented using a do-while loop. This loop ensures that the user is prompted for a guess at least once, even if their initial guess is incorrect. Inside the loop, the program prompts the user to guess a number between 1 and 100. The user's input is then stored in the user_num variable.

The program then checks the user's guess against the randomly generated number. If the guess is correct, the loop is exited, and the program congratulates the user. If the guess is incorrect, the program provides a hint to the user. It checks if the user's guess is higher or lower than the actual number and displays a message accordingly. This loop continues until the user successfully guesses the random number.

Finally, after the loop exits (indicating a correct guess), the program reveals the actual random number that was generated, informing the user of the target they were trying to guess.
