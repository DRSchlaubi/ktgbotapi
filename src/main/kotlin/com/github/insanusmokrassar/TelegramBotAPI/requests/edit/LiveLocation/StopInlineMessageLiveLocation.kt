package com.github.insanusmokrassar.TelegramBotAPI.requests.edit.LiveLocation

import com.github.insanusmokrassar.TelegramBotAPI.requests.edit.abstracts.EditInlineMessage
import com.github.insanusmokrassar.TelegramBotAPI.requests.edit.abstracts.EditReplyMessage
import com.github.insanusmokrassar.TelegramBotAPI.types.*
import com.github.insanusmokrassar.TelegramBotAPI.types.buttons.InlineKeyboardMarkup
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StopInlineMessageLiveLocation(
    @SerialName(inlineMessageIdField)
    override val inlineMessageId: InlineMessageIdentifier,
    @SerialName(replyMarkupField)
    override val replyMarkup: InlineKeyboardMarkup? = null
) : EditInlineMessage, EditReplyMessage {
    override fun method(): String = "stopMessageLiveLocation"
}
