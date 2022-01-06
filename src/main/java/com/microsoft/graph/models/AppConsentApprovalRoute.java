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
import com.microsoft.graph.models.AppConsentRequest;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.AppConsentRequestCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the App Consent Approval Route.
 */
public class AppConsentApprovalRoute extends Entity implements IJsonBackedObject {


    /**
     * The App Consent Requests.
     * A collection of userConsentRequest objects for a specific application.
     */
    @SerializedName(value = "appConsentRequests", alternate = {"AppConsentRequests"})
    @Expose
	@Nullable
    public AppConsentRequestCollectionPage appConsentRequests;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("appConsentRequests")) {
            appConsentRequests = serializer.deserializeObject(json.get("appConsentRequests"), AppConsentRequestCollectionPage.class);
        }
    }
}
