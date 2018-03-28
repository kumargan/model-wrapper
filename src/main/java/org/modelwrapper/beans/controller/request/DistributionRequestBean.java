
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
    "types",
    "pageviews",
    "options"
})
public class DistributionRequestBean {

    @JsonProperty("types")
    private List<String> types = null;
    @JsonProperty("pageviews")
    private String pageviews;
    @JsonProperty("options")
    private Options options;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("types")
    public List<String> getTypes() {
        return types;
    }

    @JsonProperty("types")
    public void setTypes(List<String> types) {
        this.types = types;
    }

    @JsonProperty("pageviews")
    public String getPageviews() {
        return pageviews;
    }

    @JsonProperty("pageviews")
    public void setPageviews(String pageviews) {
        this.pageviews = pageviews;
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
