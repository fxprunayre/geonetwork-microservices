package org.geonetwork_opensource.rest.ogc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ReqClasses
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-07-01T11:33:57.311+02:00[Europe/Paris]")
public class ReqClasses   {
  @JsonProperty("conformsTo")
  
  private List<String> conformsTo = new ArrayList<>();

  public ReqClasses conformsTo(List<String> conformsTo) {
    this.conformsTo = conformsTo;
    return this;
  }

  public ReqClasses addConformsToItem(String conformsToItem) {
    this.conformsTo.add(conformsToItem);
    return this;
  }

  /**
   * Get conformsTo
   * @return conformsTo
  */
  @ApiModelProperty(example = "[\"http://www.opengis.net/spec/ogcapi-common/1.0/conf/core\",\"http://www.opengis.net/spec/ogcapi-common/1.0/conf/collections\",\"http://www.opengis.net/spec/ogcapi-common/1.0/conf/oas3\",\"http://www.opengis.net/spec/ogcapi-common/1.0/conf/html\",\"http://www.opengis.net/spec/ogcapi-common/1.0/conf/geojson\",\"http://www.opengis.net/spec/ogcapi-coverages/1.0/conf/core\"]", required = true, value = "")
  public List<String> getConformsTo() {
    return conformsTo;
  }

  public void setConformsTo(List<String> conformsTo) {
    this.conformsTo = conformsTo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReqClasses reqClasses = (ReqClasses) o;
    return Objects.equals(this.conformsTo, reqClasses.conformsTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conformsTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReqClasses {\n");
    
    sb.append("    conformsTo: ").append(toIndentedString(conformsTo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

