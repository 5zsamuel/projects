def caesar(text, shift, encode=True):
    if shift < 1 or shift > 25:
        return 'Shift must be an integer between 1 and 25.'

    alphabet = 'abcdefghijklmnopqrstuvwxyz'

    if not encode:
        shift = -shift

    shifted_alphabet = alphabet[shift:] + alphabet[:shift]
    translation_table = str.maketrans(alphabet + alphabet.upper(), shifted_alphabet + shifted_alphabet.upper())
    encoded_text = text.translate(translation_table)
    return encoded_text


def encode(text, shift):
    return caesar(text, shift)


def decode(text, shift):
    return caesar(text, shift, encode=False)


print("=== Caesar Cipher ===")
choice = input("1. Encode\n2. Decode\nEnter your choice: ")
text_input = str(input("Enter your text: "))

while True:
    try:
        shift_input = int(input("Enter your desirable shift (1 - 25): "))
        break
    except ValueError:
        print("Shift must be an integer.")


if choice == "1":
    print(f"Encoded text using a shift of {shift_input}: {encode(text_input, shift_input)}")
elif choice == "2":
    print(f"Decoded text: {decode(text_input, shift_input)}")
else:
    print("Please enter either '1' or '2'.")