class User:
    def __init__(self, user_id, username):
        self.id = user_id
        self.username = username

user_1 = User("youngpanda", "황호영")
print(user_1.username)
print(user_1.id)