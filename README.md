# Homework — Highest and Lowest Price

## Overview

Create a Java program that stores a set of prices in an array and finds the highest and lowest values. This assignment covers iterating over an array to track a running value.

**File / class name:** `PriceRange.java`

---

## Requirements

- Ask a user how many prices they have
- Based on that, iterate a loop, asking the user for each price
- store all the prices in an array of double (double[])

- Use a `for` loop to display each price, numbered starting at 1.
- Use a `for` loop with `Math.max()` and `Math.min()` to track the highest and lowest price as you go.
- Display the highest and lowest price with two decimal places using `printf`.

---

## Expected Output Format

```text
Price Range
------------
Price 1: $19.99
Price 2: $5.49
Price 3: $42.00
Price 4: $12.75
Price 5: $8.30
Highest: $42.00
Lowest: $5.49
```

---

## Restrictions

- No `ArrayList`, conditionals (`if`/`else`/`switch`), extra classes, or external libraries.
- Must use a `for` loop (not `while`/`do-while`).
- `Math.max()` / `Math.min()` are allowed since they're part of core Java — do not write your own comparison logic with `if`.
- The highest and lowest values must be calculated

---

## Compile & Run

```bash
javac PriceRange.java
java PriceRange
```

