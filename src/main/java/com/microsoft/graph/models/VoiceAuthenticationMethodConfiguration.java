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
import com.microsoft.graph.models.AuthenticationMethodConfiguration;
import com.microsoft.graph.requests.AuthenticationMethodTargetCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Voice Authentication Method Configuration.
 */
public class VoiceAuthenticationMethodConfiguration extends AuthenticationMethodConfiguration implements IJsonBackedObject {


    /**
     * The Is Office Phone Allowed.
     * true if users can register office phones, otherwise, false.
     */
    @SerializedName(value = "isOfficePhoneAllowed", alternate = {"IsOfficePhoneAllowed"})
    @Expose
	@Nullable
    public Boolean isOfficePhoneAllowed;

    /**
     * The Include Targets.
     * A collection of groups that are enabled to use the authentication method. Expanded by default.
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
