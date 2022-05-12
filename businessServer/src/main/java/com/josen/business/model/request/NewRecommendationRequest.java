package com.josen.business.model.request;

/**
 * @author tongyi
 * @data 2022/2/01
 */
public class NewRecommendationRequest {

    private int sum;

    public NewRecommendationRequest(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
