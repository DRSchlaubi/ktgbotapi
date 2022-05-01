package dev.inmo.tgbotapi.extensions.api.edit.LiveLocation

import dev.inmo.tgbotapi.bot.TelegramBot
import dev.inmo.tgbotapi.extensions.api.edit.location.live.stopLiveLocation
import dev.inmo.tgbotapi.requests.edit.location.live.StopChatMessageLiveLocation
import dev.inmo.tgbotapi.types.ChatIdentifier
import dev.inmo.tgbotapi.types.MessageIdentifier
import dev.inmo.tgbotapi.types.buttons.InlineKeyboardMarkup
import dev.inmo.tgbotapi.types.chat.Chat
import dev.inmo.tgbotapi.types.message.abstracts.ContentMessage
import dev.inmo.tgbotapi.types.message.content.LocationContent

/**
 * @param replyMarkup Some [InlineKeyboardMarkup]. See [dev.inmo.tgbotapi.extensions.utils.types.buttons.inlineKeyboard]
 * as a builder for that
 */
@Deprecated("Replaced", ReplaceWith("stopLiveLocation", "dev.inmo.tgbotapi.extensions.api.edit.location.live.stopLiveLocation"))
suspend fun TelegramBot.stopLiveLocation(
    chatId: ChatIdentifier,
    messageId: MessageIdentifier,
    replyMarkup: InlineKeyboardMarkup? = null
) = stopLiveLocation(chatId, messageId, replyMarkup)

/**
 * @param replyMarkup Some [InlineKeyboardMarkup]. See [dev.inmo.tgbotapi.extensions.utils.types.buttons.inlineKeyboard]
 * as a builder for that
 */
@Deprecated("Replaced", ReplaceWith("stopLiveLocation", "dev.inmo.tgbotapi.extensions.api.edit.location.live.stopLiveLocation"))
suspend fun TelegramBot.stopLiveLocation(
    chat: Chat,
    messageId: MessageIdentifier,
    replyMarkup: InlineKeyboardMarkup? = null
) = stopLiveLocation(chat, messageId, replyMarkup)

/**
 * @param replyMarkup Some [InlineKeyboardMarkup]. See [dev.inmo.tgbotapi.extensions.utils.types.buttons.inlineKeyboard]
 * as a builder for that
 */
@Deprecated("Replaced", ReplaceWith("stopLiveLocation", "dev.inmo.tgbotapi.extensions.api.edit.location.live.stopLiveLocation"))
suspend fun TelegramBot.stopLiveLocation(
    message: ContentMessage<LocationContent>,
    replyMarkup: InlineKeyboardMarkup? = null
) = stopLiveLocation(message, replyMarkup)
