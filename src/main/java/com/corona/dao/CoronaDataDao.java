package com.corona.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CoronaDataDao {
	
	@Id
	private String userid;
	private Object bounds;
	private String confirmed_cases;
	private String confirmed_cases_display_string;
	private String deaths;
	private String deaths_display_string;
	private String has_sub_hierarchies_data;
	private String has_sub_hierarchies_per_day_data;
	private String icon_url;
	private String is_highlighted_location_id;
	private String is_visible;
	private String latitude;
	private String localized_locale_name;
	private String location_id;
	private String location_mid;
	private String location_type;
	private String longitude;
	private String recovered;
	private String recovered_display_string;
	private String sub_hierarchies_location_type;
	
	
	public Object getBounds() {
		return bounds;
	}

	public void setBounds(Object bounds) {
		this.bounds = bounds;
	}

	public String getConfirmed_cases() {
		return confirmed_cases;
	}

	public void setConfirmed_cases(String confirmed_cases) {
		this.confirmed_cases = confirmed_cases;
	}

	public String getConfirmed_cases_display_string() {
		return confirmed_cases_display_string;
	}

	public void setConfirmed_cases_display_string(String confirmed_cases_display_string) {
		this.confirmed_cases_display_string = confirmed_cases_display_string;
	}
	

	

	public String getDeaths() {
		return deaths;
	}

	public void setDeaths(String deaths) {
		this.deaths = deaths;
	}

	public String getDeaths_display_string() {
		return deaths_display_string;
	}

	public void setDeaths_display_string(String deaths_display_string) {
		this.deaths_display_string = deaths_display_string;
	}

	public String getHas_sub_hierarchies_data() {
		return has_sub_hierarchies_data;
	}

	public void setHas_sub_hierarchies_data(String has_sub_hierarchies_data) {
		this.has_sub_hierarchies_data = has_sub_hierarchies_data;
	}

	public String getHas_sub_hierarchies_per_day_data() {
		return has_sub_hierarchies_per_day_data;
	}

	public void setHas_sub_hierarchies_per_day_data(String has_sub_hierarchies_per_day_data) {
		this.has_sub_hierarchies_per_day_data = has_sub_hierarchies_per_day_data;
	}

	public String getIcon_url() {
		return icon_url;
	}

	public void setIcon_url(String icon_url) {
		this.icon_url = icon_url;
	}

	public String getIs_highlighted_location_id() {
		return is_highlighted_location_id;
	}

	public void setIs_highlighted_location_id(String is_highlighted_location_id) {
		this.is_highlighted_location_id = is_highlighted_location_id;
	}

	public String getIs_visible() {
		return is_visible;
	}

	public void setIs_visible(String is_visible) {
		this.is_visible = is_visible;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLocalized_locale_name() {
		return localized_locale_name;
	}

	public void setLocalized_locale_name(String localized_locale_name) {
		this.localized_locale_name = localized_locale_name;
	}

	public String getLocation_id() {
		return location_id;
	}

	public void setLocation_id(String location_id) {
		this.location_id = location_id;
	}

	public String getLocation_mid() {
		return location_mid;
	}

	public void setLocation_mid(String location_mid) {
		this.location_mid = location_mid;
	}

	public String getLocation_type() {
		return location_type;
	}

	public void setLocation_type(String location_type) {
		this.location_type = location_type;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getRecovered() {
		return recovered;
	}

	public void setRecovered(String recovered) {
		this.recovered = recovered;
	}

	public String getRecovered_display_string() {
		return recovered_display_string;
	}

	public void setRecovered_display_string(String recovered_display_string) {
		this.recovered_display_string = recovered_display_string;
	}

	public String getSub_hierarchies_location_type() {
		return sub_hierarchies_location_type;
	}

	public void setSub_hierarchies_location_type(String sub_hierarchies_location_type) {
		this.sub_hierarchies_location_type = sub_hierarchies_location_type;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

}
