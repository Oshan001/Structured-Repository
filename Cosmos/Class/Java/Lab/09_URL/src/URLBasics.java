// Program to demonstrate the basic usage of the URL class in Java
// Importing the java.net package to use the URL class
import java.net.URL;

public class URLBasics {
    public static void main(String[] args) throws Exception {
        /*
         * What is URL?
         * URL (Uniform Resource Locator) is a class in java.net that represents a resource (like a website, file, or API) on the internet.
         * We can break it into parts like protocol, host, port, path, query, and reference (anchor).
         */

        // Creating a URL object with full structure: protocol, host, port, path, query, and reference
        URL url = new URL("https://www.example.com:443/docs/index.html?user=admin#section1");

        /*
         * Breaking down the components of the URL:
         * Protocol: The communication scheme (like http, https, ftp, file)
         * Host: The domain or IP address of the server
         * Port: The port number (443 for HTTPS, 80 for HTTP). Returns -1 if not specified explicitly.
         * Path: File or directory path on the server
         * Query: Part after '?' — typically used for sending parameters
         * Reference: Also called anchor — part after '#' in the URL (used to jump to a specific section)
         */

        // Print protocol (e.g., "https")
        System.out.println("Protocol: " + url.getProtocol());  // Output: https

        // Print domain or server name
        System.out.println("Host: " + url.getHost());          // Output: www.example.com

        // Print port number if specified
        System.out.println("Port: " + url.getPort());          // Output: 443

        // Print the path after domain
        System.out.println("Path: " + url.getPath());          // Output: /docs/index.html

        // Print the query string (parameters after '?')
        System.out.println("Query: " + url.getQuery());        // Output: user=admin

        // Print the anchor (after '#')
        System.out.println("Reference: " + url.getRef());      // Output: section1

        // Print file = path + query
        System.out.println("File: " + url.getFile());          // Output: /docs/index.html?user=admin

        // Print authority = host + port (if any)
        System.out.println("Authority: " + url.getAuthority()); // Output: www.example.com:443

        // Convert URL to URI object
        System.out.println("URI Object: " + url.toURI());

        // Print hash code of the URL object
        System.out.println("Hash code: " + url.hashCode());

        /*
         * Note:
         * - This program does not make an internet connection.
         * - It's just breaking down the structure of a given URL string.
         * - If you provide an invalid URL format, it will throw a MalformedURLException (handled via throws Exception).
         *
         * Additional Notes:
         * - File: This returns the full path including the query string (everything after domain).
         * - Authority: This gives the full authority part — usually "host:port".
         * - URI Object: You can convert a URL into a URI for use with java.net.URI which supports relative paths and more.
         * - Hash Code: Each URL object has a unique hash code that helps when used in hash-based collections (like HashMap).
         */
        // URI Object: A URI (Uniform Resource Identifier) is a more general form of a URL.
        // It can represent both absolute and relative references (e.g., "docs/page.html").
        // Converting URL to URI allows operations like path normalization, resolving relative paths, and comparison.
        // All URLs are URIs, but not all URIs are URLs.
    }
}