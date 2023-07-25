// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.LicenseUnitsDetail;
import com.microsoft.graph.models.ServicePlanInfo;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Subscribed Sku.
 */
public class SubscribedSku extends Entity implements IJsonBackedObject {


    /**
     * The Account Id.
     * The unique ID of the account this SKU belongs to.
     */
    @SerializedName(value = "accountId", alternate = {"AccountId"})
    @Expose
	@Nullable
    public String accountId;

    /**
     * The Account Name.
     * The name of the account this SKU belongs to.
     */
    @SerializedName(value = "accountName", alternate = {"AccountName"})
    @Expose
	@Nullable
    public String accountName;

    /**
     * The Applies To.
     * The target class for this SKU. Only SKUs with target class User are assignable. Possible values are: 'User', 'Company'.
     */
    @SerializedName(value = "appliesTo", alternate = {"AppliesTo"})
    @Expose
	@Nullable
    public String appliesTo;

    /**
     * The Capability Status.
     * Enabled indicates that the prepaidUnits property has at least one unit that is enabled. LockedOut indicates that the customer cancelled their subscription. Possible values are: Enabled, Warning, Suspended, Deleted, LockedOut.
     */
    @SerializedName(value = "capabilityStatus", alternate = {"CapabilityStatus"})
    @Expose
	@Nullable
    public String capabilityStatus;

    /**
     * The Consumed Units.
     * The number of licenses that have been assigned.
     */
    @SerializedName(value = "consumedUnits", alternate = {"ConsumedUnits"})
    @Expose
	@Nullable
    public Integer consumedUnits;

    /**
     * The Prepaid Units.
     * Information about the number and status of prepaid licenses.
     */
    @SerializedName(value = "prepaidUnits", alternate = {"PrepaidUnits"})
    @Expose
	@Nullable
    public LicenseUnitsDetail prepaidUnits;

    /**
     * The Service Plans.
     * Information about the service plans that are available with the SKU. Not nullable.
     */
    @SerializedName(value = "servicePlans", alternate = {"ServicePlans"})
    @Expose
	@Nullable
    public java.util.List<ServicePlanInfo> servicePlans;

    /**
     * The Sku Id.
     * The unique identifier (GUID) for the service SKU.
     */
    @SerializedName(value = "skuId", alternate = {"SkuId"})
    @Expose
	@Nullable
    public java.util.UUID skuId;

    /**
     * The Sku Part Number.
     * The SKU part number; for example: 'AAD_PREMIUM' or 'RMSBASIC'. To get a list of commercial subscriptions that an organization has acquired, see List subscribedSkus.
     */
    @SerializedName(value = "skuPartNumber", alternate = {"SkuPartNumber"})
    @Expose
	@Nullable
    public String skuPartNumber;

    /**
     * The Subscription Ids.
     * 
     */
    @SerializedName(value = "subscriptionIds", alternate = {"SubscriptionIds"})
    @Expose
	@Nullable
    public java.util.List<String> subscriptionIds;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
