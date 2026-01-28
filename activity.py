from datetime import datetime
name = input("Enter your name: ")
age = int(input("Enter your age: "))
current_year = datetime.now().year
hundred_year = current_year - age + 100 - 1
print(f"Hello, {name}! You were born in {hundred_year}.")