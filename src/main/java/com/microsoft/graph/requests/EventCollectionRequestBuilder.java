// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Group;
import com.microsoft.graph.models.Event;
import com.microsoft.graph.models.TimeSlot;
import com.microsoft.graph.models.Recipient;
import com.microsoft.graph.models.DateTimeTimeZone;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.EventCollectionRequestBuilder;
import com.microsoft.graph.requests.EventRequestBuilder;
import com.microsoft.graph.requests.EventCollectionRequest;
import com.microsoft.graph.requests.EventDeltaCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.EventCancelParameterSet;
import com.microsoft.graph.models.EventAcceptParameterSet;
import com.microsoft.graph.models.EventDeclineParameterSet;
import com.microsoft.graph.models.EventForwardParameterSet;
import com.microsoft.graph.models.EventSnoozeReminderParameterSet;
import com.microsoft.graph.models.EventTentativelyAcceptParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Event Collection Request Builder.
 */
public class EventCollectionRequestBuilder extends BaseCollectionRequestBuilder<Event, EventRequestBuilder, EventCollectionResponse, EventCollectionPage, EventCollectionRequest> {

    /**
     * The request builder for this collection of Group
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EventCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EventRequestBuilder.class, EventCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public EventDeltaCollectionRequestBuilder delta() {
        return new EventDeltaCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.delta"), getClient(), null);
    }

    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}
