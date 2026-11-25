# 📘 Lab 1: Introduction to NumPy & Pandas

| | |
|---|---|
| **Name** | Oshan Bajracharya |
| **Roll No.** | 230328 |
| **Date** | Nov 25 2026 |

## 📖 About This Lab

In this lab we learned two important Python libraries used in data science.

| Library | What it does |
|---|---|
| **NumPy** | Works with numbers and arrays. It is fast and good for maths. |
| **Pandas** | Works with tables of data (rows and columns), like Excel in Python. |

Each section has:

1. **Code written in the lab**, shown with its real output.
2. **A table of functions**, with their use and syntax.

## 📑 Contents

- [1. NumPy](#1-numpy)
- [2. Pandas](#2-pandas)
- [Conclusion](#conclusion)

---

## 1. NumPy

🔵 *Fast arrays and maths in Python*

### A. Code Written in the Lab (with Output)

#### 1. Creating arrays

```python
import numpy as np

A = np.array([1, 2, 3, 4])
B = np.array([[1, 2.5, 4],
              [4, 5, 8]])
print(A)
print(B)

print(A.ndim)
print(B.ndim)
```

Output:

```text
[1 2 3 4]
[[1.  2.5 4. ]
 [4.  5.  8. ]]
1
2
```

#### 2. Built-in array creation functions

```python
print(np.zeros(5))
```

Output:

```text
[0. 0. 0. 0. 0.]
```

```python
print(np.ones(5))
```

Output:

```text
[1. 1. 1. 1. 1.]
```

```python
print(np.arange(1, 11, 2))
```

Output:

```text
[1 3 5 7 9]
```

```python
print(np.linspace(0, 10, 6))
```

Output:

```text
[ 0.  2.  4.  6.  8. 10.]
```

```python
print(np.eye(3))
```

Output:

```text
[[1. 0. 0.]
 [0. 1. 0.]
 [0. 0. 1.]]
```

#### 3. Array attributes

```python
print(A.ndim)
```

Output:

```text
1
```

```python
print(A.shape)
```

Output:

```text
(4,)
```

```python
print(B.shape)
```

Output:

```text
(2, 3)
```

```python
print(A.size)
```

Output:

```text
4
```

```python
print(B.size)
```

Output:

```text
6
```

```python
print(A.dtype)
```

Output:

```text
int64
```

```python
print(B.dtype)
```

Output:

```text
float64
```

#### 4. Indexing and slicing

```python
A = np.array([[1, 2, 3],
              [4, 5, 3]])
```

```python
print(A[1:5])
```

Output:

```text
[[4 5 3]]
```

```python
print(A[::2])
```

Output:

```text
[[1 2 3]]
```

```python
print(A[::, 1])
```

Output:

```text
[2 5]
```

#### 5. Boolean masking (filtering)

```python
a = np.array([[1,34, 5, 5]])
mask = a>=5
print(a[mask])
```

Output:

```text
[34  5  5]
```

```python
print(mask)
```

Output:

```text
[[False  True  True  True]]
```

```python
marks = np.array([[1, 40, 50, 32, 55, 35, 99]])
print(marks[marks>=50])
```

Output:

```text
[50 55 99]
```

#### 6. List vs NumPy array operations

```python
list1 = [1, 2, 4]
print(list1*2)
```

Output:

```text
[1, 2, 4, 1, 2, 4]
```

```python
a = np.array([1, 2, 3, 4])

print(a*2)
```

Output:

```text
[2 4 6 8]
```

```python
print(a**2)
```

Output:

```text
[ 1  4  9 16]
```

```python
print(a+10)
```

Output:

```text
[11 12 13 14]
```

#### 7. Statistics

```python
marks = np.array([50, 33, 13, 53, 90, 79, 80])
print(np.sum(marks))
```

Output:

```text
398
```

```python
print(np.mean(marks))
```

Output:

```text
56.857142857142854
```

```python
print(np.median(marks))
```

Output:

```text
53.0
```

```python
print(np.min(marks), np.max(marks))
```

Output:

```text
13 90
```

```python
print(np.var(marks))
```

Output:

```text
668.408163265306
```

```python
print(np.std(marks))
```

Output:

```text
25.853590916259698
```

```python
print(np.var(marks, ddof = 1))
```

Output:

```text
779.8095238095237
```

#### 8. Reshape and axis sum

```python
b = np.arange(1, 13)
```

```python
b
```

Output:

```text
array([ 1,  2,  3,  4,  5,  6,  7,  8,  9, 10, 11, 12])
```

```python
b = b.reshape(3, 4)
```

```python
b
```

Output:

```text
array([[ 1,  2,  3,  4],
       [ 5,  6,  7,  8],
       [ 9, 10, 11, 12]])
```

```python
print(b.sum())
```

Output:

```text
78
```

```python
print(b.sum(axis=0))
```

Output:

```text
[15 18 21 24]
```

```python
print(b.sum(axis=1))
```

Output:

```text
[10 26 42]
```

#### 9. Matrix operations

```python
A = np.array([[1, 2], [3, 4]])
B = np.array([[5, 6], [7, 8]])

print(A+B, "\n")
print(A*B, "\n")
print(A@B, "\n")
print(np.matmul(A, B), "\n")
print(A.T, "\n")
print(np.linalg.det(A), "\n")
print(np.linalg.inv(A))
```

Output:

```text
[[ 6  8]
 [10 12]] 

[[ 5 12]
 [21 32]] 

[[19 22]
 [43 50]] 

[[19 22]
 [43 50]] 

[[1 3]
 [2 4]] 

-2.0000000000000004 

[[-2.   1. ]
 [ 1.5 -0.5]]
```

#### 10. Random numbers

```python
np.random.seed(42)
print(np.random.rand(5))
```

Output:

```text
[0.37454012 0.95071431 0.73199394 0.59865848 0.15601864]
```

```python
print(np.random.randint(1, 7, 5))
```

Output:

```text
[3 3 3 5 4]
```

```python
sample = np.random.normal(0, 1, 1000)
print(sample.mean())
```

Output:

```text
0.03593567340084113
```

### B. Functions Used: Use and Syntax

| Function | Use (what it does) | Syntax |
|---|---|---|
| `np.array()` | Makes an array from a list of numbers. | `np.array([1, 2, 3])` |
| `ndim` | Tells how many dimensions the array has. | `arr.ndim` |
| `shape` | Gives the number of rows and columns. | `arr.shape` |
| `size` | Gives the total number of elements. | `arr.size` |
| `dtype` | Shows the data type of the elements. | `arr.dtype` |
| `np.zeros()` | Makes an array full of zeros. | `np.zeros(5)` |
| `np.ones()` | Makes an array full of ones. | `np.ones(5)` |
| `np.arange()` | Makes numbers from start to stop using a step. | `np.arange(start, stop, step)` |
| `np.linspace()` | Makes a fixed number of equally spaced numbers. | `np.linspace(start, stop, num)` |
| `np.eye()` | Makes an identity matrix. | `np.eye(3)` |
| `Slicing` | Takes a part of an array. | `arr[start:stop:step]`<br>`arr[:, column]` |
| `Boolean mask` | Keeps only the values that match a condition. | `arr[arr >= 50]` |
| `np.sum()` | Adds all the values. | `np.sum(arr)` |
| `np.mean()` | Finds the average. | `np.mean(arr)` |
| `np.median()` | Finds the middle value. | `np.median(arr)` |
| `np.min() / np.max()` | Finds the smallest and the biggest value. | `np.min(arr)`<br>`np.max(arr)` |
| `np.var()` | Finds the variance. Use ddof=1 for sample variance. | `np.var(arr, ddof=0)` |
| `np.std()` | Finds the standard deviation. | `np.std(arr)` |
| `reshape()` | Changes the shape without changing the data. | `arr.reshape(rows, cols)` |
| `sum(axis=)` | Adds down columns (axis 0) or across rows (axis 1). | `arr.sum(axis=0)` |
| `+  *  @` | + and * work element by element. @ is matrix multiplication. | `A + B`<br>`A * B`<br>`A @ B` |
| `np.matmul()` | Matrix multiplication (same as @). | `np.matmul(A, B)` |
| `.T` | Gives the transpose (rows become columns). | `A.T` |
| `np.linalg.det()` | Finds the determinant of a square matrix. | `np.linalg.det(A)` |
| `np.linalg.inv()` | Finds the inverse of a square matrix. | `np.linalg.inv(A)` |
| `np.random.seed()` | Fixes the random numbers so results repeat. | `np.random.seed(42)` |
| `np.random.rand()` | Random decimals between 0 and 1. | `np.random.rand(n)` |
| `np.random.randint()` | Random whole numbers (stop is not included). | `np.random.randint(low, high, size)` |
| `np.random.normal()` | Random numbers from a normal distribution. | `np.random.normal(mean, std, size)` |

---

## 2. Pandas

🟣 *Tables of data in Python*

### A. Code Written in the Lab (with Output)

#### 1. Creating a Series and a DataFrame

```python
import pandas as pd
marks = pd.Series([45, 88, 90, 87])
students = pd.DataFrame({
    "Name": ["Ram", "Shyam", "Hari", "Sita", "Gita", "Rita", "Shyammm"],
    "Age": [20, 21, 18, 22, 10, 40, 90],
    "Marks": [56, 34, 21, 50, 19, 90, 19]
})
```

```python
print(marks)
print()
print(students)
```

Output:

```text
0    45
1    88
2    90
3    87
dtype: int64

      Name  Age  Marks
0      Ram   20     56
1    Shyam   21     34
2     Hari   18     21
3     Sita   22     50
4     Gita   10     19
5     Rita   40     90
6  Shyammm   90     19
```

#### 2. Looking at the data

```python
print(students.head())
```

Output:

```text
    Name  Age  Marks
0    Ram   20     56
1  Shyam   21     34
2   Hari   18     21
3   Sita   22     50
4   Gita   10     19
```

```python
print(students.tail())
```

Output:

```text
      Name  Age  Marks
2     Hari   18     21
3     Sita   22     50
4     Gita   10     19
5     Rita   40     90
6  Shyammm   90     19
```

```python
print(students.shape)
```

Output:

```text
(7, 3)
```

```python
print(students.columns)
```

Output:

```text
Index(['Name', 'Age', 'Marks'], dtype='str')
```

```python
print(students.dtypes)
```

Output:

```text
Name       str
Age      int64
Marks    int64
dtype: object
```

```python
students.info()
```

Output:

```text
<class 'pandas.DataFrame'>
RangeIndex: 7 entries, 0 to 6
Data columns (total 3 columns):
 #   Column  Non-Null Count  Dtype
---  ------  --------------  -----
 0   Name    7 non-null      str  
 1   Age     7 non-null      int64
 2   Marks   7 non-null      int64
dtypes: int64(2), str(1)
memory usage: 300.0 bytes
```

```python
print(students.describe())
```

Output:

```text
             Age      Marks
count   7.000000   7.000000
mean   31.571429  41.285714
std    27.299922  26.215226
min    10.000000  19.000000
25%    19.000000  20.000000
50%    21.000000  34.000000
75%    31.000000  53.000000
max    90.000000  90.000000
```

#### 3. Selecting columns and rows

```python
print(students["Name"])
```

Output:

```text
0        Ram
1      Shyam
2       Hari
3       Sita
4       Gita
5       Rita
6    Shyammm
Name: Name, dtype: str
```

```python
print(students[["Name", "Marks"]])
```

Output:

```text
      Name  Marks
0      Ram     56
1    Shyam     34
2     Hari     21
3     Sita     50
4     Gita     19
5     Rita     90
6  Shyammm     19
```

```python
print(students.loc[0:3]) # loc selects by index/column labels
```

Output:

```text
    Name  Age  Marks
0    Ram   20     56
1  Shyam   21     34
2   Hari   18     21
3   Sita   22     50
```

```python
print(students.iloc[0:2]) # iloc selects by integer position
```

Output:

```text
    Name  Age  Marks
0    Ram   20     56
1  Shyam   21     34
```

```python
# Select rows and coumns together
print(students.loc[0:2, ["Name", "Marks"]])
```

Output:

```text
    Name  Marks
0    Ram     56
1  Shyam     34
2   Hari     21
```

#### 4. Filtering rows

```python
high = students[students["Marks"]>70]
print(high)
```

Output:

```text
   Name  Age  Marks
5  Rita   40     90
```

#### 5. Adding a new column

```python
students["Result"] = np.where(students["Marks"]>=40, "Pass", "Fail")
```

```python
students
```

Output:

```text
      Name  Age  Marks Result
0      Ram   20     56   Pass
1    Shyam   21     34   Fail
2     Hari   18     21   Fail
3     Sita   22     50   Pass
4     Gita   10     19   Fail
5     Rita   40     90   Pass
6  Shyammm   90     19   Fail
```

#### 6. Sorting and statistics

```python
print(students.sort_values("Marks", ascending=False))
```

Output:

```text
      Name  Age  Marks Result
5     Rita   40     90   Pass
0      Ram   20     56   Pass
3     Sita   22     50   Pass
1    Shyam   21     34   Fail
2     Hari   18     21   Fail
4     Gita   10     19   Fail
6  Shyammm   90     19   Fail
```

```python
print(students["Marks"].mean())
print(students["Marks"].std())
```

Output:

```text
41.285714285714285
26.215226400664466
```

#### 7. Missing values

```python
data = {
    "Name": ["Ram", "Shyam", "Hari", "Sita"],
    "Marks": [56, np.nan, 80, 54]
}

df = pd.DataFrame(data)

print(df.isna().sum())
```

Output:

```text
Name     0
Marks    1
dtype: int64
```

```python
mean_marks = df["Marks"].mean()
df["Marks"] = df["Marks"].fillna(mean_marks)
print(df)
```

Output:

```text
    Name      Marks
0    Ram  56.000000
1  Shyam  63.333333
2   Hari  80.000000
3   Sita  54.000000
```

### B. Functions Used: Use and Syntax

| Function | Use (what it does) | Syntax |
|---|---|---|
| `pd.Series()` | Makes a one-column labelled list. | `pd.Series([45, 88, 90])` |
| `pd.DataFrame()` | Makes a table from a dictionary. | `pd.DataFrame({"col": [values]})` |
| `head()` | Shows the first rows (5 by default). | `df.head(n)` |
| `tail()` | Shows the last rows (5 by default). | `df.tail(n)` |
| `shape` | Gives (rows, columns) of the table. | `df.shape` |
| `columns` | Lists the column names. | `df.columns` |
| `dtypes` | Shows the data type of each column. | `df.dtypes` |
| `info()` | Prints a short summary: columns, types, missing values. | `df.info()` |
| `describe()` | Gives count, mean, std, min, quartiles and max. | `df.describe()` |
| `df["col"]` | Selects one column or many columns. | `df["Name"]`<br>`df[["Name", "Marks"]]` |
| `loc[]` | Selects by label. The end label is included. | `df.loc[rows, columns]` |
| `iloc[]` | Selects by position. The end position is not included. | `df.iloc[start:stop]` |
| `Filtering` | Keeps only rows that match a condition. | `df[df["Marks"] > 70]` |
| `np.where()` | Fills a new column using an if-else rule. | `np.where(condition, value_if_true, value_if_false)` |
| `sort_values()` | Sorts the table by a column. | `df.sort_values("Marks", ascending=False)` |
| `mean() / std()` | Average and standard deviation of a column. | `df["Marks"].mean()`<br>`df["Marks"].std()` |
| `isna().sum()` | Counts missing values in each column. | `df.isna().sum()` |
| `fillna()` | Replaces missing values with a chosen value. | `df["Marks"].fillna(value)` |

---

## Conclusion

In this lab I learned how to use NumPy for fast number work and Pandas for handling and cleaning table data. These two libraries work together and are the base of data analysis in Python.
