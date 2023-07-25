// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Teamwork;
import com.microsoft.graph.models.TeamworkActivityTopic;
import com.microsoft.graph.models.ItemBody;
import com.microsoft.graph.models.KeyValuePair;
import com.microsoft.graph.models.TeamworkNotificationRecipient;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.TeamworkSendActivityNotificationToRecipientsParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teamwork Request Builder.
 */
public class TeamworkRequestBuilder extends BaseRequestBuilder<Teamwork> {

    /**
     * The request builder for the Teamwork
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamworkRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the TeamworkRequest instance
     */
    @Nonnull
    public TeamworkRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the TeamworkRequest instance
     */
    @Nonnull
    public TeamworkRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.TeamworkRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the WorkforceIntegration collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.WorkforceIntegrationCollectionRequestBuilder workforceIntegrations() {
        return new com.microsoft.graph.requests.WorkforceIntegrationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("workforceIntegrations"), getClient(), null);
    }

    /**
     * Gets a request builder for the WorkforceIntegration item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.WorkforceIntegrationRequestBuilder workforceIntegrations(@Nonnull final String id) {
        return new com.microsoft.graph.requests.WorkforceIntegrationRequestBuilder(getRequestUrlWithAdditionalSegment("workforceIntegrations") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeletedTeam collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.DeletedTeamCollectionRequestBuilder deletedTeams() {
        return new com.microsoft.graph.requests.DeletedTeamCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deletedTeams"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeletedTeam item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.DeletedTeamRequestBuilder deletedTeams(@Nonnull final String id) {
        return new com.microsoft.graph.requests.DeletedTeamRequestBuilder(getRequestUrlWithAdditionalSegment("deletedTeams") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for TeamsAppSettings
     *
     * @return the TeamsAppSettingsRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.TeamsAppSettingsRequestBuilder teamsAppSettings() {
        return new com.microsoft.graph.requests.TeamsAppSettingsRequestBuilder(getRequestUrlWithAdditionalSegment("teamsAppSettings"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public TeamworkSendActivityNotificationToRecipientsRequestBuilder sendActivityNotificationToRecipients(@Nonnull final TeamworkSendActivityNotificationToRecipientsParameterSet parameters) {
        return new TeamworkSendActivityNotificationToRecipientsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sendActivityNotificationToRecipients"), getClient(), null, parameters);
    }
}
