# 1 (A)

---

### 🔹 Outer Loop
The **outer loop** is a linear loop that starts from:

\( i = \frac{n}{2} \)

and stops when:

\( i > n \)

So, the loop runs approximately:

\( \frac{n}{2} \) times.

➡️ **Time complexity of the outer loop:**

```math
O(n)
```

---

### 🔹 Inner Loop
The **inner loop** starts from \( j = 2 \) and continues until \( j > n \).

After each iteration, the value of `j` doubles — i.e.,

```cpp
j = j * 2;
```

So, the series of values for `j` is:

```
2, 4, 8, 16, 32, ...
```

Let's express it mathematically:

In the first iteration:

\( j = 2^2 \)

In the second iteration:

\( j = 2^3 \)

In general, for the \( k^{th} \) iteration:

\( j = 2^{k + 1} \)

The loop stops when \( j \leq n \), so:

\( 2^{k + 1} \leq n \)

Taking log base 2 on both sides:

\( k + 1 \leq \log_2{n} \)

Therefore,

\( k = O(\log n) \)

➡️ **Time complexity of the inner loop:**

```math
O(\log n)
```

---

### 🔹 Overall Time Complexity
To find the total complexity, multiply the outer and inner loop complexities:

\( O(n) \times O(\log n) = O(n \log n) \)

✅ **Final Time Complexity:**

```math
\boxed{O(n \log n)}
```

---


