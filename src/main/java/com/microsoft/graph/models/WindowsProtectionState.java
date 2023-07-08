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
import com.microsoft.graph.models.WindowsDeviceHealthState;
import com.microsoft.graph.models.WindowsDefenderProductStatus;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.WindowsDeviceMalwareStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Protection State.
 */
public class WindowsProtectionState extends Entity implements IJsonBackedObject {


    /**
     * The Anti Malware Version.
     * Current anti malware version
     */
    @SerializedName(value = "antiMalwareVersion", alternate = {"AntiMalwareVersion"})
    @Expose
	@Nullable
    public String antiMalwareVersion;

    /**
     * The Device State.
     * Computer's state (like clean or pending full scan or pending reboot etc). Possible values are: clean, fullScanPending, rebootPending, manualStepsPending, offlineScanPending, critical.
     */
    @SerializedName(value = "deviceState", alternate = {"DeviceState"})
    @Expose
	@Nullable
    public EnumSet<WindowsDeviceHealthState> deviceState;

    /**
     * The Engine Version.
     * Current endpoint protection engine's version
     */
    @SerializedName(value = "engineVersion", alternate = {"EngineVersion"})
    @Expose
	@Nullable
    public String engineVersion;

    /**
     * The Full Scan Overdue.
     * Full scan overdue or not?
     */
    @SerializedName(value = "fullScanOverdue", alternate = {"FullScanOverdue"})
    @Expose
	@Nullable
    public Boolean fullScanOverdue;

    /**
     * The Full Scan Required.
     * Full scan required or not?
     */
    @SerializedName(value = "fullScanRequired", alternate = {"FullScanRequired"})
    @Expose
	@Nullable
    public Boolean fullScanRequired;

    /**
     * The Is Virtual Machine.
     * Indicates whether the device is a virtual machine.
     */
    @SerializedName(value = "isVirtualMachine", alternate = {"IsVirtualMachine"})
    @Expose
	@Nullable
    public Boolean isVirtualMachine;

    /**
     * The Last Full Scan Date Time.
     * Last quick scan datetime
     */
    @SerializedName(value = "lastFullScanDateTime", alternate = {"LastFullScanDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastFullScanDateTime;

    /**
     * The Last Full Scan Signature Version.
     * Last full scan signature version
     */
    @SerializedName(value = "lastFullScanSignatureVersion", alternate = {"LastFullScanSignatureVersion"})
    @Expose
	@Nullable
    public String lastFullScanSignatureVersion;

    /**
     * The Last Quick Scan Date Time.
     * Last quick scan datetime
     */
    @SerializedName(value = "lastQuickScanDateTime", alternate = {"LastQuickScanDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastQuickScanDateTime;

    /**
     * The Last Quick Scan Signature Version.
     * Last quick scan signature version
     */
    @SerializedName(value = "lastQuickScanSignatureVersion", alternate = {"LastQuickScanSignatureVersion"})
    @Expose
	@Nullable
    public String lastQuickScanSignatureVersion;

    /**
     * The Last Reported Date Time.
     * Last device health status reported time
     */
    @SerializedName(value = "lastReportedDateTime", alternate = {"LastReportedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastReportedDateTime;

    /**
     * The Malware Protection Enabled.
     * Anti malware is enabled or not
     */
    @SerializedName(value = "malwareProtectionEnabled", alternate = {"MalwareProtectionEnabled"})
    @Expose
	@Nullable
    public Boolean malwareProtectionEnabled;

    /**
     * The Network Inspection System Enabled.
     * Network inspection system enabled or not?
     */
    @SerializedName(value = "networkInspectionSystemEnabled", alternate = {"NetworkInspectionSystemEnabled"})
    @Expose
	@Nullable
    public Boolean networkInspectionSystemEnabled;

    /**
     * The Product Status.
     * Product Status of Windows Defender Antivirus. Possible values are: noStatus, serviceNotRunning, serviceStartedWithoutMalwareProtection, pendingFullScanDueToThreatAction, pendingRebootDueToThreatAction, pendingManualStepsDueToThreatAction, avSignaturesOutOfDate, asSignaturesOutOfDate, noQuickScanHappenedForSpecifiedPeriod, noFullScanHappenedForSpecifiedPeriod, systemInitiatedScanInProgress, systemInitiatedCleanInProgress, samplesPendingSubmission, productRunningInEvaluationMode, productRunningInNonGenuineMode, productExpired, offlineScanRequired, serviceShutdownAsPartOfSystemShutdown, threatRemediationFailedCritically, threatRemediationFailedNonCritically, noStatusFlagsSet, platformOutOfDate, platformUpdateInProgress, platformAboutToBeOutdated, signatureOrPlatformEndOfLifeIsPastOrIsImpending, windowsSModeSignaturesInUseOnNonWin10SInstall.
     */
    @SerializedName(value = "productStatus", alternate = {"ProductStatus"})
    @Expose
	@Nullable
    public EnumSet<WindowsDefenderProductStatus> productStatus;

    /**
     * The Quick Scan Overdue.
     * Quick scan overdue or not?
     */
    @SerializedName(value = "quickScanOverdue", alternate = {"QuickScanOverdue"})
    @Expose
	@Nullable
    public Boolean quickScanOverdue;

    /**
     * The Real Time Protection Enabled.
     * Real time protection is enabled or not?
     */
    @SerializedName(value = "realTimeProtectionEnabled", alternate = {"RealTimeProtectionEnabled"})
    @Expose
	@Nullable
    public Boolean realTimeProtectionEnabled;

    /**
     * The Reboot Required.
     * Reboot required or not?
     */
    @SerializedName(value = "rebootRequired", alternate = {"RebootRequired"})
    @Expose
	@Nullable
    public Boolean rebootRequired;

    /**
     * The Signature Update Overdue.
     * Signature out of date or not?
     */
    @SerializedName(value = "signatureUpdateOverdue", alternate = {"SignatureUpdateOverdue"})
    @Expose
	@Nullable
    public Boolean signatureUpdateOverdue;

    /**
     * The Signature Version.
     * Current malware definitions version
     */
    @SerializedName(value = "signatureVersion", alternate = {"SignatureVersion"})
    @Expose
	@Nullable
    public String signatureVersion;

    /**
     * The Tamper Protection Enabled.
     * Indicates whether the Windows Defender tamper protection feature is enabled.
     */
    @SerializedName(value = "tamperProtectionEnabled", alternate = {"TamperProtectionEnabled"})
    @Expose
	@Nullable
    public Boolean tamperProtectionEnabled;

    /**
     * The Detected Malware State.
     * Device malware list
     */
    @SerializedName(value = "detectedMalwareState", alternate = {"DetectedMalwareState"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.WindowsDeviceMalwareStateCollectionPage detectedMalwareState;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("detectedMalwareState")) {
            detectedMalwareState = serializer.deserializeObject(json.get("detectedMalwareState"), com.microsoft.graph.requests.WindowsDeviceMalwareStateCollectionPage.class);
        }
    }
}