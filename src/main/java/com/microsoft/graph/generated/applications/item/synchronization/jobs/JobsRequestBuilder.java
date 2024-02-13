package com.microsoft.graph.applications.item.synchronization.jobs;

import com.microsoft.graph.applications.item.synchronization.jobs.count.CountRequestBuilder;
import com.microsoft.graph.applications.item.synchronization.jobs.item.SynchronizationJobItemRequestBuilder;
import com.microsoft.graph.applications.item.synchronization.jobs.validatecredentials.ValidateCredentialsRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.SynchronizationJob;
import com.microsoft.graph.models.SynchronizationJobCollectionResponse;
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
 * Provides operations to manage the jobs property of the microsoft.graph.synchronization entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JobsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the validateCredentials method.
     */
    @jakarta.annotation.Nonnull
    public ValidateCredentialsRequestBuilder validateCredentials() {
        return new ValidateCredentialsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the jobs property of the microsoft.graph.synchronization entity.
     * @param synchronizationJobId The unique identifier of synchronizationJob
     * @return a SynchronizationJobItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SynchronizationJobItemRequestBuilder bySynchronizationJobId(@jakarta.annotation.Nonnull final String synchronizationJobId) {
        Objects.requireNonNull(synchronizationJobId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("synchronizationJob%2Did", synchronizationJobId);
        return new SynchronizationJobItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new JobsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public JobsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/applications/{application%2Did}/synchronization/jobs{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new JobsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public JobsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/applications/{application%2Did}/synchronization/jobs{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * List existing jobs for a given application instance (service principal).
     * @return a SynchronizationJobCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/synchronization-synchronization-list-jobs?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SynchronizationJobCollectionResponse get() {
        return get(null);
    }
    /**
     * List existing jobs for a given application instance (service principal).
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a SynchronizationJobCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/synchronization-synchronization-list-jobs?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SynchronizationJobCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SynchronizationJobCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create new synchronization job with a default synchronization schema. The job is created in a disabled state. Call Start job to start synchronization.
     * @param body The request body
     * @return a SynchronizationJob
     * @see <a href="https://learn.microsoft.com/graph/api/synchronization-synchronization-post-jobs?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SynchronizationJob post(@jakarta.annotation.Nonnull final SynchronizationJob body) {
        return post(body, null);
    }
    /**
     * Create new synchronization job with a default synchronization schema. The job is created in a disabled state. Call Start job to start synchronization.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a SynchronizationJob
     * @see <a href="https://learn.microsoft.com/graph/api/synchronization-synchronization-post-jobs?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SynchronizationJob post(@jakarta.annotation.Nonnull final SynchronizationJob body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SynchronizationJob::createFromDiscriminatorValue);
    }
    /**
     * List existing jobs for a given application instance (service principal).
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List existing jobs for a given application instance (service principal).
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
     * Create new synchronization job with a default synchronization schema. The job is created in a disabled state. Call Start job to start synchronization.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SynchronizationJob body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new synchronization job with a default synchronization schema. The job is created in a disabled state. Call Start job to start synchronization.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SynchronizationJob body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a JobsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public JobsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new JobsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * List existing jobs for a given application instance (service principal).
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