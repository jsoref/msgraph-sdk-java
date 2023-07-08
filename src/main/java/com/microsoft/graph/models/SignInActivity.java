// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sign In Activity.
 */
public class SignInActivity implements IJsonBackedObject {

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
     * The Last Non Interactive Sign In Date Time.
     * The last non-interactive sign-in date for a specific user. You can use this field to calculate the last time a client attempted to sign into the directory on behalf of a user. Because some users may use clients to access tenant resources rather than signing into your tenant directly, you can use the non-interactive sign-in date to along with lastSignInDateTime to identify inactive users. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is: '2014-01-01T00:00:00Z'. Azure AD maintains non-interactive sign-ins going back to May 2020. For more information about using the value of this property, see Manage inactive user accounts in Azure AD.
     */
    @SerializedName(value = "lastNonInteractiveSignInDateTime", alternate = {"LastNonInteractiveSignInDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastNonInteractiveSignInDateTime;

    /**
     * The Last Non Interactive Sign In Request Id.
     * Request identifier of the last non-interactive sign-in performed by this user.
     */
    @SerializedName(value = "lastNonInteractiveSignInRequestId", alternate = {"LastNonInteractiveSignInRequestId"})
    @Expose
	@Nullable
    public String lastNonInteractiveSignInRequestId;

    /**
     * The Last Sign In Date Time.
     * The last interactive sign-in date and time for a specific user. You can use this field to calculate the last time a user attempted to sign into the directory with an interactive authentication method. This field can be used to build reports, such as inactive users. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is: '2014-01-01T00:00:00Z'. Azure AD maintains interactive sign-ins going back to April 2020. For more information about using the value of this property, see Manage inactive user accounts in Azure AD.
     */
    @SerializedName(value = "lastSignInDateTime", alternate = {"LastSignInDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastSignInDateTime;

    /**
     * The Last Sign In Request Id.
     * Request identifier of the last interactive sign-in performed by this user.
     */
    @SerializedName(value = "lastSignInRequestId", alternate = {"LastSignInRequestId"})
    @Expose
	@Nullable
    public String lastSignInRequestId;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}