# Operations with Huge Integers

A class which is able to represent arbitrarily large integer numbers while implementing arithmetic operations such as addition, subtraction, multiplication and comparison without the use of the Java Collections Framework.

# Specifications:

The classHugeIntegercontains the following methods:

1)public HugeInteger add(HugeInteger h):  Returns a newHugeIntegerrepre-senting the sum ofthis HugeIntegerandh.

2)public HugeInteger subtract(HugeInteger h):  Returns  a  newHugeIntegerrepresenting the difference between this HugeInteger and h.

3)public HugeInteger multiply(HugeInteger h):  Returns  a  newHugeInteger representing the product between this HugeInteger and h.

4)public int compareTo(HugeInteger h): Returns -1 if this HugeInteger is less than h, 1 ifthis HugeIntegeris larger than h, and 0 if this HugeInteger is equal to h.

5)public String toString():  Returns a string representing the sequence of digits corresponding to the decimal representation of this HugeInteger.
