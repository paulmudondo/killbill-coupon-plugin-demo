/*
 * Copyright 2014-2015 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.killbill.billing.plugin.entitlement.coupon.demo;

import org.joda.time.LocalDate;
import org.killbill.billing.catalog.api.PlanPhasePriceOverride;
import org.killbill.billing.catalog.api.PlanPhaseSpecifier;
import org.killbill.billing.entitlement.plugin.api.PriorEntitlementResult;
import org.killbill.billing.payment.api.PluginProperty;

import java.util.List;

public class DefaultPriorEntitlementResult implements PriorEntitlementResult {

    private List<PlanPhasePriceOverride> overrides;

    public DefaultPriorEntitlementResult(List<PlanPhasePriceOverride> overrides) {
        this.overrides = overrides;
    }
    @Override
    public boolean isAborted() {
        return false;
    }
    @Override
    public PlanPhaseSpecifier getAdjustedPlanPhaseSpecifier() {
        return null;
    }
    @Override
    public LocalDate getAdjustedEffectiveDate() {
        return null;
    }
    @Override
    public List<PlanPhasePriceOverride> getAdjustedPlanPhasePriceOverride() {
        return overrides;
    }
    @Override
    public Iterable<PluginProperty> getAdjustedPluginProperties() {
        return null;
    }
}