package ru.gb.springbootlesson3.documentation;

import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.URL;

public class Mainit {
    public static void main(String[] args) throws IOException, ParseException {
        ReadFromApiDocs r = new ReadFromApiDocs();
        r.URLReader(new URL("http://localhost:8080/v3/api-docs"));
    }
}
