package com.josen.business.model.request;

/**
 * @author tongyi
 * @data 2022/2/01
 */
public class SearchRecommendationRequest {
    private String text;

    private int sum;

    public SearchRecommendationRequest(String text, int sum) {
        this.text = text;
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
