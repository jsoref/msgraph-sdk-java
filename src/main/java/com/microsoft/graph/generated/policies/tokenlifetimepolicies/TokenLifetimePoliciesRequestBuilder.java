package com.microsoft.graph.policies.tokenlifetimepolicies;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.TokenLifetimePolicy;
import com.microsoft.graph.models.TokenLifetimePolicyCollectionResponse;
import com.microsoft.graph.policies.tokenlifetimepolicies.count.CountRequestBuilder;
import com.microsoft.graph.policies.tokenlifetimepolicies.item.TokenLifetimePolicyItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Provides operations to manage the tokenLifetimePolicies property of the microsoft.graph.policyRoot entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TokenLifetimePoliciesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tokenLifetimePolicies property of the microsoft.graph.policyRoot entity.
     * @param tokenLifetimePolicyId The unique identifier of tokenLifetimePolicy
     * @return a TokenLifetimePolicyItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public TokenLifetimePolicyItemRequestBuilder byTokenLifetimePolicyId(@jakarta.annotation.Nonnull final String tokenLifetimePolicyId) {
        Objects.requireNonNull(tokenLifetimePolicyId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("tokenLifetimePolicy%2Did", tokenLifetimePolicyId);
        return new TokenLifetimePolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new TokenLifetimePoliciesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TokenLifetimePoliciesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/policies/tokenLifetimePolicies{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new TokenLifetimePoliciesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TokenLifetimePoliciesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/policies/tokenLifetimePolicies{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Get a list of tokenLifetimePolicy objects.
     * @return a TokenLifetimePolicyCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/tokenlifetimepolicy-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public TokenLifetimePolicyCollectionResponse get() {
        return get(null);
    }
    /**
     * Get a list of tokenLifetimePolicy objects.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a TokenLifetimePolicyCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/tokenlifetimepolicy-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public TokenLifetimePolicyCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, TokenLifetimePolicyCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a new tokenLifetimePolicy object.
     * @param body The request body
     * @return a TokenLifetimePolicy
     * @see <a href="https://learn.microsoft.com/graph/api/tokenlifetimepolicy-post-tokenlifetimepolicies?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public TokenLifetimePolicy post(@jakarta.annotation.Nonnull final TokenLifetimePolicy body) {
        return post(body, null);
    }
    /**
     * Create a new tokenLifetimePolicy object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a TokenLifetimePolicy
     * @see <a href="https://learn.microsoft.com/graph/api/tokenlifetimepolicy-post-tokenlifetimepolicies?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public TokenLifetimePolicy post(@jakarta.annotation.Nonnull final TokenLifetimePolicy body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, TokenLifetimePolicy::createFromDiscriminatorValue);
    }
    /**
     * Get a list of tokenLifetimePolicy objects.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a list of tokenLifetimePolicy objects.
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
     * Create a new tokenLifetimePolicy object.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final TokenLifetimePolicy body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new tokenLifetimePolicy object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final TokenLifetimePolicy body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a TokenLifetimePoliciesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public TokenLifetimePoliciesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new TokenLifetimePoliciesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get a list of tokenLifetimePolicy objects.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Include count of items
         */
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @jakarta.annotation.Nullable
        public Integer top;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a Map<String, Object>
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24count", count);
            allQueryParams.put("%24filter", filter);
            allQueryParams.put("%24search", search);
            allQueryParams.put("%24skip", skip);
            allQueryParams.put("%24top", top);
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24orderby", orderby);
            allQueryParams.put("%24select", select);
            return allQueryParams;
        }
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}