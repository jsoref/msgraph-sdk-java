package com.microsoft.graph.teamwork.deletedteams.item.channels.item.messages.item.hostedcontents.item;

import com.microsoft.graph.models.ChatMessageHostedContent;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.teamwork.deletedteams.item.channels.item.messages.item.hostedcontents.item.value.ContentRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the hostedContents property of the microsoft.graph.chatMessage entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChatMessageHostedContentItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the media for the teamwork entity.
     */
    @jakarta.annotation.Nonnull
    public ContentRequestBuilder content() {
        return new ContentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ChatMessageHostedContentItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ChatMessageHostedContentItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/teamwork/deletedTeams/{deletedTeam%2Did}/channels/{channel%2Did}/messages/{chatMessage%2Did}/hostedContents/{chatMessageHostedContent%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ChatMessageHostedContentItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ChatMessageHostedContentItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/teamwork/deletedTeams/{deletedTeam%2Did}/channels/{channel%2Did}/messages/{chatMessage%2Did}/hostedContents/{chatMessageHostedContent%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property hostedContents for teamwork
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property hostedContents for teamwork
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Retrieve the properties and relationships of chatMessageHostedContent object. This API is available in the following national cloud deployments.
     * @return a ChatMessageHostedContent
     * @see <a href="https://learn.microsoft.com/graph/api/chatmessagehostedcontent-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ChatMessageHostedContent get() {
        return get(null);
    }
    /**
     * Retrieve the properties and relationships of chatMessageHostedContent object. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ChatMessageHostedContent
     * @see <a href="https://learn.microsoft.com/graph/api/chatmessagehostedcontent-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ChatMessageHostedContent get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ChatMessageHostedContent::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property hostedContents in teamwork
     * @param body The request body
     * @return a ChatMessageHostedContent
     */
    @jakarta.annotation.Nullable
    public ChatMessageHostedContent patch(@jakarta.annotation.Nonnull final ChatMessageHostedContent body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property hostedContents in teamwork
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ChatMessageHostedContent
     */
    @jakarta.annotation.Nullable
    public ChatMessageHostedContent patch(@jakarta.annotation.Nonnull final ChatMessageHostedContent body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ChatMessageHostedContent::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property hostedContents for teamwork
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property hostedContents for teamwork
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Retrieve the properties and relationships of chatMessageHostedContent object. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the properties and relationships of chatMessageHostedContent object. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property hostedContents in teamwork
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ChatMessageHostedContent body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property hostedContents in teamwork
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ChatMessageHostedContent body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a ChatMessageHostedContentItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ChatMessageHostedContentItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ChatMessageHostedContentItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Retrieve the properties and relationships of chatMessageHostedContent object. This API is available in the following national cloud deployments.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
