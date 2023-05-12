package com.microsoft.graph.models.externalconnectors;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DisplayTemplate implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The text identifier for the display template; for example, contosoTickets. Maximum 16 characters. Only alphanumeric characters allowed. */
    private String id;
    /** The layout property */
    private Json layout;
    /** The OdataType property */
    private String odataType;
    /** Defines the priority of a display template. A display template with priority 1 is evaluated before a template with priority 4. Gaps in priority values are supported. Must be positive value. */
    private Integer priority;
    /** Specifies additional rules for selecting this display template based on the item schema. Optional. */
    private java.util.List<PropertyRule> rules;
    /**
     * Instantiates a new displayTemplate and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DisplayTemplate() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a displayTemplate
     */
    @javax.annotation.Nonnull
    public static DisplayTemplate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DisplayTemplate();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("layout", (n) -> { this.setLayout(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        deserializerMap.put("rules", (n) -> { this.setRules(n.getCollectionOfObjectValues(PropertyRule::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The text identifier for the display template; for example, contosoTickets. Maximum 16 characters. Only alphanumeric characters allowed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the layout property value. The layout property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getLayout() {
        return this.layout;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the priority property value. Defines the priority of a display template. A display template with priority 1 is evaluated before a template with priority 4. Gaps in priority values are supported. Must be positive value.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Gets the rules property value. Specifies additional rules for selecting this display template based on the item schema. Optional.
     * @return a propertyRule
     */
    @javax.annotation.Nullable
    public java.util.List<PropertyRule> getRules() {
        return this.rules;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("id", this.getId());
        writer.writeObjectValue("layout", this.getLayout());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeCollectionOfObjectValues("rules", this.getRules());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the id property value. The text identifier for the display template; for example, contosoTickets. Maximum 16 characters. Only alphanumeric characters allowed.
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the layout property value. The layout property
     * @param value Value to set for the layout property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLayout(@javax.annotation.Nullable final Json value) {
        this.layout = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the priority property value. Defines the priority of a display template. A display template with priority 1 is evaluated before a template with priority 4. Gaps in priority values are supported. Must be positive value.
     * @param value Value to set for the priority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPriority(@javax.annotation.Nullable final Integer value) {
        this.priority = value;
    }
    /**
     * Sets the rules property value. Specifies additional rules for selecting this display template based on the item schema. Optional.
     * @param value Value to set for the rules property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRules(@javax.annotation.Nullable final java.util.List<PropertyRule> value) {
        this.rules = value;
    }
}
