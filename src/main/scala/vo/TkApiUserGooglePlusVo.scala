package com.talenteca.api.vo

case class TkApiUserGooglePlusVo(
	user_id: Option[String],
	googleplus_id: String,
	access_token: String,
	default: Boolean,
	expiration: Long,
	email: Option[String],
	fullname: String,
	inactive: Option[Boolean] = Some(false))