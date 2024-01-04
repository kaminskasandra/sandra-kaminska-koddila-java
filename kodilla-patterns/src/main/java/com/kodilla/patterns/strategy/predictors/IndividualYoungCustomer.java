package com.kodilla.patterns.strategy.predictors;

import com.kodilla.patterns.strategy.predictors.AggressivePredictor;
import com.kodilla.patterns.strategy.predictors.Customer;

public final class IndividualYoungCustomer extends Customer {

    public IndividualYoungCustomer(String name) {
        super(name);
        this.buyPredictor = new AggressivePredictor();
    }
}