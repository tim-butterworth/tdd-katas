## Password Verifier

It is common knowledge in the security community that the number of interesting restrictions placed on a password increases the difficulty for a human to generate a password.
The result of the increase in difficulty is that fewer people will go through all the effort to create a password and with fewer users you have less information to secure.
It is believed that if one is able to make generating a password hard enough, no users will go through the effort and as such one can have a perfectly secure system.

In an effort to help users give up on creating a password, the kata requires the creation of a password rejector that rejects passwords if they do not follow any of the following rules:

 - At least 12 characters and the length must be a multiple of 3
 - An even number of vowels `aeiou`
 - The same number of numbers as vowels
 - Exactly one special character `!@#$%^&*()_+=-?~`
 - Three uppercase letters
