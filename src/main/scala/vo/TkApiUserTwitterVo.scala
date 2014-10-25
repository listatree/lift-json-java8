package com.talenteca.api.vo

case class TkApiUserTwitterVo(
	user_id: Option[String],
	twitter_id: String,
	oauth_token: String,
	oauth_token_secret: String,
	default: Boolean,
	screen_name: String,
	name: String,
	location: Option[String],
	profile_image_url: Option[String],
	profile_image_url_https: Option[String],
	purpose: String,
	inactive: Option[Boolean] = Some(false),
	merger_account_twitter: Option[Boolean] = Some(false))