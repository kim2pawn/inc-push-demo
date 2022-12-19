/*
 * Copyright 2022 Webull Technologies Pte. Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.webull.openapi.trade.api.response;

public class HoldingInfo {

    private String instrumentId;
    private String symbol;
    private String instrumentType;
    private String shortName;

    private String currency;
    private String unitCost;

    private Integer qty;
    private String totalCost;
    private String lastPrice;
    private String marketValue;
    private String unrealizedProfitLoss;
    private String unrealizedProfitLossRate;
    private String holdingProportion;

    public String getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(String instrumentId) {
        this.instrumentId = instrumentId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(String unitCost) {
        this.unitCost = unitCost;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    public String getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(String lastPrice) {
        this.lastPrice = lastPrice;
    }

    public String getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(String marketValue) {
        this.marketValue = marketValue;
    }

    public String getUnrealizedProfitLoss() {
        return unrealizedProfitLoss;
    }

    public void setUnrealizedProfitLoss(String unrealizedProfitLoss) {
        this.unrealizedProfitLoss = unrealizedProfitLoss;
    }

    public String getUnrealizedProfitLossRate() {
        return unrealizedProfitLossRate;
    }

    public void setUnrealizedProfitLossRate(String unrealizedProfitLossRate) {
        this.unrealizedProfitLossRate = unrealizedProfitLossRate;
    }

    public String getHoldingProportion() {
        return holdingProportion;
    }

    public void setHoldingProportion(String holdingProportion) {
        this.holdingProportion = holdingProportion;
    }

    @Override
    public String toString() {
        return "HoldingInfo{" +
                "instrumentId='" + instrumentId + '\'' +
                ", symbol='" + symbol + '\'' +
                ", instrumentType='" + instrumentType + '\'' +
                ", shortName='" + shortName + '\'' +
                ", currency='" + currency + '\'' +
                ", unitCost='" + unitCost + '\'' +
                ", qty=" + qty +
                ", totalCost='" + totalCost + '\'' +
                ", lastPrice='" + lastPrice + '\'' +
                ", marketValue='" + marketValue + '\'' +
                ", unrealizedProfitLoss='" + unrealizedProfitLoss + '\'' +
                ", unrealizedProfitLossRate='" + unrealizedProfitLossRate + '\'' +
                ", holdingProportion='" + holdingProportion + '\'' +
                '}';
    }
}
