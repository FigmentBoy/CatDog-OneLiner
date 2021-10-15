# CatDog-OneLiner
A one-line solution for the catDog coding challenge

## Problem Statement

The catDog method is given two strings. The words "cat" and "dog" may appear any number of times in either or both string a and b. Return a string containing "cat" and "dog" in the order they first appear in the two strings. If "cat" or "dog" are missing then return the one that's missing. If both "cat" and "dog" are missing or they first appear at the same position then return an empty string.

 

Examples:
```
catDog("my dog", "your cat")       returns "dogcat"
catDog("a dog",  "catch a cat")    returns "catdog"
catDog("hey dog" "catdog")         returns "catdog"
catDog("hello",  "cat")            returns "dog"
catDog("I like", "fish instead")   returns ""
catDog("my cat", "my dog")         returns ""
```
