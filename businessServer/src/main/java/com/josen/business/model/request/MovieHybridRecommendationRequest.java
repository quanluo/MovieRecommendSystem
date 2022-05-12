package com.josen.business.model.request;

/**
 * @author tongyi
 * @data 2022/2/01
 */
public class MovieHybridRecommendationRequest {
    private int mid;

    private int sum;

    public MovieHybridRecommendationRequest(int mid, int sum) {
        this.mid = mid;
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }
}
