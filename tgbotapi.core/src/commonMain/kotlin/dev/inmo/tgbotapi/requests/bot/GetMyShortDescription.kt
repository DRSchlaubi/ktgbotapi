package dev.inmo.tgbotapi.requests.bot

import dev.inmo.micro_utils.language_codes.IetfLang
import dev.inmo.micro_utils.language_codes.IetfLangSerializer

import dev.inmo.tgbotapi.requests.abstracts.SimpleRequest
import dev.inmo.tgbotapi.types.*
import dev.inmo.tgbotapi.types.abstracts.WithOptionalLanguageCode
import dev.inmo.tgbotapi.types.commands.*
import kotlinx.serialization.*
import kotlinx.serialization.builtins.serializer

@Serializable
class GetMyShortDescription(
    @SerialName(languageCodeField)
    @Serializable(IetfLangSerializer::class)
    override val ietfLanguageCode: IetfLang? = null
) : SimpleRequest<BotShortDescription>, WithOptionalLanguageCode {
    override fun method(): String = "getMyShortDescription"
    override val resultDeserializer: DeserializationStrategy<BotShortDescription>
        get() = BotShortDescription.serializer()
    override val requestSerializer: SerializationStrategy<*>
        get() = serializer()
}
