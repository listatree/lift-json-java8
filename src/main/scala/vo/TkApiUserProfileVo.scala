package com.talenteca.api.vo

case class TkApiUserProfileVo(
	fullname: String,
	city: Option[String] = None,
	country: Option[String] = None,
  location: Option[String] = None,
	postal_code: Option[String] = None,
	picture_uri: Option[String] = None,
	position: Option[String] = None,
	company_name: Option[String] = None,
	company_logo_uri: Option[String] = None,
	summary_public: Option[String]= None,
	fullnameWithoutSpace: Option[String] = None,
	public_profile_uri: Option[String] = None)