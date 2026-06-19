import java.net.URL;
import java.net.URLConnection;
import java.io.*;

/*
     URLConnection in Java
    ------------------------
    Purpose:
    - To connect to a web resource (like a website or file) via a URL.
    - Allows reading data from the remote server using input streams.

    This Example:
    - Connects to `https://www.example.com`
    - Reads and prints the entire HTML content of the page.

    Important Classes:
    - URL: Represents a Uniform Resource Locator.
    - URLConnection: A communication link between the Java program and the URL resource.
    - InputStreamReader + BufferedReader: For reading the content from the connection.

    How it works step-by-step:
    1. Create a URL object for the target site.
    2. Open a connection using `openConnection()` → returns a `URLConnection` object.
    3. Get input stream from the connection to read the data.
    4. Use `BufferedReader` to read the input line by line (HTML source).
    5. Print each line until the end.
    6. Close the stream when done.

    Limitations:
    - ⚠️ This only works for **static content** (like plain HTML).
    - ❌ Cannot handle dynamic or JavaScript-rendered pages (like modern SPAs).
    - ❌ Does not support HTTP headers, cookies, or POST requests directly.
    - ❌ Cannot handle HTTPS-specific handshake configs (like ignoring SSL warnings) without extra setup.

    Better Alternatives for Dynamic/Advanced Web Access:
    - Use `HttpURLConnection` for more control (headers, POST, cookies, etc.)
    - Use libraries like:
        ✅ [Apache HttpClient](https://hc.apache.org/)
        ✅ [Jsoup](https://jsoup.org/) for parsing HTML content
        ✅ [OkHttp](https://square.github.io/okhttp/) for modern web APIs
*/

public class URLConnectionDemo {
    public static void main(String[] args) throws Exception {

        // Create a URL object for the desired website
        URL url = new URL("https://www.example.com");

        // Open a connection to that URL
        URLConnection connection = url.openConnection();

        // Wrap the input stream in a reader to read text line-by-line
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        // Read and print each line of HTML from the website
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line); // Output one line at a time
        }

        // Close the reader once reading is complete
        reader.close();
    }
}