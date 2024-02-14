package com.microsoft.graph.models;

import com.microsoft.graph.models.partners.billing.Billing;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Partners extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Partners} and sets the default values.
     */
    public Partners() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Partners}
     */
    @jakarta.annotation.Nonnull
    public static Partners createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Partners();
    }
    /**
     * Gets the billing property value. Represents billing details for billed and unbilled data.
     * @return a {@link Billing}
     */
    @jakarta.annotation.Nullable
    public Billing getBilling() {
        return this.backingStore.get("billing");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("billing", (n) -> { this.setBilling(n.getObjectValue(Billing::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("billing", this.getBilling());
    }
    /**
     * Sets the billing property value. Represents billing details for billed and unbilled data.
     * @param value Value to set for the billing property.
     */
    public void setBilling(@jakarta.annotation.Nullable final Billing value) {
        this.backingStore.set("billing", value);
    }
}
