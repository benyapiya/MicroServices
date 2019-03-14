package com.sa.web.dto;

public class SentimentDto {

    private String sentence;
    private String polarity;

    public SentimentDto() {
    }

    public SentimentDto(String sentence, String polarity) {
        this.sentence = sentence;
        this.polarity = polarity;
    }

    public String getSentence() {

        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public float getPolarity() {
        return polarity;
    }

    public void setPolarity(String polarity) {
        this.polarity = polarity;
    }

    @Override
    public String toString() {
        return "SentimentDto{" +
                "sentence='" + sentence + '\'' +
                ", polarity=" + polarity +
                '}';
    }
}
