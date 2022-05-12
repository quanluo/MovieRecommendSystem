package com.josen.business.model.request;

/**
 * @author tongyi
 * @data 2022/2/01
 */
public class UserRecommendationRequest {
    private int uid;

    private int sum;

    public UserRecommendationRequest(int uid, int sum) {
        this.uid = uid;
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}
