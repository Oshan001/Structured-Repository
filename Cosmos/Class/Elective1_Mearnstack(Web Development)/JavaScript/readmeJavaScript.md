# Introduction to JavaScript

* basic syntax

```js
console.log("hello world")
console.log(11)
console.log(true)
```

---

## commends :

* single line : any written in `//`  
  shortcut key in VS Code: `ctrl + /`

```js
// this is comment
```

* multiple line : any written in `/*  */`  
  shortcut key in VS Code: `shift + alt + A`

```js
/*
this is comment
*/
```

---

## Variables : A container to store value

* String :  
  eg: `let a = "A"` , `let a = "a"` , `let a = "Any Words"`

```js
// implementation of code
let name = "oshan"
let ward  = 14
let address = "kathmandu"
let hascar = false

// calling variable
console.log(name, ward, address, hascar)

// changing variable
name = "Bajracharya"
console.log(name, ward, address, hascar)

const country = "nepal"
console.log(country)

// country = "usa"  throw error
```

---

## OPERATORS :

1) Arithmetic operator   +, -, /, *, %  
2) Assignment operator   =, -=, +=  
3) Comparison operator   <, >, <=, >=  
4) Logical operator      ! , || , &&  

```js
// Arithmetic operator
console.log(1 + 1)
console.log(1 - 1)
console.log(1 * 1)
console.log(1 / 1)
console.log(1 % 1)


// Assignment operator
let a = 10   // it assign 10 to a variable


// Comparison operator
console.log(3 > 2)
console.log(3 < 2)
console.log(3 >= 3)
console.log(3 === 3)   // 3 IS EQUAL TO 3
console.log(3 !== 3)   // 3 IS NOT EQUAL TO 3


// Logical operator
console.log(!true)
console.log(!false)

// && -> output is false if one input is false
console.log(true && true && false && true)
console.log(true && true && true && true)


// || -> output is true if one input is true
console.log(false || false || false || false)
console.log(false || false || true || false)
```

---

# JavaScript Conditional Statements

This project demonstrates how to use conditional statements in JavaScript using `if`, `else if`, and `else`.

---

## 1. Voting Eligibility Checker

### Code

```js
// can vote or not
let age = 28

if (age >= 18)
    console.log("you can vote")
else
    console.log("cant vote")
```

---

## 2. Gender Checker

### Code

```js
// to look gender
let gender = "other"

if (gender === "male")
    console.log("He")

else if (gender === "female")
    console.log("She")

else if (gender === "other")
    console.log("They")

else
    console.log("Invalid gender")
```
# Functions 
A **function in JavaScript** is a reusable block of code designed to perform a specific task.

---

# 1. Basic Function

```javascript 
function greet() {
  console.log("Hello!");
}

greet();
```

---

# 2. Arrow Function

```javascript 
let fun1 = () => {
    console.log("this is inside function")
}

fun1()
console.log(1)

fun1()
console.log(2)

fun1()
```

> This is the correct way to define and call an arrow function.

---
# Functions in JavaScript

## 1. Basic Function

```javascript id="7mwwif"
function greet() {
  console.log("Hello!");
}

greet();
```

---

## 2. Arrow Function

```javascript id="h61hyy"
let fun1 = () => {
    console.log("this is inside function")
}

fun1()
```

---

## 3. Function with Parameters

```javascript id="y6m2hc"
let info = (name, surname, wada) => {
    console.log(name, surname, wada)
}

info("Oshan", "Bajracharya", 14)
```

---

## 4. Function with Undefined Values

```javascript id="z0rqzj"
let info1 = (name, surname, weight) => {
    console.log(name, surname, weight)
}

info1("Oshan")
```

---

## 5. Function with Default Parameters

```javascript id="f3vqv8"
let info1 = (name = "xyz", surname = "abc", weight = 62) => {
    console.log(name, surname, weight)
}

info1("Oshan", "Bajracharya")
```

---

## 6. Function with Return Type

```javascript id="e4kxku"
let fun = () => {
    return "Hello"
}

let i = fun()

console.log(i)
```

---

## 7. Function without Return Type

```javascript id="hxyih2"
let fun = () => {
    console.log("Hello")
}

fun()
```

---

# Examples

## 1. Voting Eligibility Function

```javascript id="3fk08r"
let canVote = (age) => {

    if (age >= 18)
        return "you can vote"
    else
        return "cant vote"
}

let voteAge = canVote(18)

console.log(voteAge)
```

---

## 2. Gender Pronoun Function

```javascript id="yqqlmx"
let perPo = (gender) => {

    if (gender === "male")
        return "he"

    else if (gender === "female")
        return "she"

    else
        return "they"
}

let genderShow = perPo("male")

console.log(genderShow)
```

---
