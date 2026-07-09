# 🌐 Introduction to HTML

HTML (**HyperText Markup Language**) is the standard language used to create web pages and websites.

---

## 📌 Key Points
- HTML is used to structure content on the web.
- It helps create headings, paragraphs, images, links, tables, forms, and more.
- HTML works with:
  - **CSS** → styling
  - **JavaScript** → functionality

---

# 🏗️ Basic Structure of HTML

- HTML documents follow a basic structure.
- `<html>` is the root element.
- `<head>` contains page information.
- `<body>` contains visible content.

```html
<!DOCTYPE html>
<html>
  <head>
    <title>My Website</title>
  </head>

  <body>
    <h1>Hello World</h1>
  </body>
</html>
```

---

# 🏷️ HTML Tags and Attributes

## 📖 What are HTML Tags?

- HTML tags define webpage elements.
- Tags are written inside `< >`.

### 🔹 Examples

```html
<html>
<head>
<h1>
<p>
```

---

## 📖 What are Attributes?

- Attributes provide extra information about HTML elements.
- They are written inside opening tags.

### 🔹 Example

```html
<a href="https://google.com">Visit</a>
```

---

# 📝 Important Notes

## ✅ Opening and Closing Tags

- Most HTML tags have:
  - Opening tag
  - Closing tag

```html
<p>Hello</p>
```

---

## ✅ Self-closing Tags

- Some tags do not require closing tags.

```html
<img src="image.jpg" alt="img">
<br>
<hr>
```

---

# 🟢 BASIC HTML TAGS

---

# 🔹 Heading Tags

- Heading tags are used for titles and headings.
- `<h1>` is the largest heading.
- `<h6>` is the smallest heading.

| Tag | Syntax | Preview |
|------|------|------|
| `<h1>` | `<h1>Heading 1</h1>` | <h1>Heading 1</h1> |
| `<h2>` | `<h2>Heading 2</h2>` | <h2>Heading 2</h2> |
| `<h3>` | `<h3>Heading 3</h3>` | <h3>Heading 3</h3> |
| `<h4>` | `<h4>Heading 4</h4>` | <h4>Heading 4</h4> |
| `<h5>` | `<h5>Heading 5</h5>` | <h5>Heading 5</h5> |
| `<h6>` | `<h6>Heading 6</h6>` | <h6>Heading 6</h6> |

---

# 🔹 Paragraph Tag

- The `<p>` tag is used to create paragraphs.

```html
<p>This is a paragraph</p>
```

| Tag | Syntax | Preview |
|------|------|------|
| `<p>` | `<p>This is a paragraph</p>` | <p>This is a paragraph</p> |

---

# 🔹 Line Break Tag

- The `<br>` tag moves content to the next line.

| Tag | Syntax | Preview |
|------|------|------|
| `<br>` | `Line 1 <br> Line 2` | Line 1 <br> Line 2 |

---

# 🔹 Horizontal Line Tag

- The `<hr>` tag creates a horizontal line.

| Tag | Syntax | Preview |
|------|------|------|
| `<hr>` | `<hr></hr>` | <Hr>|

---

# 🔹 Preformatted Text Tag

- The `<pre>` tag displays text exactly as written.
- It preserves spaces and line breaks.

```html
<pre>
This text
will appear
exactly as written.
</pre>
```

| Tag | Syntax | Preview |
|------|------|------|
| `<pre>` | `<pre>This text will appear exactly as written.</pre>` | <pre>This text will appear exactly as written.</pre> |

---

# 🟡 TEXT FORMATTING TAGS

- Formatting tags change the appearance of text.

| Tag | Syntax | Preview |
|------|------|------|
| `<b>` | `<b>Bold</b>` | <b>Bold</b> |
| `<i>` | `<i>Italic</i>` | <i>Italic</i> |
| `<u>` | `<u>Underline</u>` | <u>Underline</u> |
| `<strong>` | `<strong>Important</strong>` | <strong>Important</strong> |
| `<em>` | `<em>Emphasis</em>` | <em>Emphasis</em> |
| `<big>` | `<big>Big Text</big>` | <big>Big Text</big> |
| `<small>` | `<small>Small Text</small>` | <small>Small Text</small> |
| `<sub>` | `H<sub>2</sub>O` | H<sub>2</sub>O |
| `<sup>` | `x<sup>2</sup>` | x<sup>2</sup> |

---

