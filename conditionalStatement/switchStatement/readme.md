## Switch Statement

### What is Switch?

Alternative to multiple `if-else if` statements. Better for checking **one variable** against many values.

**Syntax:**

```cpp
switch(variable) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code if no match
}
```
### Important: `break` Statement

**Without `break`, code "falls through":**

```cpp
int num = 2;

switch(num) {
    case 1:
        cout << "One" << endl;
    case 2:
        cout << "Two" << endl;  // Prints this
    case 3:
        cout << "Three" << endl; // Also prints this!
    default:
        cout << "Other" << endl; // And this too!
}

```
**Output:**
```
Two
Three
Other
```


**With `break`:**

```cpp
int num = 2;

switch(num) {
    case 1:
        cout << "One" << endl;
        break;
    case 2:
        cout << "Two" << endl;
        break;  // Stops here
    case 3:
        cout << "Three" << endl;
        break;
    default:
        cout << "Other" << endl;
}

```

**Output:**
```
 Two
```
