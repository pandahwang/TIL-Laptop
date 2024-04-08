def encrypt(word):
    converted_word = ""
    for i in word:
        word_in_ord = ord(i)
        word_in_ord += num
        converted_word += chr(word_in_ord)
    return converted_word
    
def decrypt(word):
    converted_word = ""
    for i in word:
        word_in_ord = ord(i)
        word_in_ord -= num
        converted_word += chr(word_in_ord)
    return converted_word
answer = "yes"
while answer != "no":
    func_type = input("Type 'encode' to encrypt, or 'decode' to decrypt: ")
    if func_type != "encode" and "decode":
        print("Please choose between 'encode' or 'decode'. ")
    word = input("Type your message: ")
    num = int(input("Type the shift number: "))

    if func_type == "encode":
        print("Here's the encoded result: ", encrypt(word))
    elif func_type == "decode":
        print("Here's the decoded result: ", decrypt(word))
    
    answer = input("Type 'yes' if you want to go again. Otherwise type 'no'. ")

