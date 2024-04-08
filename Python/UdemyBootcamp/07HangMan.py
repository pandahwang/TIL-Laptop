import random
max_attempts = 6
guesses = []
displaying_word = []
def draw_hangman(max_attempts):
    hangman_parts = [
        """
           _______
          |       |
          |       
          |      
          |        
          |        
         _|_      
        """,
        """
           _______
          |       |
          |       O
          |       
          |        
          |        
         _|_      
        """,
        """
           _______
          |       |
          |       O
          |       |
          |        
          |        
         _|_      
        """,
        """
           _______
          |       |
          |       O
          |      /|
          |        
          |        
         _|_      
        """,
        """
           _______
          |       |
          |       O
          |      /|\\
          |      
          |        
         _|_      
        """,
        """
           _______
          |       |
          |       O
          |      /|\\
          |      / 
          |        
         _|_      
        """,
        """
           _______
          |       |
          |       O
          |      /|\\
          |      / \\
          |        
         _|_      
        """
    ]
    print(hangman_parts[6 - max_attempts])

def choose_word():
    wordnum = random.randint(0,4)
    words = ["apple", "pear", "bee", "person", "pineapple"]
    word = words[wordnum]
    return word

def display_word(word, guesses):
    displaying_word = []
    for letter in word:
        if letter in guesses:
            displaying_word += letter
        else:
            displaying_word += "_"
    return displaying_word
word = choose_word()
print("Welcome to the Hang Man game!")
draw_hangman(max_attempts)
while max_attempts != 0:
    letter = input("Type any single character: ").lower()
    if letter in guesses:
        print("You've already typed that answer. ")
    elif len(letter) != 1 and not letter.isalpha():
        print("Please type a single alphabet.")
    else :
        guesses.append(letter)
        if letter in word:
            print("Correct!")
            print(display_word(word, guesses))
            draw_hangman(max_attempts)
            print(f"You have {max_attempts} attempts remaining. ")
        elif letter not in word:
            max_attempts -= 1
            print("Wrong!")
            print(display_word(word, guesses))
            draw_hangman(max_attempts)
            print(f"You have {max_attempts} attempts remaining. ")
    if "_" not in display_word(word, guesses):
        draw_hangman(max_attempts)
        print("Congratulation! You successed! ")
        print(f"The answer is {word}!!")
        exit()

if max_attempts == 0:
    draw_hangman(max_attempts)
    print("YOU FAILED.")
    print(f"The answer was {word}.")
    exit()