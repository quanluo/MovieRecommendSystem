package com.josen.business.model.request;

/**
 * @author tongyi
 * @data 2022/2/01
 */
public class RateMoreRecommendationRequest {

    private int sum;

    public RateMoreRecommendationRequest(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
