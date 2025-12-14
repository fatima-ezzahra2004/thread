# 🧵 Java Threads – Shared Resource Example

This project is a **simple educational example** demonstrating
how **multiple threads access a shared resource** in Java.

⚠️ This example is for **learning purposes only** and illustrates
a **concurrency problem** when synchronization is not used.

---

## 📚 Concepts Covered

- Java Threads
- Runnable Interface
- Shared Resource
- Race Condition (Synchronization Problem)

---

## 🧠 Description

The program creates:
- One shared object: `Compteur`
- Three threads: `Thread A`, `Thread B`, `Thread C`

All threads try to:
1. Read the same counter value
2. Wait for a short time
3. Decrement the counter
4. Display the new value

Because the access to the shared resource is **not synchronized**,
threads may read the same value at the same time, causing
**inconsistent results**.

---

## 📦 Classes Explanation

### 🔹 Compteur
Represents the **shared resource**.

```java
private int valeur = 5;
