package com.talenteca.api.vo

case class TkApiUserLinkedInVo(
	user_id: Option[String],
	linkedin_id: String,
	access_token: String,
	default: Boolean,
	expiration: Long,
	email: Option[String],
	firstname: String,
	lastname: String,
	public_profile_url: Option[String],
	profile_image_url: Option[String],
	inactive: Option[Boolean] = Some(false),
	merger_account_linkedin: Option[Boolean] = Some(false))