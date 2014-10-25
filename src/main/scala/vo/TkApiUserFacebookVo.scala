package com.talenteca.api.vo

case class TkApiUserFacebookVo(
	user_id: Option[String],
	facebook_id: String,
	access_token: String,
	default: Boolean,
	expiration: Long,
	email: Option[String],
	firstname: String,
	lastname: String,
	profile_image_url: Option[String],
	inactive: Option[Boolean] = Some(false),
	merger_account_facebook: Option[Boolean] = Some(false))