# 🟠 LINKS & MEDIA

---

# 🔹 Anchor Tag

- The `<a>` tag creates hyperlinks.

```html
<a href="https://google.com">Visit</a>
```

| Tag | Syntax | Preview |
|------|------|------|
| `<a>` | `<a href="https://google.com">Visit</a>` | <a href="https://google.com">Visit</a> |

---

# 🔹 Image Tag

- The `<img>` tag displays images.
- `src` defines image location.
- `alt` defines alternative text.

```html
<img src="image.jpg" alt="image">
```

| Tag | Syntax | Preview |
|------|------|------|
| `<img>` | `<img src="mydog.jpg" alt="Dog">` | 🖼️ Image |

---

# 🔵 LIST TAGS

---

# 🔹 Ordered List

- `<ol>` creates numbered lists.

```html
<ol>
  <li>Item</li>
</ol>
```

| Tag | Syntax | Preview |
|------|------|------|
| `<ol>` | `<ol><li>Item</li></ol>` | <ol><li>Item</li></ol> |

---

# 🔹 Unordered List

- `<ul>` creates bullet lists.

```html
<ul>
  <li>Item</li>
</ul>
```

| Tag | Syntax | Preview |
|------|------|------|
| `<ul>` | `<ul><li>Item</li></ul>` | <ul><li>Item</li></ul> |

---

# 🔹 List Item Tag

- `<li>` defines list items.

| Tag | Syntax | Preview |
|------|------|------|
| `<li>` | `<li>Item</li>` | <li>Item</li> |

---

# 🟣 TABLE TAGS

---

# 🔹 Table Tags

- Tables are used to organize data into rows and columns.

```html
<table>
  <tr>
    <th>Name</th>
    <th>Age</th>
  </tr>

  <tr>
    <td>John</td>
    <td>20</td>
  </tr>
</table>
```

| Tag | Purpose | Preview |
|------|------|------|
| `<table>` | Table container | Table |
| `<tr>` | Table row | Row |
| `<th>` | Table heading | <table><tr><th>Name</th></tr></table> |
| `<td>` | Table data | <table><tr><td>Data</td></tr></table> |

---

# 🟤 FORM ELEMENTS

---

# 🔹 Form Tag

- The `<form>` tag creates forms for user input.

```html
<form>
</form>
```

| Tag | Syntax | Preview |
|------|------|------|
| `<form>` | `<form></form>` | Form |

---

# 🔹 Input Tag

- The `<input>` tag creates input fields.

```html
<input type="text">
```

| Tag | Syntax | Preview |
|------|------|------|
| `<input>` | `<input type="text">` | <input type="text"> |

---

# 🔹 Button Tag

- The `<button>` tag creates clickable buttons.

```html
<button>Click</button>
```

| Tag | Syntax | Preview |
|------|------|------|
| `<button>` | `<button>Click</button>` | <button>Click</button> |

---

# ⚫ LAYOUT TAGS

---

# 🔹 Div Tag

- The `<div>` tag is used for block-level layout sections.

```html
<div>Content</div>
```

| Tag | Syntax | Preview |
|------|------|------|
| `<div>` | `<div>Content</div>` | <div>Content</div> |

---

# 🔹 Span Tag

- The `<span>` tag is used for inline styling or grouping.

```html
<span>Text</span>
```

| Tag | Syntax | Preview |
|------|------|------|
| `<span>` | `<span>Text</span>` | <span>Text</span> |

---
# 🔹 Semantic Layout Tags (Header, Main, Footer)

- These tags are **semantic HTML elements** used to structure a webpage.
- They improve readability, SEO, and accessibility.

---

# 🔹 Header Tag

- The `<header>` tag is used for the top section of a webpage.
- It usually contains logo, title, or navigation.

```html
<header>
  <h1>My Website</h1>
</header>
```

| Tag | Syntax | Preview |
|------|------|------|
| `<header>` | `<header>Content</header>` | Page Header |

---

# 🔹 Main Tag

- The `<main>` tag contains the **main content** of the webpage.
- There should be only one `<main>` per page.

```html
<main>
  <p>Main content here</p>
</main>
```

| Tag | Syntax | Preview |
|------|------|------|
| `<main>` | `<main>Content</main>` | Main Content |

---

# 🔹 Footer Tag

- The `<footer>` tag is used for the bottom section of a webpage.
- It usually contains copyright or contact info.

