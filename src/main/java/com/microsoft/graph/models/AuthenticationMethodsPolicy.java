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
import com.microsoft.graph.models.AuthenticationMethodsPolicyMigrationState;
import com.microsoft.graph.models.RegistrationEnforcement;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.AuthenticationMethodConfigurationCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication Methods Policy.
 */
public class AuthenticationMethodsPolicy extends Entity implements IJsonBackedObject {


    /**
     * The Description.
     * A description of the policy. Read-only.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * The name of the policy. Read-only.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Last Modified Date Time.
     * The date and time of the last update to the policy. Read-only.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Policy Migration State.
     * The state of migration of the authentication methods policy from the legacy multifactor authentication and self-service password reset (SSPR) policies. The possible values are: premigration - means the authentication methods policy is used for authentication only, legacy policies are respected. migrationInProgress - means the authentication methods policy is used for both authentication and SSPR, legacy policies are respected. migrationComplete - means the authentication methods policy is used for authentication and SSPR, legacy policies are ignored. unknownFutureValue - Evolvable enumeration sentinel value. Do not use.
     */
    @SerializedName(value = "policyMigrationState", alternate = {"PolicyMigrationState"})
    @Expose
	@Nullable
    public AuthenticationMethodsPolicyMigrationState policyMigrationState;

    /**
     * The Policy Version.
     * The version of the policy in use. Read-only.
     */
    @SerializedName(value = "policyVersion", alternate = {"PolicyVersion"})
    @Expose
	@Nullable
    public String policyVersion;

    /**
     * The Reconfirmation In Days.
     * 
     */
    @SerializedName(value = "reconfirmationInDays", alternate = {"ReconfirmationInDays"})
    @Expose
	@Nullable
    public Integer reconfirmationInDays;

    /**
     * The Registration Enforcement.
     * Enforce registration at sign-in time. This property can be used to remind users to set up targeted authentication methods.
     */
    @SerializedName(value = "registrationEnforcement", alternate = {"RegistrationEnforcement"})
    @Expose
	@Nullable
    public RegistrationEnforcement registrationEnforcement;

    /**
     * The Authentication Method Configurations.
     * Represents the settings for each authentication method. Automatically expanded on GET /policies/authenticationMethodsPolicy.
     */
    @SerializedName(value = "authenticationMethodConfigurations", alternate = {"AuthenticationMethodConfigurations"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.AuthenticationMethodConfigurationCollectionPage authenticationMethodConfigurations;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("authenticationMethodConfigurations")) {
            authenticationMethodConfigurations = serializer.deserializeObject(json.get("authenticationMethodConfigurations"), com.microsoft.graph.requests.AuthenticationMethodConfigurationCollectionPage.class);
        }
    }
}
