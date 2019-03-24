# Waro

This is a game server to play a "card game" with other players.

You create a game, have players join, and then start the game.

## Rules

These are the rules as I remember them:

1. A deck consists of many cards with a unique value. For simplicity I'll be using 1 to n where n is the number of cards.
1. The deck is dealt to all players and the "kitty pool".
2. The "dealer" (i.e. this service) will play out 1 card per round from the kitty pool
3. Each player "bids" on the card from the kitty pool. They can bid exactly one card from their hand.
4. The player with the highest bid wins the round and the value of the card from the kitty pool goes to that player's points. Other players get 0.
5. After all rounds are played, the points are tallied and unsurprisingly, the player with the most points wins.
