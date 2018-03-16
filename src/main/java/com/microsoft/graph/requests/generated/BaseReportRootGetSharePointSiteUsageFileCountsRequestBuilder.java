// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Report Root Get Share Point Site Usage File Counts Request Builder.
 */
public class BaseReportRootGetSharePointSiteUsageFileCountsRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this ReportRootGetSharePointSiteUsageFileCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public BaseReportRootGetSharePointSiteUsageFileCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetSharePointSiteUsageFileCountsRequest
     *
     * @return the IReportRootGetSharePointSiteUsageFileCountsRequest instance
     */
    public IReportRootGetSharePointSiteUsageFileCountsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetSharePointSiteUsageFileCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSharePointSiteUsageFileCountsRequest instance
     */
    public IReportRootGetSharePointSiteUsageFileCountsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ReportRootGetSharePointSiteUsageFileCountsRequest request = new ReportRootGetSharePointSiteUsageFileCountsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
