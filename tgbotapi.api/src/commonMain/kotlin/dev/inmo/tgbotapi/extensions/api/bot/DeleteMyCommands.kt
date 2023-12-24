package dev.inmo.tgbotapi.extensions.api.bot

import dev.inmo.micro_utils.language_codes.IetfLang
import dev.inmo.tgbotapi.bot.TelegramBot
import dev.inmo.tgbotapi.requests.bot.DeleteMyCommands
import dev.inmo.tgbotapi.types.commands.BotCommandScope
import dev.inmo.tgbotapi.types.commands.BotCommandScopeDefault

suspend fun TelegramBot.deleteMyCommands(
    scope: BotCommandScope = BotCommandScopeDefault,
    languageCode: IetfLang?
) = execute(DeleteMyCommands(scope, languageCode))

suspend fun TelegramBot.deleteMyCommands(
    scope: BotCommandScope = BotCommandScopeDefault,
    languageCode: String? = null
) = deleteMyCommands(scope, languageCode ?.let(::IetfLang))
