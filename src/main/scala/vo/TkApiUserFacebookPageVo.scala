package com.talenteca.api.vo

case class TkApiUserFacebookPageVo(
	id: Option[String],
	user_id: Option[String],
	name: String,
	about: Option[String],
	category: String,
	likes: Long,
	link: String,
	access_token: String,
	website: Option[String],
	pictureUrl: Option[String],
	inactive: Option[Boolean] = Some(false))