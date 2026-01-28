import random as rd

user_choice = int(input("""Enter The following number
      1. Rock
      2. Paper
      3. Scissors
      Enter the choice :
     """))

if user_choice not in [1, 2, 3]:
    print("Invalid choice! Please enter 1, 2, or 3.")
    exit()

computer_choice = rd.randint(1,3)

if (user_choice == computer_choice):
    print("Tie b/w You both..!")
elif ((user_choice == 1 and computer_choice == 3) or (user_choice == 2 and computer_choice == 1) or (user_choice == 3 and computer_choice == 2)):
    print("You wins..!")
else:
    print("Computer wins..!")
