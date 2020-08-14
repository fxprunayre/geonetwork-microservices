/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.0-beta).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.geonetwork_opensource.rest.ogc.api;

import java.math.BigDecimal;
import org.geonetwork_opensource.rest.ogc.model.CollectionInfo;
import org.geonetwork_opensource.rest.ogc.model.Content;
import org.geonetwork_opensource.rest.ogc.model.Exception;
import org.geonetwork_opensource.rest.ogc.model.ReqClasses;
import org.geonetwork_opensource.rest.ogc.model.Root;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-07-01T11:33:57.311+02:00[Europe/Paris]")
@Api(value = "Capabilities", description = "the Capabilities API")
public interface CapabilitiesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /collections/{collectionId} : describe the {collectionId} collection
     *
     * @param collectionId Identifier (name) of a specific collection (required)
     * @return Metadata about the {collectionId} collection shared by this API. (status code 200)
     *         or An error occured. (status code 200)
     */
    @ApiOperation(value = "describe the {collectionId} collection", nickname = "describeCollection", notes = "", response = CollectionInfo.class, tags={ "Capabilities", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Metadata about the {collectionId} collection shared by this API.", response = CollectionInfo.class),
        @ApiResponse(code = 200, message = "An error occured.", response = Exception.class) })
    @RequestMapping(value = "/collections/{collectionId}",
        produces = { "application/json", "text/html" }, 
        method = RequestMethod.GET)
    default ResponseEntity<CollectionInfo> describeCollection(@ApiParam(value = "Identifier (name) of a specific collection",required=true) @PathVariable("collectionId") String collectionId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"extent\" : { \"trs\" : \"http://www.opengis.net/def/uom/ISO-8601/0/Gregorian\", \"crs\" : \"http://www.opengis.net/def/crs/OGC/1.3/CRS84\", \"spatial\" : [ -180, -90, 180, 90 ], \"temporal\" : [ \"2011-11-11T12:22:11.000Z\", \"2012-11-24T12:32:43.000Z\" ] }, \"crs\" : [ \"crs\", \"crs\" ], \"name\" : \"buildings\", \"description\" : \"Buildings in the city of Bonn.\", \"links\" : [ { \"href\" : \"http://data.example.org/collections/buildings/items\", \"rel\" : \"item\", \"type\" : \"application/geo+json\", \"title\" : \"Buildings\" }, { \"href\" : \"http://example.org/concepts/building.html\", \"rel\" : \"describedBy\", \"type\" : \"text/html\", \"title\" : \"Coverage for buildings\" } ], \"title\" : \"Buildings\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /collections : describe the collections in the dataset
     *
     * @param limit The optional limit parameter limits the number of items that are presented in the response document.  Only items are counted that are on the first level of the collection in the response document. Nested objects contained within the explicitly requested items shall not be counted.  * Minimum &#x3D; 1 * Maximum &#x3D; 10000 * Default &#x3D; 10  (optional, default to 10)
     * @param bbox Only collections that have a geometry that intersects the bounding box are selected. The bounding box is provided as four or six numbers, depending on whether the coordinate reference system includes a vertical axis (elevation or depth): * Lower left corner, coordinate axis 1 * Lower left corner, coordinate axis 2 * Lower left corner, coordinate axis 3 (optional) * Upper right corner, coordinate axis 1 * Upper right corner, coordinate axis 2 * Upper right corner, coordinate axis 3 (optional) The coordinate reference system of the values is WGS84 longitude/latitude (http://www.opengis.net/def/crs/OGC/1.3/CRS84) unless a different coordinate reference system is specified in the parameter &#x60;bbox-crs&#x60;. For WGS84 longitude/latitude the values are in most cases the sequence of minimum longitude, minimum latitude, maximum longitude and maximum latitude. However, in cases where the box spans the antimeridian the first value (west-most box edge) is larger than the third value (east-most box edge). If a collection has multiple spatial geometry properties, it is the decision of the server whether only a single spatial geometry property is used to determine the extent or all relevant geometries.  (optional, default to new ArrayList&lt;&gt;())
     * @param time Either a date-time or a period string that adheres to RFC 3339. Examples: * A date-time: \&quot;2018-02-12T23:20:50Z\&quot; * A period: \&quot;2018-02-12T00:00:00Z/2018-03-18T12:31:12Z\&quot; or \&quot;2018-02-12T00:00:00Z/P1M6DT12H31M12S\&quot; Only collections that have a temporal property that intersects the value of &#x60;time&#x60; are selected. If a collection has multiple temporal properties, it is the decision of the server whether only a single temporal property is used to determine the extent or all relevant temporal properties. (optional)
     * @return Metdata about the collections shared by this API. (status code 200)
     *         or An error occured. (status code 200)
     */
    @ApiOperation(value = "describe the collections in the dataset", nickname = "describeCollections", notes = "", response = Content.class, tags={ "Capabilities", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Metdata about the collections shared by this API.", response = Content.class),
        @ApiResponse(code = 200, message = "An error occured.", response = Exception.class) })
    @RequestMapping(value = "/collections",
        produces = { "application/json", "text/html" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Content> describeCollections(@ApiParam(value = "The optional limit parameter limits the number of items that are presented in the response document.  Only items are counted that are on the first level of the collection in the response document. Nested objects contained within the explicitly requested items shall not be counted.  * Minimum = 1 * Maximum = 10000 * Default = 10 ", defaultValue = "10")  @RequestParam(value = "limit", required = false, defaultValue="10") Integer limit,@ApiParam(value = "Only collections that have a geometry that intersects the bounding box are selected. The bounding box is provided as four or six numbers, depending on whether the coordinate reference system includes a vertical axis (elevation or depth): * Lower left corner, coordinate axis 1 * Lower left corner, coordinate axis 2 * Lower left corner, coordinate axis 3 (optional) * Upper right corner, coordinate axis 1 * Upper right corner, coordinate axis 2 * Upper right corner, coordinate axis 3 (optional) The coordinate reference system of the values is WGS84 longitude/latitude (http://www.opengis.net/def/crs/OGC/1.3/CRS84) unless a different coordinate reference system is specified in the parameter `bbox-crs`. For WGS84 longitude/latitude the values are in most cases the sequence of minimum longitude, minimum latitude, maximum longitude and maximum latitude. However, in cases where the box spans the antimeridian the first value (west-most box edge) is larger than the third value (east-most box edge). If a collection has multiple spatial geometry properties, it is the decision of the server whether only a single spatial geometry property is used to determine the extent or all relevant geometries. ")  @RequestParam(value = "bbox", required = false) List<BigDecimal> bbox,@ApiParam(value = "Either a date-time or a period string that adheres to RFC 3339. Examples: * A date-time: \"2018-02-12T23:20:50Z\" * A period: \"2018-02-12T00:00:00Z/2018-03-18T12:31:12Z\" or \"2018-02-12T00:00:00Z/P1M6DT12H31M12S\" Only collections that have a temporal property that intersects the value of `time` are selected. If a collection has multiple temporal properties, it is the decision of the server whether only a single temporal property is used to determine the extent or all relevant temporal properties.")  @RequestParam(value = "time", required = false) String time) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"collections\" : [ { \"extent\" : { \"trs\" : \"http://www.opengis.net/def/uom/ISO-8601/0/Gregorian\", \"crs\" : \"http://www.opengis.net/def/crs/OGC/1.3/CRS84\", \"spatial\" : [ -180, -90, 180, 90 ], \"temporal\" : [ \"2011-11-11T12:22:11.000Z\", \"2012-11-24T12:32:43.000Z\" ] }, \"crs\" : [ \"crs\", \"crs\" ], \"name\" : \"buildings\", \"description\" : \"Buildings in the city of Bonn.\", \"links\" : [ { \"href\" : \"http://data.example.org/collections/buildings/items\", \"rel\" : \"item\", \"type\" : \"application/geo+json\", \"title\" : \"Buildings\" }, { \"href\" : \"http://example.org/concepts/building.html\", \"rel\" : \"describedBy\", \"type\" : \"text/html\", \"title\" : \"Coverage for buildings\" } ], \"title\" : \"Buildings\" }, { \"extent\" : { \"trs\" : \"http://www.opengis.net/def/uom/ISO-8601/0/Gregorian\", \"crs\" : \"http://www.opengis.net/def/crs/OGC/1.3/CRS84\", \"spatial\" : [ -180, -90, 180, 90 ], \"temporal\" : [ \"2011-11-11T12:22:11.000Z\", \"2012-11-24T12:32:43.000Z\" ] }, \"crs\" : [ \"crs\", \"crs\" ], \"name\" : \"buildings\", \"description\" : \"Buildings in the city of Bonn.\", \"links\" : [ { \"href\" : \"http://data.example.org/collections/buildings/items\", \"rel\" : \"item\", \"type\" : \"application/geo+json\", \"title\" : \"Buildings\" }, { \"href\" : \"http://example.org/concepts/building.html\", \"rel\" : \"describedBy\", \"type\" : \"text/html\", \"title\" : \"Coverage for buildings\" } ], \"title\" : \"Buildings\" } ], \"links\" : [ { \"href\" : \"http://data.example.org/collections.json\", \"rel\" : \"self\", \"type\" : \"application/json\", \"title\" : \"this document\" }, { \"href\" : \"http://data.example.org/collections.html\", \"rel\" : \"alternate\", \"type\" : \"text/html\", \"title\" : \"this document as HTML\" }, { \"href\" : \"http://schemas.example.org/1.0/foobar.xsd\", \"rel\" : \"describedBy\", \"type\" : \"application/xml\", \"title\" : \"XML schema for Acme Corporation data\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET / : landing page of this API
     * The landing page provides links to the API definition, the Conformance statements and the metadata about the coverage data in this dataset.
     *
     * @return links to the API capabilities (status code 200)
     */
    @ApiOperation(value = "landing page of this API", nickname = "getLandingPage", notes = "The landing page provides links to the API definition, the Conformance statements and the metadata about the coverage data in this dataset.", response = Root.class, tags={ "Capabilities", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "links to the API capabilities", response = Root.class) })
    @RequestMapping(value = "/",
        produces = { "application/json", "text/html" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Root> getLandingPage() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"links\" : [ { \"href\" : \"http://data.example.org/\", \"rel\" : \"self\", \"type\" : \"application/json\", \"title\" : \"this document\" }, { \"href\" : \"http://data.example.org/api\", \"rel\" : \"service\", \"type\" : \"application/openapi+json;version=3.0\", \"title\" : \"the API definition\" }, { \"href\" : \"http://data.example.org/conformance\", \"rel\" : \"conformance\", \"type\" : \"application/json\", \"title\" : \"OGC conformance classes implemented by this API\" }, { \"href\" : \"http://data.example.org/collections\", \"title\" : \"Metadata about the resource collections\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /conformance : information about standards that this API conforms to
     * list all requirements classes specified in a standard (e.g., ) that the server conforms to
     *
     * @return the URIs of all requirements classes supported by the server (status code 200)
     *         or An error occured. (status code 200)
     */
    @ApiOperation(value = "information about standards that this API conforms to", nickname = "getRequirementsClasses", notes = "list all requirements classes specified in a standard (e.g., ) that the server conforms to", response = ReqClasses.class, tags={ "Capabilities", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "the URIs of all requirements classes supported by the server", response = ReqClasses.class),
        @ApiResponse(code = 200, message = "An error occured.", response = Exception.class) })
    @RequestMapping(value = "/conformance",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<ReqClasses> getRequirementsClasses() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"conformsTo\" : [ \"http://www.opengis.net/spec/ogcapi-common/1.0/conf/core\", \"http://www.opengis.net/spec/ogcapi-common/1.0/conf/collections\", \"http://www.opengis.net/spec/ogcapi-common/1.0/conf/oas3\", \"http://www.opengis.net/spec/ogcapi-common/1.0/conf/html\", \"http://www.opengis.net/spec/ogcapi-common/1.0/conf/geojson\", \"http://www.opengis.net/spec/ogcapi-coverages/1.0/conf/core\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}