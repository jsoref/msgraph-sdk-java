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
import com.microsoft.graph.models.ExternalDomainName;
import com.microsoft.graph.models.SamlOrWsFedProvider;
import com.microsoft.graph.requests.ExternalDomainNameCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Saml Or Ws Fed External Domain Federation.
 */
public class SamlOrWsFedExternalDomainFederation extends SamlOrWsFedProvider implements IJsonBackedObject {


    /**
     * The Domains.
     * Collection of domain names of the external organizations that the tenant is federating with. Supports $filter (eq).
     */
    @SerializedName(value = "domains", alternate = {"Domains"})
    @Expose
	@Nullable
    public ExternalDomainNameCollectionPage domains;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("domains")) {
            domains = serializer.deserializeObject(json.get("domains"), ExternalDomainNameCollectionPage.class);
        }
    }
}