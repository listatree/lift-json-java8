package com.talenteca.api.vo

case class TkApiUserVo(
	id: Option[String],
	email: Option[String],
	password: Option[String],
	confirmed_email: Option[Boolean] = None,
	completed_signup: Option[Boolean] = None,
	profile: TkApiUserProfileVo,
	linkedin: List[TkApiUserLinkedInVo] = Nil,
	facebook: List[TkApiUserFacebookVo] = Nil,
	facebook_pages: List[TkApiUserFacebookPageVo] = Nil,
	twitter: List[TkApiUserTwitterVo] = Nil,
	googleplus: List[TkApiUserGooglePlusVo] = Nil,
	created_at: Option[Long] = None,
	modified_at: Option[Long] = None,
	roles: List[String] = Nil,
	currency: Option[String] = None,
	plan_payment_ok: Option[Boolean] = None,
	plan_name: Option[String] = None,
	plan_id: Option[String] = None,
	plan_features: Option[TkApiPlanFeaturesVo] = None)