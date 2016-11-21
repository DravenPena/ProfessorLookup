
package com.neong.voice.Classes;

public class Parser {
    private String stream;
    private Integer j;

    public Integer getI() {
        return this.j;
    }

    public void setUp(String stream_in) {
        this.stream = stream_in;
        this.j = 0;
    }

    public Boolean atEnd(String end_string, Integer i) {
        String x = "";
        return (x = x + this.stream.charAt(i)) == end_string;
    }

    public String collectToEnd(String end_string, Integer i) {
        String collected_characters = "";
        while (!this.atEnd(end_string, i).booleanValue()) {
            collected_characters = collected_characters + this.stream.substring(i, i + 1);
            Integer n = this.j;
            Integer n2 = this.j = Integer.valueOf(this.j + 1);
            n = i;
            n2 = i = Integer.valueOf(i + 1);
        }
        return collected_characters;
    }

    public String findRelativeURL() {
        Integer k = this.findLocation("ShowRatings.jsp");
        Integer length = this.stream.length();
        return this.collectToEnd(" ", k);
    }

    public Integer findLocation(String url_to_match) {
        Integer j = this.getI();
        for (int k = 0; k < this.stream.length(); ++k) {
            if (this.stream.substring(j, j + url_to_match.length()).equals(url_to_match)) {
                return j;
            }
            Integer n = j;
            Integer n2 = j = Integer.valueOf(j + 1);
        }
        return -1;
    }

    public void getresultsPage() {
        String relative_url = this.findRelativeURL();
    }
}