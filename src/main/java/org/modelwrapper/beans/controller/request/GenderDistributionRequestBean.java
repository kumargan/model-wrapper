
package org.modelwrapper.beans.controller.request;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "brands",
    "options"
})
public class GenderDistributionRequestBean {

    @JsonProperty("brands")
    private List<Brand> brands = null;
    @JsonProperty("options")
    private Options options;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("brands")
    public List<Brand> getBrands() {
        return brands;
    }

    @JsonProperty("brands")
    public void setBrands(List<Brand> brands) {
        this.brands = brands;
    }

    @JsonProperty("options")
    public Options getOptions() {
        return options;
    }

    @JsonProperty("options")
    public void setOptions(Options options) {
        this.options = options;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
