import com.talenteca.api.vo.TkApiUserVo
import net.liftweb.json._

object LiftJsonJava8 extends App {

	implicit val defaults = DefaultFormats

	val jsonString = """{
  "id": "537285219g010191001ca16f",
  "email": "xxxxxxx@xxxxxxxxx",
  "password": "wMxhYEY51H0H9444jO1WHeAex7nJWMcD1i9ETJ1DEO9Yftkh90",
  "confirmed_email": true,
  "completed_signup": true,
  "profile": {
    "fullname": "xwxwxwxwxwxwx",
    "country": "es",
    "location": "Barcelona, España ",
    "picture_uri": "TK_USER_LINKEDIN_PIC2014_09_04_11_39_11-95278750531366081667.jpg",
    "position": "IT Manager",
    "company_name": "Empresa de tecnologías y servicios",
    "company_logo_uri": "TK_USER_LINKEDIN_PIC2014_09_04_11_39_11-38625578487734664955.png",
    "summary_public": "Co-Founder Talenteca",
    "fullnameWithoutSpace": "carlos-saltos",
    "public_profile_uri": "carlos-saltos"
  },
  "linkedin": [{
    "linkedin_id": "M9Uv6AbRQ-",
    "access_token": "XKCtAys9WuksyVhUAkt6z1Q1rTOlIxOoU2mowRZmJ69N2k4YiaSsiNnLJdul8Uc7HLRpkxPW05Mpt9WZza8WuHWP0GSLjjF1Bs1OPs9Xwj71812oVx2CUG7du02OgruYNTcsE21Zy1InRRxX20ANPk22vbQP3MtsH32R6VXti375yYpI3ID33WqhyTMbrZOrCSpDS73g6V4CqxRejSr6FMoqli7qBas+fQFX73KFHrtAkKJpAYPCpphIc/dPLbq91uKIXuOhncuu/dL386mXvVwT7P",
    "default": false,
    "expiration": 1417490548935,
    "email": "xxxxxxxx@xxxxxx",
    "firstname": "Carlos",
    "lastname": "Saltos",
    "public_profile_url": "https://www.linkedin.com/in/csaltos",
    "profile_image_url": "TK_USER_LINKEDIN_PIC2014_08_13_10_09_02-24688668985945859668.jpg",
    "inactive": false,
    "merger_account_linkedin": true
  }],
  "facebook": [{
    "user_id": "a9798a692b29b92b0c6f2c66",
    "facebook_id": "099551415",
    "access_token": "cgoae4kaM2ta4lkajHbHTbwbgmwypjEJ0KEn1S8c4R93ExUOVKog9R34dAMgVZnhLxUuEZQMyAKLOe9EHhfB5o4OXU1aeUWx1SV0bSb3ti7O2fu6YWnZDH1ATDF1lGY1DqCMNHZbe5WC7J4f1GKkDuH531Kpjl5Dpf9HjYASoaX5VuaNmhsifv0AwwrjhDT5eOw1zDMYwcBsg5wP9roEBxxvwQgKinpgETLr36I1IS1vW1a1KLhux4Nyoi3Uc8p10NQG18nszZt9I89cfYDsxK8fsKUvgh0c48PyCA1CIijM8yc4gr80KMhpwyZlNEwIT83hw1",
    "default": false,
    "expiration": 1418817671648,
    "email": "xxxxxxx@xxxxxxxxx",
    "firstname": "xxxxxx",
    "lastname": "xxxxxx",
    "profile_image_url": "https://fbcdn-profile-a.akamaihd.net/hprofile-ak-xpa1/v/t1.0-1/s120x120/15618212_20134552450756515_6847047247956227192_n.jpg?oh=a225a9cbad7bc9bcbaca5cb6b08c9800&oe=42A41211&__gda__=1121143172_d2286823a423a9207119002401f31112",
    "inactive": false,
    "merger_account_facebook": true
  }],
  "facebook_pages": [],
  "twitter": [{
    "user_id": "54318544321af1f5222c2722",
    "twitter_id": "01289510",
    "oauth_token": "71515233-csmy2fx2x0y111md1s12e23daa3172mWJI2j5262x",
    "oauth_token_secret": "cLMCc2ybddJtztgjKrCZBDwygh7wtHZDCQ7Te/boDxySQPaDfGxyER0wsL0YyiXvtrGMmOsvy3geMLfa9KPzWmez9",
    "default": false,
    "screen_name": "xxxxxxx",
    "name": "xxxxxxxxxxxxx",
    "location": "Barcelona",
    "profile_image_url": "http://pbs.twimg.com/profile_images/172802023643702fa2/f279274858075d053bb265d9864813a1_normal.jpeg",
    "profile_image_url_https": "https://pbs.twimg.com/profile_images/178200500344102142/4d755778340834046bb46b298a48b3a6_normal.jpeg",
    "purpose": "for_sharing",
    "inactive": false,
    "merger_account_twitter": true
  }],
  "googleplus": [{
    "user_id": "a27225112f3404a7afdbf1a",
    "googleplus_id": "b082a17a0013132120247",
    "access_token": "xfxgQfZgCrgu1e1ep26B5Fw523dEI5h656ig6Rm70YP7K227fDsx/o0++oLNlLC7xAx1hmcLFyEtOsnQY7GE1kvb0yCeEaVSBGaeaUkVWargISjabu/i5QLy8b6vtR14Yd2DBvSIBmF4WeZxGb2fh5vuyW4yGfeLTf14BfprYdr76uWJ1uq6UccKPdwCE6D65qJvSiwV61BiwF5xq7k0uQ7pSVDRj6duCDeuR6VK9xuceTrAxa",
    "default": true,
    "expiration": 1409220209757,
    "email": "xxxxxxc@xxxxxxxxx",
    "fullname": "xxxxxxxxxxxxx",
    "inactive": false
  }],
  "created_at": 1400014257316,
  "modified_at": 1413842824462,
  "roles": ["admin"],
  "plan_payment_ok": true,
  "plan_name": "PROFESIONAL",
  "plan_id": "5400e1f812b1232c443e4751",
  "plan_features": {
    "job_ads_max": 5,
    "share_job_ads_enabled": true,
    "job_ads_crawlers_enabled": true,
    "recruiter_profile_enabled": true,
    "sharing_content_enabled": true,
    "stats_enabled": true,
    "recruiter_community_enabled": true,
    "ads_enabled": true
  }
}"""

	val total1 = 20000
	val total2 = 10

	def run1(test: Int, counter: Int, list: List[TkApiUserVo]): Unit = {
		if (counter > total1) {
			println("Run " + test + " complete")
		} else {
			val jsonAst = JsonParser.parse(jsonString)
			val scalaObject = jsonAst.extract[TkApiUserVo]
			run1(test, counter + 1, scalaObject :: list)
		}
	}

	def run2(counter: Int): Unit = {
		if (counter > total2) {
			println("Test complete")
		} else {
			run1(counter, 0, Nil)
			run2(counter + 1)
		}
	}

	println("Running test")
	run2(0)
}
