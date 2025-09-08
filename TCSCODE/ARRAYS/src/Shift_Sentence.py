def shift_sentence(s: str) -> str:
    result = []
    for ch in s:
        if 'a' <= ch <= 'z':   # lowercase
            result.append('a' if ch == 'z' else chr(ord(ch) + 1))
        elif 'A' <= ch <= 'Z': # uppercase
            result.append('A' if ch == 'Z' else chr(ord(ch) + 1))
        else:                  # non-alphabetic stays same
            result.append(ch)
    return "".join(result)


# Example usage
print(shift_sentence("abcd"))          # → bcde
print(shift_sentence("xyz"))           # → yza
print(shift_sentence("Hello World!"))  # → Ifmmp Xpsme!
