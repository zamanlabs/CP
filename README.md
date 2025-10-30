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


# (B)

---

### 🔹 Static Operations
If we consider the **other static operations** (like initialization, assignments, and conditional checks) as constant-time,  
their time complexity will be:

\[
O(1)
\]

---

### 🔹 Loop Analysis
When we look at the loop, the `result` variable increases **exponentially**, since:

\[
\text{result} = i^2
\]

The loop will continue executing as long as:

\[
i^2 \leq x
\]

Hence, the loop runs approximately **√x times**, because the condition fails right after \( i > \sqrt{x} \).

So the number of loop iterations (or operations) is proportional to:

\[
\sqrt{x}
\]

Therefore, the **time complexity of the loop** is:

\[
O(\sqrt{x})
\]

---

### 🔹 Total Time Complexity

When combining all operations:

\[
O(1) + O(\sqrt{x}) = O(\sqrt{x})
\]

✅ **Final Time Complexity:**

```math
O(\sqrt{x})
```