```html
<footer>
  <p>© 2026 My Website</p>
</footer>
```

| Tag | Syntax | Preview |
|------|------|------|
| `<footer>` | `<footer>Content</footer>` | Page Footer |

---

# 🧩 Semantic HTML Tags (Table + Explanation + Code)

Semantic tags are used to give meaning to HTML structure. They make the webpage organized and easier to understand.

---

## 📌 Semantic Tags List

| Tag | Purpose | Simple Meaning |
|------|------|------|
| `<header>` | Top section of page | Website header area |
| `<nav>` | Navigation links | Menu bar |
| `<main>` | Main content | Primary page content |
| `<section>` | Group content | Related content block |
| `<article>` | Independent content | Blog/news post |
| `<aside>` | Side content | Sidebar / extra info |
| `<footer>` | Bottom section | Page footer |

---

# 🔹 Full Explanation with Code

---

# 🔹 `<header>` Tag

- Used for top section like title, logo, intro.

```html
<header>
  <h1>My Website</h1>
</header>
```

| Tag | Syntax | Purpose |
|------|------|------|
| `<header>` | `<header>Content</header>` | Top section of webpage |

---

# 🔹 `<nav>` Tag

- Used for navigation menu (links).

```html
<nav>
  <a href="#">Home</a>
  <a href="#">About</a>
</nav>
```

| Tag | Syntax | Purpose |
|------|------|------|
| `<nav>` | `<nav>Links</nav>` | Navigation menu |

---

# 🔹 `<main>` Tag

- Contains main content of webpage.

```html
<main>
  <p>Main content goes here</p>
</main>
```

| Tag | Syntax | Purpose |
|------|------|------|
| `<main>` | `<main>Content</main>` | Main page content |

---

# 🔹 `<section>` Tag

- Used to group related content.

```html
<section>
  <h2>Topics</h2>
</section>
```

| Tag | Syntax | Purpose |
|------|------|------|
| `<section>` | `<section>Content</section>` | Group of related content |

---

# 🔹 `<article>` Tag

- Used for independent content like blog/news.

```html
<article>
  <h2>HTML Basics</h2>
  <p>This is a blog post about HTML.</p>
</article>
```

| Tag | Syntax | Purpose |
|------|------|------|
| `<article>` | `<article>Content</article>` | Independent content block |

---

# 🔹 `<aside>` Tag

- Used for side content like tips or ads.

```html
<aside>
  <h3>Tip</h3>
  <p>Practice daily for better learning.</p>
</aside>
```

| Tag | Syntax | Purpose |
|------|------|------|
| `<aside>` | `<aside>Content</aside>` | Sidebar / extra info |

---

# 🔹 `<footer>` Tag

- Used for bottom section like copyright.

```html
<footer>
  <p>© 2026 My Website</p>
</footer>
```

| Tag | Syntax | Purpose |
|------|------|------|
| `<footer>` | `<footer>Content</footer>` | Bottom section of page |

---

# 🔹Example of full Semantic Tag

```html
<!DOCTYPE html>
<html>
<head>
  <title>Semantic Tags Example</title>
</head>

<body>

  <!-- HEADER: Top section of website -->
  <header>
    <h1>My Blog Website</h1>
    <p>Learn HTML step by step</p>
  </header>

  <!-- NAV: Navigation menu -->
  <nav>
    <a href="#">Home</a> |
    <a href="#">About</a> |
    <a href="#">Contact</a>
  </nav>

  <hr>

  <!-- MAIN: Main content of the page -->
  <main>

    <!-- SECTION: Group of related content -->
    <section>
      <h2>Latest Posts</h2>

      <!-- ARTICLE: Independent content -->
      <article>
        <h3>HTML Basics</h3>
        <p>HTML is used to structure web pages.</p>
      </article>

      <article>
        <h3>CSS Basics</h3>
        <p>CSS is used to style web pages.</p>
      </article>

    </section>

  </main>

  <!-- ASIDE: Side information -->
  <aside>
    <h3>Quick Tips</h3>
    <p>Practice daily to improve your skills.</p>
  </aside>

  <hr>

  <!-- FOOTER: Bottom section -->
  <footer>
    <p>© 2026 My Blog Website. All rights reserved.</p>
  </footer>

</body>
</html>
```

---

#### Semantic tags make your HTML:
- Easy to read
- Well structured
- SEO friendly
- Professional

---