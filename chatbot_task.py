user_database = {}

print("Welcome to our chatbot!")
print("Type 'i want to login' to begin.")

user_input = input().lower()

if "i want to login" in user_input:
    email = input("Enter your email: ")
    password = input("Enter your password: ")

    user_database[email] = password

    print("Your account has been registered.")
else:
    print("I'm sorry, I didn't understand that.")