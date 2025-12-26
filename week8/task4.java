interface Printable {
    void print (String doc);
}

interface Scannable {
    void scan (String doc);
}

class SimplePrinter implements Printable {
    public void print(String doc) {
        System.out.println("Printing: " + doc);
    }
}

class AllInOne implements Printable, Scannable {
    public void print(String doc) {
        System.out.println("Printing: " + doc);
    }

    public void scan(String doc) {
        System.out.println("Scanning: " + doc);
    }
}
