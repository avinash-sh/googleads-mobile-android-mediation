/*
 * Copyright (C) 2016 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.ads.mediation.sample.adapter;

import com.google.android.gms.ads.reward.RewardItem;

/**
 * A {@link RewardItem} that maps the sample reward type and reward amount.
 */
public class SampleRewardItem implements RewardItem {
    private String mRewardType;
    private int mRewardAmount;

    /**
     * Creates a {@link SampleRewardItem}.
     *
     * @param rewardType   the sample reward type.
     * @param rewardAmount the sample reward amount.
     */
    public SampleRewardItem(String rewardType, int rewardAmount) {
        this.mRewardType = rewardType;
        this.mRewardAmount = rewardAmount;
    }

    @Override
    public String getType() {
        return mRewardType;
    }

    @Override
    public int getAmount() {
        return mRewardAmount;
    }
}