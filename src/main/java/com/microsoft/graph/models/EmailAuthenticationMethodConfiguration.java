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
import com.microsoft.graph.models.ExternalEmailOtpState;
import com.microsoft.graph.models.AuthenticationMethodConfiguration;
import com.microsoft.graph.requests.AuthenticationMethodTargetCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Email Authentication Method Configuration.
 */
public class EmailAuthenticationMethodConfiguration extends AuthenticationMethodConfiguration implements IJsonBackedObject {


    /**
     * The Allow External Id To Use Email Otp.
     * Determines whether email OTP is usable by external users for authentication. Possible values are: default, enabled, disabled, unknownFutureValue. Tenants in the default state who didn't use public preview have email OTP enabled beginning in October 2021.
     */
    @SerializedName(value = "allowExternalIdToUseEmailOtp", alternate = {"AllowExternalIdToUseEmailOtp"})
    @Expose
	@Nullable
    public ExternalEmailOtpState allowExternalIdToUseEmailOtp;

    /**
     * The Include Targets.
     * A collection of groups that are enabled to use the authentication method.
     */
    @SerializedName(value = "includeTargets", alternate = {"IncludeTargets"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.AuthenticationMethodTargetCollectionPage includeTargets;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("includeTargets")) {
            includeTargets = serializer.deserializeObject(json.get("includeTargets"), com.microsoft.graph.requests.AuthenticationMethodTargetCollectionPage.class);
        }
    }
}
