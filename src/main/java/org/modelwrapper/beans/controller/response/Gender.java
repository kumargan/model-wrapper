
package org.modelwrapper.beans.controller.response;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "1",
    "2",
    "O"
})
public class Gender {

    @JsonProperty("1")
    private Integer _1;
    @JsonProperty("2")
    private Integer _2;
    @JsonProperty("O")
    private Integer o;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("1")
    public Integer get1() {
        return _1;
    }

    @JsonProperty("1")
    public void set1(Integer _1) {
        this._1 = _1;
    }

    @JsonProperty("2")
    public Integer get2() {
        return _2;
    }

    @JsonProperty("2")
    public void set2(Integer _2) {
        this._2 = _2;
    }

    @JsonProperty("O")
    public Integer getO() {
        return o;
    }

    @JsonProperty("O")
    public void setO(Integer o) {
        this.o = o;
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
