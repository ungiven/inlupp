package biz.seal.inlupp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLHandler {

    public String content;
    public String url;

    public URLHandler(String url) {
        StringBuilder content = new StringBuilder();
        this.url = url;

        try {
            URL source = new URL(url);
            URLConnection c = source.openConnection();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c.getInputStream()));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                content.append(line + "\n");
            }
            bufferedReader.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        this.content = content.toString();
    }

    public String getContent() {
        return this.content;
    }

    public String getURL() {
        return this.url;
    }

    public String toString() {
        return this.url + "\n" + this.content;
    }
}
