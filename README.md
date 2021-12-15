# Advent of Code 2021 Day 7

https://adventofcode.com/2021/day/7

To brute force this consider that the target position must be between the min and max.

Proof:

If the numbers are 10,11,12
Clearly if the cheapest number was 9 (cost 1 + 2 + 3) everything had to move past 10 except 
10 which was already there. Similar proof for the max.

This is also a linear complexity so should be easy to brute force it.

Possible optimizations...

Iterative solutions that converge on a solution such as linear regression would likely fall into local minimums.

There may be ways to get the solution faster with an educated starting point such as mean or median and then work in both directions.

Part 2 just required a quick way to get sum of 1 .. n

n = n(n+1) / 2