package com.kodilla.patterns.strategy.predictors;

import com.kodilla.patterns.strategy.predictors.BuyPredictor;

public final class ConservativePredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Conservative predictor] Buy debentures of XYZ";
    }
}