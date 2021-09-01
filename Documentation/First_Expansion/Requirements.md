# Requirements

## Prose from proposal
The program shall display a ball which behaves in a much less predictable and randomized pattern. To achieve this there are three areas where the ball's current behavioud has to be updated:
### On impact with a player entity or an AI entity:
- The ball shall change its general movement towards the oposing player
- The ball shall alter its current speed (either slightly speed up or slow down).
- The ball shall change its angle slightly (thats the movement on the x-axis of the playing field).

### On reset (after hitting the left or right wall of the playing field or up on start of the game):
- The ball shall get a randomized direction (left/right).
- The ball shall randomly generate a speed within a predetermined range.
- The ball shall randomly generate a direction on the y-axis (up/down).
- On reset after scoring, the ball should pick a direction towards the scoring entity.

### On impact with the top or bottom boundry of the playing field:
- The ball shall maintain its left/right direction.
- The ball shall maintain its current speed.
- The ball shall randomly alter its exit angle by a predetermined range.

## Requirements Gathering:

### Questions to be answered:
1. Is a new technology needed to development the upgrade of the game?
2. What is the impact in all aspects if we not do the upgrade?
3. What are the current problems the game has?
4. How will the upgrade alleviate the above concerns?
5. What will be some of the development and integration problems e3ncountered  by the system's update
