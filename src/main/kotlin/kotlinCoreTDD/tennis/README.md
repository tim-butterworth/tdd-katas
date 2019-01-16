## Tennis Score Tracker

The goal of this kata is to report scores for a game of singles tennis.

From the perspective of score, a player wins if they have at least 4 points and at least two points more then their opponent.

The scores and game states have special names:

```
0 -> "Love"
1 -> "15"
2 -> "30"
3 -> "40"
4 -> "Game"
```

For a game, one player is the server the whole time and the other player is the receiver

When the score is announced the server's score is announced first and the receiver's second whenever two scores are listed.

Ties are called out as the score + `-all`, for example, 0-0 -> `Love-all` but all ties 4-4 and greater are called `Duece`

If a game reaches `Duece` and the server scores, the score would be `Advantage Server`, alternatively, from `Duece`, if the receiver scores the score would be `Advantage Receiver`

I did not find the official way it is announced, but for the purposes of this kata, if the server wins the score should be `Game Server` and if the receiver wins the score should be `Game Receiver`

For the purposes of this kata, we will only solve for one game and not a whole match.