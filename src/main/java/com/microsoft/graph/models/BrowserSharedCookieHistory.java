// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.IdentitySet;
import com.microsoft.graph.models.BrowserSharedCookieSourceEnvironment;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Browser Shared Cookie History.
 */
public class BrowserSharedCookieHistory implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Comment.
     * The comment for the shared cookie.
     */
    @SerializedName(value = "comment", alternate = {"Comment"})
    @Expose
	@Nullable
    public String comment;

    /**
     * The Display Name.
     * The name of the cookie.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Host Only.
     * Controls whether a cookie is a host-only or domain cookie.
     */
    @SerializedName(value = "hostOnly", alternate = {"HostOnly"})
    @Expose
	@Nullable
    public Boolean hostOnly;

    /**
     * The Host Or Domain.
     * The URL of the cookie.
     */
    @SerializedName(value = "hostOrDomain", alternate = {"HostOrDomain"})
    @Expose
	@Nullable
    public String hostOrDomain;

    /**
     * The Last Modified By.
     * The user who last modified the cookie.
     */
    @SerializedName(value = "lastModifiedBy", alternate = {"LastModifiedBy"})
    @Expose
	@Nullable
    public IdentitySet lastModifiedBy;

    /**
     * The Path.
     * The path of the cookie.
     */
    @SerializedName(value = "path", alternate = {"Path"})
    @Expose
	@Nullable
    public String path;

    /**
     * The Published Date Time.
     * The date and time when the cookie was last published.
     */
    @SerializedName(value = "publishedDateTime", alternate = {"PublishedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime publishedDateTime;

    /**
     * The Source Environment.
     * Specifies how the cookies are shared between Microsoft Edge and Internet Explorer. The possible values are: microsoftEdge, internetExplorer11, both, unknownFutureValue.
     */
    @SerializedName(value = "sourceEnvironment", alternate = {"SourceEnvironment"})
    @Expose
	@Nullable
    public BrowserSharedCookieSourceEnvironment sourceEnvironment;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
