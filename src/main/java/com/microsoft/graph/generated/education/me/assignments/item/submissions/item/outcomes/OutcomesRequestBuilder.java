package com.microsoft.graph.education.me.assignments.item.submissions.item.outcomes;

import com.microsoft.graph.education.me.assignments.item.submissions.item.outcomes.count.CountRequestBuilder;
import com.microsoft.graph.education.me.assignments.item.submissions.item.outcomes.item.EducationOutcomeItemRequestBuilder;
import com.microsoft.graph.models.EducationOutcome;
import com.microsoft.graph.models.EducationOutcomeCollectionResponse;
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
 * Provides operations to manage the outcomes property of the microsoft.graph.educationSubmission entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OutcomesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the outcomes property of the microsoft.graph.educationSubmission entity.
     * @param educationOutcomeId The unique identifier of educationOutcome
     * @return a EducationOutcomeItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public EducationOutcomeItemRequestBuilder byEducationOutcomeId(@jakarta.annotation.Nonnull final String educationOutcomeId) {
        Objects.requireNonNull(educationOutcomeId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("educationOutcome%2Did", educationOutcomeId);
        return new EducationOutcomeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new OutcomesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OutcomesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/education/me/assignments/{educationAssignment%2Did}/submissions/{educationSubmission%2Did}/outcomes{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new OutcomesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OutcomesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/education/me/assignments/{educationAssignment%2Did}/submissions/{educationSubmission%2Did}/outcomes{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Retrieve a list of educationOutcome objects. There are four types of outcomes: educationPointsOutcome, educationFeedbackOutcome, educationRubricOutcome, and educationFeedbackResourceOutcome. Only teachers, students, and applications with application permissions can perform this operation. A submission for a credit assignment (one that has no point value and no rubric) has an educationFeedbackOutcome. (It might also return an educationPointsOutcome, but that outcome is ignored.) A submission for a points assignment (one that has a point value assigned) has both an educationFeedbackOutcome and an educationPointsOutcome. A submission for an assignment with an attached rubric, if the rubric is a credit rubric (no points), has an educationFeedbackOutcome and an educationRubricOutcome. (It might also return an educationPointsOutcome, but that outcome is ignored.) A submission for an assignment with an attached rubric, if the rubric is a points rubric, has an educationFeedbackOutcome, an educationPointsOutcome, and an educationRubricOutcome. A submission for a feedback resource has an educationFeedbackResourceOutcome. All outcome types have a regular and a published property appropriate to that type of outcome; for example, points and publishedPoints, feedback and publishedFeedback. The regular property is the most recent value updated by the teacher; the published property is the most recent value returned to the student.
     * @return a EducationOutcomeCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/educationsubmission-list-outcomes?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public EducationOutcomeCollectionResponse get() {
        return get(null);
    }
    /**
     * Retrieve a list of educationOutcome objects. There are four types of outcomes: educationPointsOutcome, educationFeedbackOutcome, educationRubricOutcome, and educationFeedbackResourceOutcome. Only teachers, students, and applications with application permissions can perform this operation. A submission for a credit assignment (one that has no point value and no rubric) has an educationFeedbackOutcome. (It might also return an educationPointsOutcome, but that outcome is ignored.) A submission for a points assignment (one that has a point value assigned) has both an educationFeedbackOutcome and an educationPointsOutcome. A submission for an assignment with an attached rubric, if the rubric is a credit rubric (no points), has an educationFeedbackOutcome and an educationRubricOutcome. (It might also return an educationPointsOutcome, but that outcome is ignored.) A submission for an assignment with an attached rubric, if the rubric is a points rubric, has an educationFeedbackOutcome, an educationPointsOutcome, and an educationRubricOutcome. A submission for a feedback resource has an educationFeedbackResourceOutcome. All outcome types have a regular and a published property appropriate to that type of outcome; for example, points and publishedPoints, feedback and publishedFeedback. The regular property is the most recent value updated by the teacher; the published property is the most recent value returned to the student.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a EducationOutcomeCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/educationsubmission-list-outcomes?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public EducationOutcomeCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, EducationOutcomeCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a new feedback resource for a submission. Only a teacher can perform this operation. To create a new file-based resource, upload the file to the feedback resources folder associated with the assignment. If the file doesn't exist or isn't in that folder, the POST request will fail.
     * @param body The request body
     * @return a EducationOutcome
     * @see <a href="https://learn.microsoft.com/graph/api/educationfeedbackresourceoutcome-post-outcomes?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public EducationOutcome post(@jakarta.annotation.Nonnull final EducationOutcome body) {
        return post(body, null);
    }
    /**
     * Create a new feedback resource for a submission. Only a teacher can perform this operation. To create a new file-based resource, upload the file to the feedback resources folder associated with the assignment. If the file doesn't exist or isn't in that folder, the POST request will fail.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a EducationOutcome
     * @see <a href="https://learn.microsoft.com/graph/api/educationfeedbackresourceoutcome-post-outcomes?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public EducationOutcome post(@jakarta.annotation.Nonnull final EducationOutcome body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, EducationOutcome::createFromDiscriminatorValue);
    }
    /**
     * Retrieve a list of educationOutcome objects. There are four types of outcomes: educationPointsOutcome, educationFeedbackOutcome, educationRubricOutcome, and educationFeedbackResourceOutcome. Only teachers, students, and applications with application permissions can perform this operation. A submission for a credit assignment (one that has no point value and no rubric) has an educationFeedbackOutcome. (It might also return an educationPointsOutcome, but that outcome is ignored.) A submission for a points assignment (one that has a point value assigned) has both an educationFeedbackOutcome and an educationPointsOutcome. A submission for an assignment with an attached rubric, if the rubric is a credit rubric (no points), has an educationFeedbackOutcome and an educationRubricOutcome. (It might also return an educationPointsOutcome, but that outcome is ignored.) A submission for an assignment with an attached rubric, if the rubric is a points rubric, has an educationFeedbackOutcome, an educationPointsOutcome, and an educationRubricOutcome. A submission for a feedback resource has an educationFeedbackResourceOutcome. All outcome types have a regular and a published property appropriate to that type of outcome; for example, points and publishedPoints, feedback and publishedFeedback. The regular property is the most recent value updated by the teacher; the published property is the most recent value returned to the student.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve a list of educationOutcome objects. There are four types of outcomes: educationPointsOutcome, educationFeedbackOutcome, educationRubricOutcome, and educationFeedbackResourceOutcome. Only teachers, students, and applications with application permissions can perform this operation. A submission for a credit assignment (one that has no point value and no rubric) has an educationFeedbackOutcome. (It might also return an educationPointsOutcome, but that outcome is ignored.) A submission for a points assignment (one that has a point value assigned) has both an educationFeedbackOutcome and an educationPointsOutcome. A submission for an assignment with an attached rubric, if the rubric is a credit rubric (no points), has an educationFeedbackOutcome and an educationRubricOutcome. (It might also return an educationPointsOutcome, but that outcome is ignored.) A submission for an assignment with an attached rubric, if the rubric is a points rubric, has an educationFeedbackOutcome, an educationPointsOutcome, and an educationRubricOutcome. A submission for a feedback resource has an educationFeedbackResourceOutcome. All outcome types have a regular and a published property appropriate to that type of outcome; for example, points and publishedPoints, feedback and publishedFeedback. The regular property is the most recent value updated by the teacher; the published property is the most recent value returned to the student.
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
     * Create a new feedback resource for a submission. Only a teacher can perform this operation. To create a new file-based resource, upload the file to the feedback resources folder associated with the assignment. If the file doesn't exist or isn't in that folder, the POST request will fail.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final EducationOutcome body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new feedback resource for a submission. Only a teacher can perform this operation. To create a new file-based resource, upload the file to the feedback resources folder associated with the assignment. If the file doesn't exist or isn't in that folder, the POST request will fail.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final EducationOutcome body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a OutcomesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public OutcomesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new OutcomesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Retrieve a list of educationOutcome objects. There are four types of outcomes: educationPointsOutcome, educationFeedbackOutcome, educationRubricOutcome, and educationFeedbackResourceOutcome. Only teachers, students, and applications with application permissions can perform this operation. A submission for a credit assignment (one that has no point value and no rubric) has an educationFeedbackOutcome. (It might also return an educationPointsOutcome, but that outcome is ignored.) A submission for a points assignment (one that has a point value assigned) has both an educationFeedbackOutcome and an educationPointsOutcome. A submission for an assignment with an attached rubric, if the rubric is a credit rubric (no points), has an educationFeedbackOutcome and an educationRubricOutcome. (It might also return an educationPointsOutcome, but that outcome is ignored.) A submission for an assignment with an attached rubric, if the rubric is a points rubric, has an educationFeedbackOutcome, an educationPointsOutcome, and an educationRubricOutcome. A submission for a feedback resource has an educationFeedbackResourceOutcome. All outcome types have a regular and a published property appropriate to that type of outcome; for example, points and publishedPoints, feedback and publishedFeedback. The regular property is the most recent value updated by the teacher; the published property is the most recent value returned to the student.
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