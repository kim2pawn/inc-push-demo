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
package com.webull.openapi.trade.api;

import com.webull.openapi.trade.api.request.StockOrder;
import com.webull.openapi.trade.api.response.Account;
import com.webull.openapi.trade.api.response.AccountBalance;
import com.webull.openapi.trade.api.response.AccountDetail;
import com.webull.openapi.trade.api.response.AccountPositions;
import com.webull.openapi.trade.api.response.InstrumentInfo;
import com.webull.openapi.trade.api.response.Order;
import com.webull.openapi.trade.api.response.OrderResponse;
import com.webull.openapi.trade.api.response.Orders;

import java.util.List;

public interface TradeApiService {

    List<Account> getAccountList(String subscriptionId);

    AccountDetail getAccountDetail(String accountId);

    AccountBalance getAccountBalance(String accountId, String totalAssetCurrency);

    AccountPositions getAccountPositions(String accountId, Integer pageSize, String lastInstrumentId);

    OrderResponse placeOrder(String accountId, StockOrder stockOrder);

    OrderResponse replaceOrder(String accountId, StockOrder stockOrder);

    OrderResponse cancelOrder(String accountId, String clientOrderId);

    Orders getDayOrders(String accountId, Integer pageSize, String lastClientOrderId);

    Orders getOpenedOrders(String accountId, Integer pageSize, String lastClientOrderId);

    Order getOrderDetails(String accountId, String clientOrderId);

    InstrumentInfo getTradeInstrument(String instrumentId);

}