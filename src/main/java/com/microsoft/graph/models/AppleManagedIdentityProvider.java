// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.IdentityProviderBase;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Apple Managed Identity Provider.
 */
public class AppleManagedIdentityProvider extends IdentityProviderBase implements IJsonBackedObject {


    /**
     * The Certificate Data.
     * The certificate data which is a long string of text from the certificate, can be null.
     */
    @SerializedName(value = "certificateData", alternate = {"CertificateData"})
    @Expose
	@Nullable
    public String certificateData;

    /**
     * The Developer Id.
     * The Apple developer identifier. Required.
     */
    @SerializedName(value = "developerId", alternate = {"DeveloperId"})
    @Expose
	@Nullable
    public String developerId;

    /**
     * The Key Id.
     * The Apple key identifier. Required.
     */
    @SerializedName(value = "keyId", alternate = {"KeyId"})
    @Expose
	@Nullable
    public String keyId;

    /**
     * The Service Id.
     * The Apple service identifier. Required.
     */
    @SerializedName(value = "serviceId", alternate = {"ServiceId"})
    @Expose
	@Nullable
    public String serviceId;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}