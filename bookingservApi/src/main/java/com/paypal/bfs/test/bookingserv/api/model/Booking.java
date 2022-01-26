package com.paypal.bfs.test.bookingserv.api.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.constraints.NotNull;


/**
 * Booking resource
 * <p>
 * Booking resource object
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "first_name",
        "last_name",
        "date_of_birth",
        "checkin_datetime",
        "checkout_datetime",
        "totalprice",
        "deposit",
        "address",
        "line1",
        "line2",
        "city",
        "state",
        "zipcode"
})
public class Booking {

    /**
     * Booking id
     *
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Booking id")
    private Integer id;
    /**
     * First name
     * (Required)
     *
     */
    @NotNull
    @JsonProperty("first_name")
    @JsonPropertyDescription("First name")
    private String firstName;
    /**
     * Last name
     * (Required)
     *
     */
    @NotNull
    @JsonProperty("last_name")
    @JsonPropertyDescription("Last name")
    private String lastName;
    /**
     * Date of Birth
     *
     */
    @JsonProperty("date_of_birth")
    @JsonPropertyDescription("Date of Birth")
    private String dateOfBirth;
    /**
     * Checkin datetime
     *
     */
    @JsonProperty("checkin_datetime")
    @JsonPropertyDescription("Checkin datetime")
    private String checkinDatetime;
    /**
     * Checkout datetime
     *
     */
    @JsonProperty("checkout_datetime")
    @JsonPropertyDescription("Checkout datetime")
    private String checkoutDatetime;
    /**
     * Total Price
     *
     */
    @JsonProperty("totalprice")
    @JsonPropertyDescription("Total Price")
    private Double totalprice;
    /**
     * Deposit
     *
     */
    @JsonProperty("deposit")
    @JsonPropertyDescription("Deposit")
    private Integer deposit;
    /**
     * Address
     *
     */
    @JsonProperty("address")
    @JsonPropertyDescription("Address")
    private String address;

    @JsonProperty("line1")
    private String line1;
    @JsonProperty("line2")
    private String line2;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("zipcode")
    private Integer zipcode;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Booking id
     *
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * Booking id
     *
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * First name
     * (Required)
     *
     */
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First name
     * (Required)
     *
     */
    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Last name
     * (Required)
     *
     */
    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last name
     * (Required)
     *
     */
    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Date of Birth
     *
     */
    @JsonProperty("date_of_birth")
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Date of Birth
     *
     */
    @JsonProperty("date_of_birth")
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Checkin datetime
     *
     * @param s
     */
    @JsonProperty("checkin_datetime")
    public String getCheckinDatetime(String s) {
        return checkinDatetime;
    }

    /**
     * Checkin datetime
     *
     */
    @JsonProperty("checkin_datetime")
    public void setCheckinDatetime(String checkinDatetime) {
        this.checkinDatetime = checkinDatetime;
    }

    /**
     * Checkout datetime
     *
     * @param s
     */
    @JsonProperty("checkout_datetime")
    public String getCheckoutDatetime(String s) {
        return checkoutDatetime;
    }

    /**
     * Checkout datetime
     *
     */
    @JsonProperty("checkout_datetime")
    public void setCheckoutDatetime(String checkoutDatetime) {
        this.checkoutDatetime = checkoutDatetime;
    }

    /**
     * Total Price
     *
     * @param v
     */
    @JsonProperty("totalprice")
    public Double getTotalprice(double v) {
        return totalprice;
    }

    /**
     * Total Price
     *
     */
    @JsonProperty("totalprice")
    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }

    /**
     * Deposit
     *
     * @param i
     */
    @JsonProperty("deposit")
    public Integer getDeposit(int i) {
        return deposit;
    }

    /**
     * Deposit
     *
     */
    @JsonProperty("deposit")
    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    /**
     * Address
     *
     */
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    /**
     * Address
     *
     */
    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("line1")
    public String getLine1(String s) {
        return line1;
    }

    @JsonProperty("line1")
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    @JsonProperty("line2")
    public String getLine2() {
        return line2;
    }

    @JsonProperty("line2")
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    @JsonProperty("city")
    public String getCity(String bangalore) {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("state")
    public String getState(String karnataka) {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("zipcode")
    public Integer getZipcode(int i) {
        return zipcode;
    }

    @JsonProperty("zipcode")
    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }


    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Booking.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("dateOfBirth");
        sb.append('=');
        sb.append(((this.dateOfBirth == null)?"<null>":this.dateOfBirth));
        sb.append(',');
        sb.append("checkinDatetime");
        sb.append('=');
        sb.append(((this.checkinDatetime == null)?"<null>":this.checkinDatetime));
        sb.append(',');
        sb.append("checkoutDatetime");
        sb.append('=');
        sb.append(((this.checkoutDatetime == null)?"<null>":this.checkoutDatetime));
        sb.append(',');
        sb.append("totalprice");
        sb.append('=');
        sb.append(((this.totalprice == null)?"<null>":this.totalprice));
        sb.append(',');
        sb.append("deposit");
        sb.append('=');
        sb.append(((this.deposit == null)?"<null>":this.deposit));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("line1");
        sb.append('=');
        sb.append(((this.line1 == null)?"<null>":this.line1));
        sb.append(',');
        sb.append("line2");
        sb.append('=');
        sb.append(((this.line2 == null)?"<null>":this.line2));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("zipcode");
        sb.append('=');
        sb.append(((this.zipcode == null)?"<null>":this.zipcode));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

