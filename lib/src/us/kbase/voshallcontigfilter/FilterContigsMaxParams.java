
package us.kbase.voshallcontigfilter;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: FilterContigsMaxParams</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "workspace",
    "contigset_id",
    "min_length",
    "max_length"
})
public class FilterContigsMaxParams {

    @JsonProperty("workspace")
    private String workspace;
    @JsonProperty("contigset_id")
    private String contigsetId;
    @JsonProperty("min_length")
    private Long minLength;
    @JsonProperty("max_length")
    private Long maxLength;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("workspace")
    public String getWorkspace() {
        return workspace;
    }

    @JsonProperty("workspace")
    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public FilterContigsMaxParams withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    @JsonProperty("contigset_id")
    public String getContigsetId() {
        return contigsetId;
    }

    @JsonProperty("contigset_id")
    public void setContigsetId(String contigsetId) {
        this.contigsetId = contigsetId;
    }

    public FilterContigsMaxParams withContigsetId(String contigsetId) {
        this.contigsetId = contigsetId;
        return this;
    }

    @JsonProperty("min_length")
    public Long getMinLength() {
        return minLength;
    }

    @JsonProperty("min_length")
    public void setMinLength(Long minLength) {
        this.minLength = minLength;
    }

    public FilterContigsMaxParams withMinLength(Long minLength) {
        this.minLength = minLength;
        return this;
    }

    @JsonProperty("max_length")
    public Long getMaxLength() {
        return maxLength;
    }

    @JsonProperty("max_length")
    public void setMaxLength(Long maxLength) {
        this.maxLength = maxLength;
    }

    public FilterContigsMaxParams withMaxLength(Long maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((((((("FilterContigsMaxParams"+" [workspace=")+ workspace)+", contigsetId=")+ contigsetId)+", minLength=")+ minLength)+", maxLength=")+ maxLength)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
