package mini.max.reddit.data.network.model

import com.squareup.moshi.Json
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
data class Data(

    @field:Json(name = "secure_media")
    val secureMedia: SecureMedia? = null,

    @field:Json(name = "link_flair_richtext")
    val linkFlairRichtext: List<Any?>? = null,

    @field:Json(name = "link_flair_background_color")
    val linkFlairBackgroundColor: String? = null,

    @field:Json(name = "author_flair_richtext")
    val authorFlairRichtext: List<Any?>? = null,

    @field:Json(name = "saved")
    val saved: Boolean? = null,

    @field:Json(name = "over_18")
    val over18: Boolean? = null,

    @field:Json(name = "hide_score")
    val hideScore: Boolean? = null,

    @field:Json(name = "subreddit")
    val subreddit: String? = null,

    @field:Json(name = "subreddit_id")
    val subredditId: String? = null,

    @field:Json(name = "score")
    val score: Int? = null,

    @field:Json(name = "suggested_sort")
    val suggestedSort: Any? = null,

    @field:Json(name = "num_comments")
    val numComments: Int? = null,

    @field:Json(name = "mod_reason_title")
    val modReasonTitle: Any? = null,

    @field:Json(name = "whitelist_status")
    val whitelistStatus: String? = null,

    @field:Json(name = "can_gild")
    val canGild: Boolean? = null,

    @field:Json(name = "is_robot_indexable")
    val isRobotIndexable: Boolean? = null,

    @field:Json(name = "spoiler")
    val spoiler: Boolean? = null,

    @field:Json(name = "post_hint")
    val postHint: String? = null,

    @field:Json(name = "id")
    val id: String? = null,

    @field:Json(name = "locked")
    val locked: Boolean? = null,

    @field:Json(name = "created_utc")
    val createdUtc: Int? = null,

    @field:Json(name = "link_flair_template_id")
    val linkFlairTemplateId: Any? = null,

    @field:Json(name = "likes")
    val likes: Any? = null,

    @field:Json(name = "banned_at_utc")
    val bannedAtUtc: Any? = null,

    @field:Json(name = "thumbnail")
    val thumbnail: String? = null,

    @field:Json(name = "downs")
    val downs: Int? = null,

    @field:Json(name = "edited")
    val edited: Boolean? = null,

    @field:Json(name = "created")
    val created: Int? = null,

    @field:Json(name = "author")
    val author: String? = null,

    @field:Json(name = "author_flair_background_color")
    val authorFlairBackgroundColor: Any? = null,

    @field:Json(name = "link_flair_text_color")
    val linkFlairTextColor: String? = null,

    @field:Json(name = "gildings")
    val gildings: Gildings? = null,

    @field:Json(name = "report_reasons")
    val reportReasons: Any? = null,

    @field:Json(name = "approved_by")
    val approvedBy: Any? = null,

    @field:Json(name = "is_video")
    val isVideo: Boolean? = null,

    @field:Json(name = "is_original_content")
    val isOriginalContent: Boolean? = null,

    @field:Json(name = "subreddit_name_prefixed")
    val subredditNamePrefixed: String? = null,

    @field:Json(name = "media_embed")
    val mediaEmbed: MediaEmbed? = null,

    @field:Json(name = "mod_reason_by")
    val modReasonBy: Any? = null,

    @field:Json(name = "domain")
    val domain: String? = null,

    @field:Json(name = "approved_at_utc")
    val approvedAtUtc: Any? = null,

    @field:Json(name = "name")
    val name: String? = null,

    @field:Json(name = "no_follow")
    val noFollow: Boolean? = null,

    @field:Json(name = "ups")
    val ups: Int? = null,

    @field:Json(name = "author_flair_type")
    val authorFlairType: String? = null,

    @field:Json(name = "media_only")
    val mediaOnly: Boolean? = null,

    @field:Json(name = "permalink")
    val permalink: String? = null,

    @field:Json(name = "content_categories")
    val contentCategories: Any? = null,

    @field:Json(name = "wls")
    val wls: Int? = null,

    @field:Json(name = "author_flair_css_class")
    val authorFlairCssClass: Any? = null,

    @field:Json(name = "preview")
    val preview: Preview? = null,

    @field:Json(name = "num_reports")
    val numReports: Any? = null,

    @field:Json(name = "pinned")
    val pinned: Boolean? = null,

    @field:Json(name = "mod_reports")
    val modReports: List<Any?>? = null,

    @field:Json(name = "gilded")
    val gilded: Int? = null,

    @field:Json(name = "hidden")
    val hidden: Boolean? = null,

    @field:Json(name = "author_patreon_flair")
    val authorPatreonFlair: Boolean? = null,

    @field:Json(name = "mod_note")
    val modNote: Any? = null,

    @field:Json(name = "removal_reason")
    val removalReason: Any? = null,

    @field:Json(name = "media")
    val media: Media? = null,

    @field:Json(name = "title")
    val title: String? = null,

    @field:Json(name = "author_flair_text")
    val authorFlairText: Any? = null,

    @field:Json(name = "send_replies")
    val sendReplies: Boolean? = null,

    @field:Json(name = "archived")
    val archived: Boolean? = null,

    @field:Json(name = "author_flair_text_color")
    val authorFlairTextColor: Any? = null,

    @field:Json(name = "num_crossposts")
    val numCrossposts: Int? = null,

    @field:Json(name = "thumbnail_width")
    val thumbnailWidth: Int? = null,

    @field:Json(name = "can_mod_post")
    val canModPost: Boolean? = null,

    @field:Json(name = "secure_media_embed")
    val secureMediaEmbed: SecureMediaEmbed? = null,

    @field:Json(name = "is_self")
    val isSelf: Boolean? = null,

    @field:Json(name = "author_fullname")
    val authorFullname: String? = null,

    @field:Json(name = "link_flair_css_class")
    val linkFlairCssClass: Any? = null,

    @field:Json(name = "selftext")
    val selftext: String? = null,

    @field:Json(name = "link_flair_text")
    val linkFlairText: Any? = null,

    @field:Json(name = "selftext_html")
    val selftextHtml: Any? = null,

    @field:Json(name = "subreddit_type")
    val subredditType: String? = null,

    @field:Json(name = "is_meta")
    val isMeta: Boolean? = null,

    @field:Json(name = "user_reports")
    val userReports: List<Any?>? = null,

    @field:Json(name = "is_crosspostable")
    val isCrosspostable: Boolean? = null,

    @field:Json(name = "subreddit_subscribers")
    val subredditSubscribers: Int? = null,

    @field:Json(name = "distinguished")
    val distinguished: Any? = null,

    @field:Json(name = "clicked")
    val clicked: Boolean? = null,

    @field:Json(name = "author_flair_template_id")
    val authorFlairTemplateId: Any? = null,

    @field:Json(name = "url")
    val url: String? = null,

    @field:Json(name = "thumbnail_height")
    val thumbnailHeight: Int? = null,

    @field:Json(name = "parent_whitelist_status")
    val parentWhitelistStatus: String? = null,

    @field:Json(name = "stickied")
    val stickied: Boolean? = null,

    @field:Json(name = "link_flair_type")
    val linkFlairType: String? = null,

    @field:Json(name = "visited")
    val visited: Boolean? = null,

    @field:Json(name = "pwls")
    val pwls: Int? = null,

    @field:Json(name = "quarantine")
    val quarantine: Boolean? = null,

    @field:Json(name = "category")
    val category: Any? = null,

    @field:Json(name = "banned_by")
    val bannedBy: Any? = null,

    @field:Json(name = "contest_mode")
    val contestMode: Boolean? = null,

    @field:Json(name = "view_count")
    val viewCount: Any? = null,

    @field:Json(name = "is_reddit_media_domain")
    val isRedditMediaDomain: Boolean? = null
)