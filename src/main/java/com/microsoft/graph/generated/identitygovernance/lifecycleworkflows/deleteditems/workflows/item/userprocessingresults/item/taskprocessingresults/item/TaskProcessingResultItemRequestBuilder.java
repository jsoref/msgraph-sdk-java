package com.microsoft.graph.identitygovernance.lifecycleworkflows.deleteditems.workflows.item.userprocessingresults.item.taskprocessingresults.item;

import com.microsoft.graph.identitygovernance.lifecycleworkflows.deleteditems.workflows.item.userprocessingresults.item.taskprocessingresults.item.microsoftgraphidentitygovernanceresume.MicrosoftGraphIdentityGovernanceResumeRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.deleteditems.workflows.item.userprocessingresults.item.taskprocessingresults.item.subject.SubjectRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.deleteditems.workflows.item.userprocessingresults.item.taskprocessingresults.item.task.TaskRequestBuilder;
import com.microsoft.graph.models.identitygovernance.TaskProcessingResult;
import com.microsoft.graph.models.odataerrors.ODataError;
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
 * Provides operations to manage the taskProcessingResults property of the microsoft.graph.identityGovernance.userProcessingResult entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TaskProcessingResultItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the resume method.
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphIdentityGovernanceResumeRequestBuilder microsoftGraphIdentityGovernanceResume() {
        return new MicrosoftGraphIdentityGovernanceResumeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the subject property of the microsoft.graph.identityGovernance.taskProcessingResult entity.
     */
    @jakarta.annotation.Nonnull
    public SubjectRequestBuilder subject() {
        return new SubjectRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the task property of the microsoft.graph.identityGovernance.taskProcessingResult entity.
     */
    @jakarta.annotation.Nonnull
    public TaskRequestBuilder task() {
        return new TaskRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new TaskProcessingResultItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TaskProcessingResultItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/deletedItems/workflows/{workflow%2Did}/userProcessingResults/{userProcessingResult%2Did}/taskProcessingResults/{taskProcessingResult%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new TaskProcessingResultItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TaskProcessingResultItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/deletedItems/workflows/{workflow%2Did}/userProcessingResults/{userProcessingResult%2Did}/taskProcessingResults/{taskProcessingResult%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * The associated individual task execution.
     * @return a TaskProcessingResult
     */
    @jakarta.annotation.Nullable
    public TaskProcessingResult get() {
        return get(null);
    }
    /**
     * The associated individual task execution.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a TaskProcessingResult
     */
    @jakarta.annotation.Nullable
    public TaskProcessingResult get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, TaskProcessingResult::createFromDiscriminatorValue);
    }
    /**
     * The associated individual task execution.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The associated individual task execution.
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a TaskProcessingResultItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public TaskProcessingResultItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new TaskProcessingResultItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * The associated individual task execution.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a Map<String, Object>
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
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
}